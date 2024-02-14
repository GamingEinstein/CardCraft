package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CardItem extends Item {
    public CardItem(String cardName, Properties pProperties) {
        super(pProperties);
        CARD_NAME = cardName;
    }

    protected final String CARD_NAME;

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("item." + CardCraft.MOD_ID + "." + CARD_NAME + "_trading_card.tooltip_number").withStyle(ChatFormatting.AQUA));
        pTooltipComponents.add(Component.translatable("item." + CardCraft.MOD_ID + "." + CARD_NAME + "_trading_card.tooltip_description").withStyle(ChatFormatting.DARK_AQUA, ChatFormatting.ITALIC));
    }

    public String getCardName() {
        return CARD_NAME;
    }
}
