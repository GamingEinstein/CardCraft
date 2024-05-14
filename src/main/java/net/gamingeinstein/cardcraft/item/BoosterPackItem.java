package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;

public class BoosterPackItem extends Item {
    protected final String BOOSTER_PACK_NAME;
    protected final int BOOSTER_PACK_NUMBER;
    protected final String BOOSTER_PACK_INFORMATION;

    public BoosterPackItem(String boosterPackName, int boosterPackNumber, String boosterPackInformation, Properties pProperties) {
        super(pProperties);
        BOOSTER_PACK_NAME = boosterPackName;
        BOOSTER_PACK_NUMBER = boosterPackNumber;
        BOOSTER_PACK_INFORMATION = boosterPackInformation;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown())
            pTooltipComponents.add(Component.literal(BOOSTER_PACK_INFORMATION).withStyle(ChatFormatting.DARK_AQUA));
        else
            pTooltipComponents.add(Component.literal("Hold SHIFT for Details").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    }

    public String getBoosterPackName() {
        return BOOSTER_PACK_NAME;
    }

    public int getBoosterPackNumber() {
        return BOOSTER_PACK_NUMBER;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pLevel instanceof ServerLevel serverLevel) {
            pPlayer.getItemInHand(pUsedHand).shrink(1);

            // Each Booster Pack gives 3 cards, unless it's the Dev Booster Pack (give 1 card in that case). Custom card count might come later
            for (int i = 0; i < (BOOSTER_PACK_NUMBER == 0 ? 1 : 3); i++) {
                ItemHandlerHelper.giveItemToPlayer(pPlayer, new ItemStack(getRandomCard(BOOSTER_PACK_NUMBER, pLevel.getRandom())));
            }
        }

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }

    private Item getRandomCard(int boosterNumber, RandomSource random) {
        // A HashMap for each of the Booster Pack sets
        // Legend of White Eyes
        HashMap<Integer, Item> whiteEyesBoosterSet = new HashMap<Integer, Item>();
        whiteEyesBoosterSet.put(1, ModItems.LIL_GERALD_TRADING_CARD.get());
        whiteEyesBoosterSet.put(2, ModItems.BROODING_PIGLIN_TRADING_CARD.get());
        whiteEyesBoosterSet.put(3, ModItems.SHARPBONED_SCROOGE_TRADING_CARD.get());
        whiteEyesBoosterSet.put(4, ModItems.STICK_MAN_TRADING_CARD.get());
        whiteEyesBoosterSet.put(5, ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD.get());
        whiteEyesBoosterSet.put(6, ModItems.NOPE_THE_FISH_TRADING_CARD.get());
        whiteEyesBoosterSet.put(7, ModItems.SMOKING_LAUNCHER_TRADING_CARD.get());
        whiteEyesBoosterSet.put(8, ModItems.JAM_THE_FROG_TRADING_CARD.get());
        whiteEyesBoosterSet.put(9, ModItems.FROSTED_BALLMAN_TRADING_CARD.get());
        whiteEyesBoosterSet.put(10, ModItems.SONIC_SCREECHER_TRADING_CARD.get());
        // Future Booster Packs go here


        // I need to figure out how to make a rarity pull system or something
//        int randomRarity = random.nextInt(0, 100);
//        int rarity = 1;
//        if (randomRarity >= 0 && randomRarity < 50)
//            rarity = 1;
//        else if (randomRarity >= 50 && randomRarity < 80)
//            rarity = 2;
//        else if (randomRarity >= 80 && randomRarity < 95)
//            rarity = 3;
//        else if (randomRarity >= 95 && randomRarity < 100)
//            rarity = 4;
//        else
//            rarity = 1;

        // Choosing the random card based on what booster we're currently opening for
        switch (boosterNumber) {
            case 1:
                return whiteEyesBoosterSet.get(random.nextInt(1, whiteEyesBoosterSet.size() + 1));
            default:
                // Either you are using the Dev Booster Pack, or something went wrong...
                return ModItems.BASE_TRADING_CARD.get();
        }
    }
}