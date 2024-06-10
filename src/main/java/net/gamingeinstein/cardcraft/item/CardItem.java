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
    protected final int[] CARD_STATS;
    protected final boolean IS_ILLEGAL;

    public CardItem(String cardName, int cardNumber, @Nullable int[] cardStats, boolean isIllegal, Properties pProperties) {
        super(pProperties);
        CARD_NAME = cardName;
        CARD_NUMBER = cardNumber;
        CARD_STATS = cardStats;
        IS_ILLEGAL = isIllegal;
    }

    public CardItem(String cardName, int cardNumber, @Nullable int[] cardStats, Properties pProperties) {
        this(cardName, cardNumber, cardStats, false, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal("Hold [" + (Screen.hasShiftDown() ? ChatFormatting.WHITE : ChatFormatting.GRAY) + "SHIFT" + ChatFormatting.RESET + "] for Details").withStyle(ChatFormatting.GRAY));
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.type").withStyle(ChatFormatting.RED));
            if (CARD_STATS != null)
                pTooltipComponents.add(Component.literal(CARD_STATS[0] + " HP | " + CARD_STATS[1] + " DMG").withStyle(ChatFormatting.GREEN));
            pTooltipComponents.add(Component.literal("==============="));
            pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.cost").withStyle(ChatFormatting.AQUA));
            pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.effect").withStyle(ChatFormatting.GOLD));
            pTooltipComponents.add(Component.literal("==============="));
            pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.flavor_text").withStyle(ChatFormatting.DARK_PURPLE, ChatFormatting.ITALIC));
            if (IS_ILLEGAL)
                pTooltipComponents.add(Component.translatable("cardcraft.card_text.illegal_card").withStyle(ChatFormatting.RED, ChatFormatting.BOLD));
        }
    }

    public String getCardName() {
        return CARD_NAME;
    }

    public int getCardNumber() {
        return CARD_NUMBER;
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return pStack.getRarity().equals(Rarity.EPIC);
    }
}
