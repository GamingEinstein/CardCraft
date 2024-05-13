package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class BoosterPackItem extends Item {

    public BoosterPackItem(String boosterName, int boosterNumber, Properties pProperties) {
        super(pProperties);
        BOOSTER_NAME = boosterName;
        BOOSTER_NUMBER = boosterNumber;
    }

    protected final String BOOSTER_NAME;
    protected final int BOOSTER_NUMBER;

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown())
            pTooltipComponents.add(Component.translatable("item.cardcraft." + BOOSTER_NAME + "_booster_pack.information").withStyle(ChatFormatting.DARK_AQUA));
        else
            pTooltipComponents.add(Component.literal("Hold SHIFT for info").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    }

    public String getBoosterName() {
        return BOOSTER_NAME;
    }

    public int getBoosterNumber() {
        return BOOSTER_NUMBER;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pLevel instanceof ServerLevel serverLevel) {
            pPlayer.getItemInHand(pUsedHand).shrink(1);

            for (int i = 0; i < 3; i++) {
                ItemHandlerHelper.giveItemToPlayer(pPlayer, new ItemStack(getRandomCard(BOOSTER_NUMBER)));
            }
        }

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }

    private Item getRandomCard(int boosterNumber) {
        Random randomCard = new Random();
        randomCard.nextInt(1, 2);

        switch (boosterNumber)
        {
            case 1:
                return null;
            default:
                return ModItems.BASE_TRADING_CARD.get();
        }
    }
}
