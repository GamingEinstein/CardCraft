package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RNGItem extends Item {
    protected final int ROLL_MAX;
    protected final boolean IS_COIN;

    public RNGItem(int rollMax, boolean isCoin, Settings settings) {
        super(settings.maxCount(16));
        ROLL_MAX = rollMax;
        IS_COIN = isCoin;
    }

    public RNGItem(int rollMax, Settings settings) {
        this(rollMax, false, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Hold [" + (Screen.hasShiftDown() ? Formatting.WHITE : Formatting.GRAY) + "SHIFT" + Formatting.RESET + "] for Details").formatted(Formatting.GRAY));
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal(""));
            tooltip.add(Text.translatable("cardcraft.rng_item_text.details").formatted(Formatting.DARK_AQUA));
            if (IS_COIN)
                tooltip.add(Text.translatable("cardcraft.rng_item_text.details.coin").formatted(Formatting.DARK_AQUA));
            else
                tooltip.add(Text.translatable("cardcraft.rng_item_text.details.die", ROLL_MAX).formatted(Formatting.DARK_AQUA));
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        /*
         *  This looks more complicated than it actually is
         *  Basically, it either rolls coins or dice, then outputs it to the chat
         *  It also works with stack sizes so people can simulate multiple rolls
         */
        if (!world.isClient) {
            ArrayList<String> flips = new ArrayList<>();
            ArrayList<Integer> rolls = new ArrayList<>();
            StringBuilder output = new StringBuilder();
            boolean secretMessage = false;

            // Storing the RNG results in the appropriate ArrayList
            for (int i = 0; i < user.getStackInHand(hand).getCount(); i++) {
                if (IS_COIN)
                    flips.add(user.getRandom().nextInt(ROLL_MAX) + 1 == 1 ? "Heads" : "Tails");
                else {
                    rolls.add(user.getRandom().nextBetweenExclusive(1, ROLL_MAX + 1));
                    if (ROLL_MAX == 1 && user.getRandom().nextInt(1000000) == 0)
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

                user.sendMessage(Text.literal("Flipped: " + output));
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

                user.sendMessage(Text.literal("Rolled: " + output));
                // If the player rolled the 1 in a Million, say the message and give them a Base Trading Card (will probably be removed or modified in the future)
                if (secretMessage) {
                    user.sendMessage(Text.translatable("item.cardcraft.special_d1.secret_message").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC));
                    user.giveItemStack(new ItemStack(ModItems.DEV_TRADING_CARD));
                }
            }
        }

        // pPlayer.awardStat(Stats.ITEM_USED.get(this));
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_WITCH_THROW, SoundCategory.NEUTRAL, 0.4f,
                0.4f / (user.getRandom().nextFloat() * 0.4f + 0.8f));
        user.getItemCooldownManager().getCooldownProgress(this, 5);

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
