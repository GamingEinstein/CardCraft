package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RNGItem extends Item {
    protected final int ROLL_MAX;
    protected final boolean IS_COIN;

    public RNGItem(int rollMax, boolean isCoin, Properties pProperties) {
        super(pProperties.stacksTo(16));
        ROLL_MAX = rollMax;
        IS_COIN = isCoin;
    }

    public RNGItem(int rollMax, Properties pProperties) {
        this(rollMax, false, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown())
            pTooltipComponents.add(Component.literal("This item can " +
                    (IS_COIN ? "be flipped for either Heads or Tails" : "be rolled for a random number between 1 and " + ROLL_MAX) + ". Perfect for deciding on a random outcome!").withStyle(ChatFormatting.DARK_AQUA));
        else
            pTooltipComponents.add(Component.literal("Hold " + ChatFormatting.WHITE + "SHIFT" + ChatFormatting.RESET + " for Details").withStyle(ChatFormatting.GRAY));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        /*
         *  This looks more complicated than it actually is
         *  Basically, it either rolls coins or dice, then outputs it to the chat
         *  It also works with stack sizes so people can simulate multiple rolls
         */
        if (!pLevel.isClientSide) {
            ArrayList<String> flips = new ArrayList<>();
            ArrayList<Integer> rolls = new ArrayList<>();
            StringBuilder output = new StringBuilder();
            boolean secretMessage = false;

            // Storing the RNG results in the appropriate ArrayList
            for (int i = 0; i < pPlayer.getItemInHand(pUsedHand).getCount(); i++) {
                if (IS_COIN)
                    flips.add(pPlayer.getRandom().nextInt(ROLL_MAX) + 1 == 1 ? "Heads" : "Tails");
                else {
                    rolls.add(pPlayer.getRandom().nextInt(1, ROLL_MAX + 1));
                    if (ROLL_MAX == 1 && pPlayer.getRandom().nextInt(1000000) == 0)
                        secretMessage = true; // Wonder how often people will get this... well 1 in a million, but RNG be RNG
                }
            }

            // Have a slightly different output depending on if it's a coin being flipped or a die being rolled
            if (IS_COIN) {
                HashMap<String, Integer> flipsCounts = new HashMap<>();

                for (String flip : flips)
                    flipsCounts.put(flip, flipsCounts.getOrDefault(flip, 0) + 1);

                // Make the message pretty
                int index = 0;
                for (Map.Entry<String, Integer> entry : flipsCounts.entrySet()) {
                    output.append(entry.getValue()).append("x '").append(entry.getKey()).append("'");
                    if (index < flipsCounts.size() - 1)
                        output.append(", ");
                    index++;
                }

                pPlayer.sendSystemMessage(Component.literal("Flipped: " + output));
            } else {
                HashMap<Integer, Integer> rollsCounts = new HashMap<>();

                for (Integer roll : rolls)
                    rollsCounts.put(roll, rollsCounts.getOrDefault(roll, 0) + 1);

                // Again, make the message pretty
                int index = 0;

                for (Map.Entry<Integer, Integer> entry : rollsCounts.entrySet()) {
                    output.append(entry.getValue()).append("x '").append(entry.getKey()).append("'");
                    if (index < rollsCounts.size() - 1)
                        output.append(", ");
                    index++;
                }

                pPlayer.sendSystemMessage(Component.literal("Rolled: " + output));
                // If the player rolled the 1 in a Million, say the message and give them a Base Trading Card (will probably be removed or modified in the future)
                if (secretMessage) {
                    pPlayer.displayClientMessage(Component.translatable("item.cardcraft.special_d1.secret_message").withStyle(ChatFormatting.LIGHT_PURPLE, ChatFormatting.ITALIC), false);
                    ItemHandlerHelper.giveItemToPlayer(pPlayer, new ItemStack(ModItems.BASE_TRADING_CARD.get()));
                }
            }
        }

        // pPlayer.awardStat(Stats.ITEM_USED.get(this));
        pLevel.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.WITCH_THROW, SoundSource.NEUTRAL, 0.4f,
                0.4f / (pPlayer.getRandom().nextFloat() * 0.4f + 0.8f));
        pPlayer.getCooldowns().addCooldown(this, 5);

        return InteractionResultHolder.sidedSuccess(pPlayer.getItemInHand(pUsedHand), canRepair);
    }
}
