package net.gamingeinstein.cardcraft.registries;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.item.BoosterPackItem;
import net.gamingeinstein.cardcraft.item.RNGItem;
import net.gamingeinstein.cardcraft.item.RulebookItem;
import net.gamingeinstein.cardcraft.item.TradingCardItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CardCraft.MOD_ID);

    // Default Properties
    public static final Item.Properties DEFAULT_PROPERTIES = new Item.Properties().rarity(Rarity.COMMON);
    public static final Item.Properties DEFAULT_UNCOMMON_PROPERTIES = new Item.Properties().rarity(Rarity.UNCOMMON);
    public static final Item.Properties DEFAULT_RARE_PROPERTIES = new Item.Properties().rarity(Rarity.RARE);
    public static final Item.Properties DEFAULT_EPIC_PROPERTIES = new Item.Properties().rarity(Rarity.EPIC);

    // Rulebook
    public static final RegistryObject<Item> OFFICIAL_RULEBOOK = ITEMS.register("official_rulebook",
            () -> new RulebookItem(DEFAULT_RARE_PROPERTIES));
    // RNG Items
    public static final RegistryObject<Item> SPECIAL_COIN = ITEMS.register("special_coin",
            () -> new RNGItem(2, true, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SPECIAL_D1 = ITEMS.register("special_d1",
            () -> new RNGItem(1, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> WHITE_SPECIAL_D6 = ITEMS.register("white_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_GRAY_SPECIAL_D6 = ITEMS.register("light_gray_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> GRAY_SPECIAL_D6 = ITEMS.register("gray_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> BLACK_SPECIAL_D6 = ITEMS.register("black_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> BROWN_SPECIAL_D6 = ITEMS.register("brown_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> RED_SPECIAL_D6 = ITEMS.register("red_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> ORANGE_SPECIAL_D6 = ITEMS.register("orange_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> YELLOW_SPECIAL_D6 = ITEMS.register("yellow_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> LIME_SPECIAL_D6 = ITEMS.register("lime_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> GREEN_SPECIAL_D6 = ITEMS.register("green_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> CYAN_SPECIAL_D6 = ITEMS.register("cyan_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> LIGHT_BLUE_SPECIAL_D6 = ITEMS.register("light_blue_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> BLUE_SPECIAL_D6 = ITEMS.register("blue_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> PURPLE_SPECIAL_D6 = ITEMS.register("purple_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> MAGENTA_SPECIAL_D6 = ITEMS.register("magenta_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> PINK_SPECIAL_D6 = ITEMS.register("pink_special_d6",
            () -> new RNGItem(6, DEFAULT_PROPERTIES));
    // All of the Cards and Booster Packs...
    // ===================================== //
    // Dev
    public static final RegistryObject<Item> DEV_BOOSTER_PACK = ITEMS.register("dev_booster_pack",
            () -> new BoosterPackItem( "dev", "dev", 0, DEFAULT_EPIC_PROPERTIES));
    public static final RegistryObject<Item> DEV_TRADING_CARD = ITEMS.register("dev_trading_card",
            () -> new TradingCardItem("dev", 0, new int[]{20, 20}, "lwe", true, DEFAULT_EPIC_PROPERTIES));
    // Legend of White Eyes
    public static final RegistryObject<Item> LEGEND_OF_WHITE_EYES_BOOSTER_PACK = ITEMS.register("legend_of_white_eyes_booster_pack",
            () -> new BoosterPackItem("legend_of_white_eyes", "lwe", 1, DEFAULT_EPIC_PROPERTIES));
    public static final RegistryObject<Item> LIL_GERALD_TRADING_CARD = ITEMS.register("lil_gerald_trading_card",
            () -> new TradingCardItem("lil_gerald", 1, new int[]{5, 2}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> BROODING_PIGLIN_TRADING_CARD = ITEMS.register("brooding_piglin_trading_card",
            () -> new TradingCardItem("brooding_piglin", 2, new int[]{8, 5}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> SHARPBONED_SCROOGE_TRADING_CARD = ITEMS.register("sharpboned_scrooge_trading_card",
            () -> new TradingCardItem("sharpboned_scrooge", 3, new int[]{10, 4}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> STICK_MAN_TRADING_CARD = ITEMS.register("stick_man_trading_card",
            () -> new TradingCardItem("stick_man", 4, new int[]{10, 5}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> ARCHER_OF_THE_SWAMP_TRADING_CARD = ITEMS.register("archer_of_the_swamp_trading_card",
            () -> new TradingCardItem("archer_of_the_swamp", 5, new int[]{8, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> NOPE_THE_FISH_TRADING_CARD = ITEMS.register("nope_the_fish_trading_card",
            () -> new TradingCardItem("nope_the_fish", 6, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SMOKING_LAUNCHER_TRADING_CARD = ITEMS.register("smoking_launcher_trading_card",
            () -> new TradingCardItem("smoking_launcher", 7, new int[]{10, 4}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> JAM_THE_FROG_TRADING_CARD = ITEMS.register("jam_the_frog_trading_card",
            () -> new TradingCardItem("jam_the_frog", 8, new int[]{5, 2}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> FROSTED_BALLMAN_TRADING_CARD = ITEMS.register("frosted_ballman_trading_card",
            () -> new TradingCardItem("frosted_ballman", 9, new int[]{2, 1}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> SONIC_SCREECHER_TRADING_CARD = ITEMS.register("sonic_screecher_trading_card",
            () -> new TradingCardItem("sonic_screecher", 10, new int[]{3, 2}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> BOOK_OF_LOOTING_TRADING_CARD = ITEMS.register("book_of_looting_trading_card",
            () -> new TradingCardItem("book_of_looting", 11, null, "lwe", DEFAULT_EPIC_PROPERTIES));
    public static final RegistryObject<Item> CRY_OF_THE_UNDEAD_TRADING_CARD = ITEMS.register("cry_of_the_undead_trading_card",
            () -> new TradingCardItem("cry_of_the_undead", 12, null, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final RegistryObject<Item> ICED_MARKSMAN_TRADING_CARD = ITEMS.register("iced_marksman_trading_card",
            () -> new TradingCardItem("iced_marksman", 13, new int[]{10, 4}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> NOTCH_TRADING_CARD = ITEMS.register("notch_trading_card",
            () -> new TradingCardItem("notch", 14, new int[]{10, 6}, "lwe", DEFAULT_EPIC_PROPERTIES));
    public static final RegistryObject<Item> APPLE_TRADING_CARD = ITEMS.register("apple_trading_card",
            () -> new TradingCardItem("apple", 15, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> HUNGRY_CAMEL_TRADING_CARD = ITEMS.register("hungry_camel_trading_card",
            () -> new TradingCardItem("hungry_camel", 16, new int[]{8, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> CLEANER_ALLAY_TRADING_CARD = ITEMS.register("cleaner_allay_trading_card",
            () -> new TradingCardItem("cleaner_allay", 17, new int[]{5, 2}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final RegistryObject<Item> ANGRY_VEX_TRADING_CARD = ITEMS.register("angry_vex_trading_card",
            () -> new TradingCardItem("angry_vex", 18, new int[]{7, 4}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final RegistryObject<Item> HEATED_JUMPER_TRADING_CARD = ITEMS.register("heated_jumper_trading_card",
            () -> new TradingCardItem("heated_jumper", 19, new int[]{8, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> GLOW_OF_THE_DEEP_TRADING_CARD = ITEMS.register("glow_of_the_deep_trading_card",
            () -> new TradingCardItem("glow_of_the_deep", 20, new int[]{5, 2}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> LIVING_BOX_TRADING_CARD = ITEMS.register("living_box_trading_card",
            () -> new TradingCardItem("living_box", 21, new int[]{7, 4}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> BLOCK_THIEF_TRADING_CARD = ITEMS.register("block_thief_trading_card",
            () -> new TradingCardItem("block_thief", 22, new int[]{15, 5}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> DECAYING_STEED_TRADING_CARD = ITEMS.register("decaying_steed_trading_card",
            () -> new TradingCardItem("decaying_steed", 23, new int[]{7, 2}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final RegistryObject<Item> WILD_FELINE_TRADING_CARD = ITEMS.register("wild_feline_trading_card",
            () -> new TradingCardItem("wild_feline", 24, new int[]{5, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> MENACE_OF_THE_STARS_TRADING_CARD = ITEMS.register("menace_of_the_stars_trading_card",
            () -> new TradingCardItem("menace_of_the_stars", 25, new int[]{5, 5}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final RegistryObject<Item> REPEATER_CROSSBOW_TRADING_CARD = ITEMS.register("repeater_crossbow_trading_card",
            () -> new TradingCardItem("repeater_crossbow", 26, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> GUIDE_TO_BETTER_FARMING_TRADING_CARD = ITEMS.register("guide_to_better_farming_trading_card",
            () -> new TradingCardItem("guide_to_better_farming", 27, null, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> MUSCLE_BUILDER_TRADING_CARD = ITEMS.register("muscle_builder_trading_card",
            () -> new TradingCardItem("muscle_builder", 28, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> IRON_TOE_BOOTS_TRADING_CARD = ITEMS.register("iron_toe_boots_trading_card",
            () -> new TradingCardItem("iron_toe_boots", 29, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> FEARED_SCREAM_TRADING_CARD = ITEMS.register("feared_scream_trading_card",
            () -> new TradingCardItem("feared_scream", 30, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> ROTTED_GANG_BRUTE_TRADING_CARD = ITEMS.register("rotted_gang_brute_trading_card",
            () -> new TradingCardItem("rotted_gang_brute", 31, new int[]{10, 6}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> FOUND_FLOUNDER_TRADING_CARD = ITEMS.register("found_flounder_trading_card",
            () -> new TradingCardItem("found_flounder", 32, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> MERCHANT_FROM_AFAR_TRADING_CARD = ITEMS.register("merchant_from_afar_trading_card",
            () -> new TradingCardItem("merchant_from_afar", 33, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> GUST_LEAPER_TRADING_CARD = ITEMS.register("gust_leaper_trading_card",
            () -> new TradingCardItem("gust_leaper", 34, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> GARDENER_GLOVES_TRADING_CARD = ITEMS.register("gardener_gloves_trading_card",
            () -> new TradingCardItem("gardener_gloves", 35, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> PROTECTED_BUNNY_TRADING_CARD = ITEMS.register("protected_bunny_trading_card",
            () -> new TradingCardItem("protected_bunny", 36, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> LEADER_OF_THE_ROTTED_GANG_TRADING_CARD = ITEMS.register("leader_of_the_rotted_gang_trading_card",
            () -> new TradingCardItem("leader_of_the_rotted_gang", 37, new int[]{0, 0}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final RegistryObject<Item> NAVIGATION_MATE_TRADING_CARD = ITEMS.register("navigation_mate_trading_card",
            () -> new TradingCardItem("navigation_mate", 38, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> MOSSY_BEAST_TRADING_CARD = ITEMS.register("mossy_beast_trading_card",
            () -> new TradingCardItem("mossy_beast", 39, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> TRAINING_STICK_TRADING_CARD = ITEMS.register("training_stick_trading_card",
            () -> new TradingCardItem("training_stick", 40, null, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> ROTTED_GANG_MUSCLE_TRADING_CARD = ITEMS.register("rotted_gang_muscle_trading_card",
            () -> new TradingCardItem("rotted_gang_muscle", 41, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> OUTCAST_RESIDENT_TRADING_CARD = ITEMS.register("outcast_resident_trading_card",
            () -> new TradingCardItem("outcast_resident", 42, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> MYSTERIOUS_MYSTIC_TRADING_CARD = ITEMS.register("mysterious_mystic_trading_card",
            () -> new TradingCardItem("mysterious_mystic", 43, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> BLOAT_TRADING_CARD = ITEMS.register("bloat_trading_card",
            () -> new TradingCardItem("bloat", 44, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> LIGHTNING_BOOTS_TRADING_CARD = ITEMS.register("lightning_boots_trading_card",
            () -> new TradingCardItem("lightning_boots", 45, null, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final RegistryObject<Item> OLD_SAGE_TRADING_CARD = ITEMS.register("old_sage_trading_card",
            () -> new TradingCardItem("old_sage", 46, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> MISGUIDED_HOG_TRADING_CARD = ITEMS.register("misguided_hog_trading_card",
            () -> new TradingCardItem("misguided_hog", 47, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> HUNGRY_BEAST_TRADING_CARD = ITEMS.register("hungry_beast_trading_card",
            () -> new TradingCardItem("hungry_beast", 48, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> POISON_CRAWLER_TRADING_CARD = ITEMS.register("poison_crawler_trading_card",
            () -> new TradingCardItem("poison_crawler", 49, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final RegistryObject<Item> HEROBRINE_TRADING_CARD = ITEMS.register("herobrine_trading_card",
            () -> new TradingCardItem("herobrine", 50, new int[]{0, 0}, "lwe", DEFAULT_EPIC_PROPERTIES));
    // Tokens
    public static final RegistryObject<Item> MAGMA_CUBE_TOKEN_TRADING_CARD = ITEMS.register("magma_cube_token_trading_card",
            () -> new TradingCardItem("magma_cube_token", 1, new int[]{2, 2}, "token", DEFAULT_PROPERTIES));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
