package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.config.CardCraftConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class TradingCardItem extends Item {
    protected final String CARD_NAME;
    protected final int CARD_NUMBER;
    protected final int[] CARD_STATS;
    protected final String CARD_BOOSTER_ID;
    protected final boolean IS_ILLEGAL;

    public TradingCardItem(String cardName, int cardNumber, @Nullable int[] cardStats, String cardBoosterID, boolean isIllegal, Properties pProperties) {
        super(pProperties);
        CARD_NAME = cardName;
        CARD_NUMBER = cardNumber;
        CARD_STATS = cardStats;
        CARD_BOOSTER_ID = cardBoosterID;
        IS_ILLEGAL = isIllegal;
    }

    public TradingCardItem(String cardName, int cardNumber, @Nullable int[] cardStats, String cardBoosterID, Properties pProperties) {
        this(cardName, cardNumber, cardStats, cardBoosterID, false, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        TextColor cardDetailsColor = TextColor.fromRgb(0xaaaaaa);
        Component cardDetailsDivider = Component.literal("===============").withStyle(ChatFormatting.WHITE, ChatFormatting.BOLD);

        pTooltipComponents.add(Component.literal("Hold [" + (Screen.hasShiftDown() ? ChatFormatting.WHITE : ChatFormatting.GRAY) + "SHIFT" + ChatFormatting.RESET + "] for Details").withStyle(ChatFormatting.GRAY));
        // Card Details
        // This entire thing is probably going to be replaced by a GUI when you press right-click on the card, kinda like a book of sorts but not really
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.literal(""));
            if (CardCraftConfig.showDetails) {
                pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.cost").withStyle(ChatFormatting.DARK_RED));
                pTooltipComponents.add(cardDetailsDivider);
                pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.type").withStyle(ChatFormatting.DARK_AQUA));
                pTooltipComponents.add(cardDetailsDivider);
                pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.effect").withStyle(ChatFormatting.DARK_GREEN));
                if (!CARD_NAME.contains("_token")) {
                    pTooltipComponents.add(Component.literal(""));
                    pTooltipComponents.add(Component.translatable("item.cardcraft." + CARD_NAME + "_trading_card.flavor_text").withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
                }
                if (CARD_STATS != null) {
                    pTooltipComponents.add(Component.literal(""));
                    pTooltipComponents.add(Component.literal(CARD_STATS[0] + " HP | " + CARD_STATS[1] + " DMG").withStyle(ChatFormatting.DARK_BLUE));
                }
                if (pIsAdvanced.isAdvanced() || IS_ILLEGAL) {
                    pTooltipComponents.add(cardDetailsDivider);
                    if (pIsAdvanced.isAdvanced())
                        pTooltipComponents.add(Component.translatable("cardcraft.card_text.set_" + CARD_BOOSTER_ID, CARD_NUMBER).withStyle(ChatFormatting.DARK_PURPLE));
                    if (IS_ILLEGAL)
                        pTooltipComponents.add(Component.translatable("cardcraft.card_text.illegal_card").withStyle(ChatFormatting.RED, ChatFormatting.BOLD));
                }
            }
            else
                pTooltipComponents.add(Component.translatable("cardcraft.card_text.details_disabled").withStyle(ChatFormatting.RED, ChatFormatting.BOLD));
        }
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return pStack.getRarity().equals(Rarity.EPIC);
    }
}
