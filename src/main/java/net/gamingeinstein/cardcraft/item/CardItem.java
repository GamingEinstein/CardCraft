package net.gamingeinstein.cardcraft.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class CardItem extends Item {
    protected final String CARD_NAME;
    protected final int CARD_NUMBER;
    protected final boolean IS_SHINY;
    protected final String CARD_TYPE;
    protected final int[] CARD_STATS;
    protected final String CARD_COST;
    protected final String CARD_EFFECT;
    protected final String CARD_FLAVOR_TEXT;

    public CardItem(String cardName, int cardNumber, boolean isShiny, String cardType, @Nullable int[] cardStats, String cardCost, String cardEffect, String cardFlavorText, Properties pProperties) {
        super(pProperties);
        CARD_NAME = cardName;
        CARD_NUMBER = cardNumber;
        IS_SHINY = isShiny;
        CARD_STATS = cardStats;
        CARD_TYPE = cardType;
        CARD_COST = cardCost;
        CARD_EFFECT = cardEffect;
        CARD_FLAVOR_TEXT = cardFlavorText;
    }
    public CardItem(String cardName, int cardNumber, String cardType, int[] cardStats, String cardCost, String cardEffect, String cardFlavorText, Properties pProperties) {
        this(cardName, cardNumber, false, cardType, cardStats, cardCost, cardEffect, cardFlavorText, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.literal(CARD_TYPE).withStyle(ChatFormatting.RED));
            if (CARD_STATS != null)
                pTooltipComponents.add(Component.literal(CARD_STATS[0] + " HP | " + CARD_STATS[1] + "/" + CARD_STATS[2]).withStyle(ChatFormatting.GREEN));
            pTooltipComponents.add(Component.literal("==============="));
            pTooltipComponents.add(Component.literal("Cost: " + CARD_COST).withStyle(ChatFormatting.AQUA));
            pTooltipComponents.add(Component.literal("Effect: " + CARD_EFFECT).withStyle(ChatFormatting.GOLD));
            pTooltipComponents.add(Component.literal("==============="));
            pTooltipComponents.add(Component.literal(CARD_FLAVOR_TEXT).withStyle(ChatFormatting.DARK_PURPLE, ChatFormatting.ITALIC));
        } else
            pTooltipComponents.add(Component.literal("Hold " + ChatFormatting.WHITE + "SHIFT" + ChatFormatting.RESET + " for Details").withStyle(ChatFormatting.GRAY));
    }

    public String getCardName() {
        return CARD_NAME;
    }

    public int getCardNumber() {
        return CARD_NUMBER;
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return pStack.getRarity().equals(Rarity.EPIC) || IS_SHINY;
    }
}
