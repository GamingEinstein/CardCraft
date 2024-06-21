package net.gamingeinstein.cardcraft.item;

import net.gamingeinstein.cardcraft.config.CardCraftConfig;
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
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;

public class BoosterPackItem extends Item {
    protected final String BOOSTER_PACK_NAME;
    protected final String BOOSTER_PACK_ID;
    protected final int BOOSTER_PACK_NUMBER;

    public BoosterPackItem(String boosterPackName, String boosterPackID, int boosterPackNumber, Properties pProperties) {
        super(pProperties.stacksTo(16));
        BOOSTER_PACK_NAME = boosterPackName;
        BOOSTER_PACK_ID = boosterPackID;
        BOOSTER_PACK_NUMBER = boosterPackNumber;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.literal("Hold [" + (Screen.hasShiftDown() ? ChatFormatting.WHITE : ChatFormatting.GRAY) + "SHIFT" + ChatFormatting.RESET + "] for Details").withStyle(ChatFormatting.GRAY));
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.literal(""));
            pTooltipComponents.add(Component.translatable("item.cardcraft." + BOOSTER_PACK_NAME + "_booster_pack.information", CardCraftConfig.cards_per_booster_pack).withStyle(ChatFormatting.DARK_AQUA));
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if (pLevel instanceof ServerLevel serverLevel) {
            pPlayer.getItemInHand(pUsedHand).shrink(1);
            // Each Booster Pack gives X cards, where X is an integer between 1 and 64 (specified in the config)
            for (int i = 0; i < CardCraftConfig.cards_per_booster_pack; i++)
                ItemHandlerHelper.giveItemToPlayer(pPlayer, new ItemStack(getRandomCard(BOOSTER_PACK_NUMBER, pPlayer.getRandom())));
        }

        // pPlayer.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }

    private Item getRandomCard(int boosterNumber, RandomSource random) {
        // Holy hell this needs to be made into an api or something simpler elsewhere

        // A HashMap for each of the Booster Packs
        // ======================================= //
        // Legend of White Eyes
        HashMap<Integer, Item> legendOfWhiteEyesBoosterPack = new HashMap<>();
        legendOfWhiteEyesBoosterPack.put(1, ModItems.LIL_GERALD_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(2, ModItems.BROODING_PIGLIN_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(3, ModItems.SHARPBONED_SCROOGE_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(4, ModItems.STICK_MAN_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(5, ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(6, ModItems.NOPE_THE_FISH_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(7, ModItems.SMOKING_LAUNCHER_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(8, ModItems.JAM_THE_FROG_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(9, ModItems.FROSTED_BALLMAN_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(10, ModItems.SONIC_SCREECHER_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(11, ModItems.BOOK_OF_LOOTING_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(12, ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(13, ModItems.ICED_MARKSMAN_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(14, ModItems.NOTCH_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(15, ModItems.APPLE_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(16, ModItems.HUNGRY_CAMEL_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(17, ModItems.CLEANER_ALLAY_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(18, ModItems.ANGRY_VEX_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(19, ModItems.HEATED_JUMPER_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(20, ModItems.GLOW_OF_THE_DEEP_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(21, ModItems.LIVING_BOX_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(22, ModItems.BLOCK_THIEF_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(23, ModItems.DECAYING_STEED_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(24, ModItems.WILD_FELINE_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(25, ModItems.MENACE_OF_THE_STARS_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(26, ModItems.REPEATER_CROSSBOW_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(27, ModItems.GUIDE_TO_BETTER_FARMING_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(28, ModItems.MUSCLE_BUILDER_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(29, ModItems.IRON_TOE_BOOTS_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(30, ModItems.FEARED_SCREAM_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(31, ModItems.ROTTED_GANG_BRUTE_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(32, ModItems.FOUND_FLOUNDER_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(33, ModItems.MERCHANT_FROM_AFAR_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(34, ModItems.GUST_LEAPER_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(35, ModItems.GARDENER_GLOVES_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(36, ModItems.PROTECTED_BUNNY_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(37, ModItems.LEADER_OF_THE_ROTTED_GANG_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(38, ModItems.NAVIGATION_MATE_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(39, ModItems.MOSSY_BEAST_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(40, ModItems.TRAINING_STICK_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(41, ModItems.ROTTED_GANG_MUSCLE_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(42, ModItems.OUTCAST_RESIDENT_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(43, ModItems.MYSTERIOUS_MYSTIC_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(44, ModItems.BLOAT_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(45, ModItems.LIGHTNING_BOOTS_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(46, ModItems.OLD_SAGE_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(47, ModItems.MISGUIDED_HOG_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(48, ModItems.HUNGRY_BEAST_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(49, ModItems.POISON_CRAWLER_TRADING_CARD.get());
        legendOfWhiteEyesBoosterPack.put(50, ModItems.HEROBRINE_TRADING_CARD.get());

        // Choose a random rarity
        HashMap<Integer, Rarity> cardRarities = new HashMap<>();
        cardRarities.put(1, Rarity.COMMON);
        cardRarities.put(2, Rarity.UNCOMMON);
        cardRarities.put(3, Rarity.RARE);
        cardRarities.put(4, Rarity.EPIC);
        // Get the players stat on this booster pack, then give them a guaranteed rarity based on that stat. Otherwise, give them a random rarity
        // (insert getting player stats here... IF ONLY THERE WAS INFORMATION ON THE INTERNET FOR THIS)
        int randomRarity = random.nextInt(0, 100);

        // Actually choosing the card
        while (true) {
            // Choosing the random card based on what booster we're currently opening
            ItemStack card;
            switch (boosterNumber) {
                case 1:
                    card = new ItemStack(legendOfWhiteEyesBoosterPack.get(random.nextInt(1, legendOfWhiteEyesBoosterPack.size() + 1)));
                    break;
                default:
                    return ModItems.DEV_TRADING_CARD.get();
            }

            // Check if that card is the rarity we want, otherwise roll the card again
            if (card.getRarity().equals(cardRarities.get(
                    (0 <= randomRarity && randomRarity < 50) ? 1 :
                            (50 <= randomRarity && randomRarity < 80) ? 2 :
                                    (80 <= randomRarity && randomRarity < 95) ? 3 :
                                            4)))
                return card.getItem();
        }
    }
}