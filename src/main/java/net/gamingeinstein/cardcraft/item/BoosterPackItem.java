package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class BoosterPackItem extends Item {

    public BoosterPackItem(String boosterName, Properties pProperties) {
        super(pProperties);
        BOOSTER_NAME = boosterName;
    }

    protected final String BOOSTER_NAME;

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("item." + CardCraft.MOD_ID + "." + BOOSTER_NAME + "_booster_pack.tooltip").withStyle(ChatFormatting.DARK_AQUA, ChatFormatting.ITALIC));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pLevel instanceof ServerLevel serverLevel) {
            pPlayer.getItemInHand(pUsedHand).shrink(1);

            ItemHandlerHelper.giveItemToPlayer(pPlayer, new ItemStack(ModItems.BASE_TRADING_CARD.get()));
        }

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}
