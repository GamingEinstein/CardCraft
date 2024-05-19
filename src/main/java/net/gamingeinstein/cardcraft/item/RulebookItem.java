package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.compat.PatchouliHandler;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RulebookItem extends Item {
    public RulebookItem(Properties properties) {
        super(properties.rarity(Rarity.RARE).stacksTo(1));
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown())
            pTooltipComponents.add(Component.literal("The All-in-One source for CardCraft! Contains information about getting Booster Packs, Card Information, how to play CardCraft, and more!").withStyle(ChatFormatting.DARK_AQUA));
        else
            pTooltipComponents.add(Component.literal("Hold " + ChatFormatting.WHITE + "SHIFT" + ChatFormatting.RESET + " for Details").withStyle(ChatFormatting.GRAY));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack stack = pPlayer.getItemInHand(pUsedHand);
        if (CardCraft.patchouliLoaded && pPlayer instanceof ServerPlayer serverPlayer)
            PatchouliHandler.openBookGUI(serverPlayer);
        else if (!CardCraft.patchouliLoaded && pLevel.isClientSide)
            pPlayer.displayClientMessage(Component.literal("It would appear that Patchouli isn't installed. In order to see the contents of this book, please install Patchouli (version here)"), false);

        return new InteractionResultHolder<>(InteractionResult.CONSUME, stack);
    }
}
