package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CardItem extends Item {
    public CardItem(String cardName, int cardNumber, Properties pProperties) {
        super(pProperties);
        CARD_NAME = cardName;
        CARD_NUMBER = cardNumber;
    }

    protected final String CARD_NAME;
    protected final int CARD_NUMBER;

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown())
            pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.information").withStyle(ChatFormatting.DARK_AQUA));
        else
            pTooltipComponents.add(Component.literal("Hold SHIFT for info").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    }

    public String getCardName() {
        return CARD_NAME;
    }

    public int getCardNumber() {
        return CARD_NUMBER;
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}
