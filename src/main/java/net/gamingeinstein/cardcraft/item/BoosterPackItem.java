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
import net.minecraft.world.item.Rarity;
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
        super(pProperties.stacksTo(16));
        BOOSTER_PACK_NAME = boosterPackName;
        BOOSTER_PACK_NUMBER = boosterPackNumber;
        BOOSTER_PACK_INFORMATION = boosterPackInformation;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown())
            pTooltipComponents.add(Component.literal(BOOSTER_PACK_INFORMATION + " | Contains 3 random cards").withStyle(ChatFormatting.DARK_AQUA));
        else
            pTooltipComponents.add(Component.literal("Hold " + ChatFormatting.WHITE + "SHIFT" + ChatFormatting.RESET + " for Details").withStyle(ChatFormatting.GRAY));
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
                ItemHandlerHelper.giveItemToPlayer(pPlayer, new ItemStack(getRandomCard(BOOSTER_PACK_NUMBER, pPlayer.getRandom())));
            }
        }

        // pPlayer.awardStat(Stats.ITEM_USED.get(this));

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }

    private Item getRandomCard(int boosterNumber, RandomSource random) {
        // A HashMap for each of the Booster Packs
        // Legend of White Eyes
        HashMap<Integer, Item> whiteEyesBoosterPack = new HashMap<>();
        whiteEyesBoosterPack.put(1, ModItems.LIL_GERALD_TRADING_CARD.get());
        whiteEyesBoosterPack.put(2, ModItems.BROODING_PIGLIN_TRADING_CARD.get());
        whiteEyesBoosterPack.put(3, ModItems.SHARPBONED_SCROOGE_TRADING_CARD.get());
        whiteEyesBoosterPack.put(4, ModItems.STICK_MAN_TRADING_CARD.get());
        whiteEyesBoosterPack.put(5, ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD.get());
        whiteEyesBoosterPack.put(6, ModItems.NOPE_THE_FISH_TRADING_CARD.get());
        whiteEyesBoosterPack.put(7, ModItems.SMOKING_LAUNCHER_TRADING_CARD.get());
        whiteEyesBoosterPack.put(8, ModItems.JAM_THE_FROG_TRADING_CARD.get());
        whiteEyesBoosterPack.put(9, ModItems.FROSTED_BALLMAN_TRADING_CARD.get());
        whiteEyesBoosterPack.put(10, ModItems.SONIC_SCREECHER_TRADING_CARD.get());
        whiteEyesBoosterPack.put(11, ModItems.BOOK_OF_LOOTING_TRADING_CARD.get());
        whiteEyesBoosterPack.put(12, ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD.get());
        whiteEyesBoosterPack.put(13, ModItems.ICED_MARKSMAN_TRADING_CARD.get());
        whiteEyesBoosterPack.put(14, ModItems.NOTCH_TRADING_CARD.get());
        whiteEyesBoosterPack.put(15, ModItems.APPLE_TRADING_CARD.get());
        whiteEyesBoosterPack.put(16, ModItems.HUNGRY_CAMEL_TRADING_CARD.get());
        whiteEyesBoosterPack.put(17, ModItems.WORKING_ALLAY_TRADING_CARD.get());
        whiteEyesBoosterPack.put(18, ModItems.ANGRY_VEX_TRADING_CARD.get());
        whiteEyesBoosterPack.put(19, ModItems.HEATED_JUMPER_TRADING_CARD.get());
        whiteEyesBoosterPack.put(20, ModItems.GLOW_OF_THE_DEEP_TRADING_CARD.get());
        whiteEyesBoosterPack.put(21, ModItems.LIVING_BOX_TRADING_CARD.get());
        whiteEyesBoosterPack.put(22, ModItems.BLOCK_THIEF_TRADING_CARD.get());
        whiteEyesBoosterPack.put(23, ModItems.DECAYING_STEED_TRADING_CARD.get());
        // All Booster Packs
        HashMap<Integer, HashMap<Integer, Item>> allBoosterPacks = new HashMap<>();
        allBoosterPacks.put(1, whiteEyesBoosterPack);

        // Choose a random rarity
        HashMap<Integer, Rarity> cardRarities = new HashMap<>();
        cardRarities.put(1, Rarity.COMMON);
        cardRarities.put(2, Rarity.UNCOMMON);
        cardRarities.put(3, Rarity.RARE);
        cardRarities.put(4, Rarity.EPIC);
        // Get the players stat on this booster pack, then give them a guaranteed rarity based on that stat
        // (insert getting player stats here... IF ONLY THERE WAS INFORMATION ON THE INTERNET FOR THIS)

        int rollRarity = random.nextInt(0, 100);
        int rarity = (0 <= rollRarity && rollRarity < 50) ? 1 : (50 <= rollRarity && rollRarity < 80) ? 2 : (80 <= rollRarity && rollRarity < 95) ? 3 : 4;

        // Actually choosing the card
        while (true) {
            // Choosing the random card based on what booster we're currently opening
            ItemStack card;
            if (boosterNumber == 1)
                card = new ItemStack(whiteEyesBoosterPack.get(random.nextInt(1, whiteEyesBoosterPack.size() + 1)));
            else
                return ModItems.BASE_TRADING_CARD.get(); // Either you are using the Dev Booster Pack, or something went wrong...

            // Check if that card is the rarity we want, otherwise roll the card again
            if (card.getRarity().equals(cardRarities.get(rarity)))
                return card.getItem();
        }
    }
}