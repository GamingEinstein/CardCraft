package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.config.CardCraftClientConfig;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TradingCardItem extends Item {
    protected final String CARD_NAME;
    protected final int CARD_NUMBER;
    protected final int[] CARD_STATS;
    protected final String CARD_BOOSTER_ID;
    protected final boolean IS_ILLEGAL;

    public TradingCardItem(String cardName, int cardNumber, @Nullable int[] cardStats, String cardBoosterID, boolean isIllegal, Settings settings) {
        super(settings);
        CARD_NAME = cardName;
        CARD_NUMBER = cardNumber;
        CARD_STATS = cardStats;
        CARD_BOOSTER_ID = cardBoosterID;
        IS_ILLEGAL = isIllegal;
    }

    public TradingCardItem(String cardName, int cardNumber, @Nullable int[] cardStats, String cardBoosterID, Settings settings) {
        this(cardName, cardNumber, cardStats, cardBoosterID, false, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        TextColor cardDetailsColor = TextColor.fromRgb(0xaaaaaa);
        Text cardDetailsDivider = Text.literal("===============").formatted(Formatting.WHITE, Formatting.BOLD);

        tooltip.add(Text.literal("Hold [" + (Screen.hasShiftDown() ? Formatting.WHITE : Formatting.GRAY) + "SHIFT" + Formatting.RESET + "] for Details").formatted(Formatting.GRAY));
        // Card Details
        // This entire thing is probably going to be replaced by a GUI when you press right-click on the card, kinda like a book of sorts but not really
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal(""));
            if (CardCraftClientConfig.SHOW_DETAILS.get()) {
                tooltip.add(Text.translatable("item.cardcraft." + CARD_NAME + "_trading_card.cost").formatted(Formatting.DARK_RED));
                tooltip.add(cardDetailsDivider);
                tooltip.add(Text.translatable("item.cardcraft." + CARD_NAME + "_trading_card.type").formatted(Formatting.DARK_AQUA));
                tooltip.add(cardDetailsDivider);
                tooltip.add(Text.translatable("item.cardcraft." + CARD_NAME + "_trading_card.effect").formatted(Formatting.DARK_GREEN));
                if (!CARD_NAME.contains("_token")) {
                    tooltip.add(Text.literal(""));
                    tooltip.add(Text.translatable("item.cardcraft." + CARD_NAME + "_trading_card.flavor_text").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
                }
                if (CARD_STATS != null) {
                    tooltip.add(Text.literal(""));
                    tooltip.add(Text.literal(CARD_STATS[0] + " HP | " + CARD_STATS[1] + " DMG").formatted(Formatting.DARK_BLUE));
                }
                if (context.isAdvanced() || IS_ILLEGAL) {
                    tooltip.add(cardDetailsDivider);
                    if (context.isAdvanced())
                        tooltip.add(Text.translatable("cardcraft.card_text.set_" + CARD_BOOSTER_ID, CARD_NUMBER).formatted(Formatting.DARK_PURPLE));
                    if (IS_ILLEGAL)
                        tooltip.add(Text.translatable("cardcraft.card_text.illegal_card").formatted(Formatting.RED, Formatting.BOLD));
                }
            }
            else
                tooltip.add(Text.translatable("cardcraft.card_text.details_disabled").formatted(Formatting.RED, Formatting.BOLD));
        }
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.getRarity().equals(Rarity.EPIC);
    }
}
