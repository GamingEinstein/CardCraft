package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.compat.PatchouliHandler;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RulebookItem extends Item {
    public RulebookItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Hold [" + (Screen.hasShiftDown() ? Formatting.WHITE : Formatting.GRAY) + "SHIFT" + Formatting.RESET + "] for Details").formatted(Formatting.GRAY));
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal(""));
            tooltip.add(Text.translatable("item.cardcraft.official_rulebook.details.line1").formatted(Formatting.DARK_AQUA));
            tooltip.add(Text.translatable("item.cardcraft.official_rulebook.details.line2").formatted(Formatting.DARK_AQUA));
            if (!CardCraft.patchouliLoaded)
                tooltip.add(Text.translatable("item.cardcraft.official_rulebook.details.patchouli_missing").formatted(Formatting.RED, Formatting.BOLD));
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (CardCraft.patchouliLoaded && user instanceof ServerPlayerEntity serverPlayer)
            PatchouliHandler.openBookGUI(serverPlayer);
            //pPlayer.displayClientMessage(Component.translatable("item.cardcraft.official_rulebook.details.patchouli_installed").withStyle(ChatFormatting.RED, ChatFormatting.BOLD), false); // This is only here to make sure runData works properly, since I have to comment out the previous line for some reason
        else if (!CardCraft.patchouliLoaded && world.isClient)
            user.sendMessage(Text.translatable("item.cardcraft.official_rulebook.details.patchouli_missing").formatted(Formatting.RED, Formatting.BOLD));

        return new TypedActionResult<>(ActionResult.CONSUME, stack);
    }
}
