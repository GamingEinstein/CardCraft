package net.gamingeinstein.cardcraft.item;

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
    public CardItem(String cardName, int cardNumber, boolean isShiny, Properties pProperties) {
        super(pProperties);
        CARD_NAME = cardName;
        CARD_NUMBER = cardNumber;
        IS_SHINY = isShiny;
    }

    protected final String CARD_NAME;
    protected final int CARD_NUMBER;
    protected final boolean IS_SHINY;

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("cardcraft.text.placeholder").withStyle(ChatFormatting.RED, ChatFormatting.BOLD, ChatFormatting.UNDERLINE));
            pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.details.flavor_text").withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
        else
            pTooltipComponents.add(Component.literal("Hold SHIFT for Details").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    }

    public String getCardName() {
        return CARD_NAME;
    }

    public int getCardNumber() {
        return CARD_NUMBER;
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return IS_SHINY ? true : false;
    }
}
