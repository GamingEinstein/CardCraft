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
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RulebookItem extends Item {
    public RulebookItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal("Hold [" + (Screen.hasShiftDown() ? ChatFormatting.WHITE : ChatFormatting.GRAY) + "SHIFT" + ChatFormatting.RESET + "] for Details").withStyle(ChatFormatting.GRAY));
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.literal(""));
            pTooltipComponents.add(Component.translatable("item.cardcraft.official_rulebook.details.line1").withStyle(ChatFormatting.DARK_AQUA));
            pTooltipComponents.add(Component.translatable("item.cardcraft.official_rulebook.details.line2").withStyle(ChatFormatting.DARK_AQUA));
            if (!CardCraft.patchouliLoaded)
                pTooltipComponents.add(Component.translatable("item.cardcraft.official_rulebook.details.patchouli_missing").withStyle(ChatFormatting.RED, ChatFormatting.BOLD));
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack stack = pPlayer.getItemInHand(pUsedHand);
        if (CardCraft.patchouliLoaded && pPlayer instanceof ServerPlayer serverPlayer)
            PatchouliHandler.openBookGUI(serverPlayer);
            //pPlayer.displayClientMessage(Component.translatable("item.cardcraft.official_rulebook.details.patchouli_installed").withStyle(ChatFormatting.RED, ChatFormatting.BOLD), false); // This is only here to make sure runData works properly, since I have to comment out the previous line for some reason
        else if (!CardCraft.patchouliLoaded && pLevel.isClientSide)
            pPlayer.displayClientMessage(Component.translatable("item.cardcraft.official_rulebook.details.patchouli_missing").withStyle(ChatFormatting.RED, ChatFormatting.BOLD), false);

        return new InteractionResultHolder<>(InteractionResult.CONSUME, stack);
    }
}
