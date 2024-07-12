package net.gamingeinstein.cardcraft.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.item.BoosterPackItem;
import net.gamingeinstein.cardcraft.item.RNGItem;
import net.gamingeinstein.cardcraft.item.RulebookItem;
import net.gamingeinstein.cardcraft.item.TradingCardItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    // Default Properties
    public static final FabricItemSettings DEFAULT_PROPERTIES = new FabricItemSettings().rarity(Rarity.COMMON);
    public static final FabricItemSettings DEFAULT_UNCOMMON_PROPERTIES = new FabricItemSettings().rarity(Rarity.UNCOMMON);
    public static final FabricItemSettings DEFAULT_RARE_PROPERTIES = new FabricItemSettings().rarity(Rarity.RARE);
    public static final FabricItemSettings DEFAULT_EPIC_PROPERTIES = new FabricItemSettings().rarity(Rarity.EPIC);

    // Rulebook
    public static final Item OFFICIAL_RULEBOOK = registerItem("official_rulebook",
            new RulebookItem(DEFAULT_RARE_PROPERTIES));
    // RNG Items
    public static final Item SPECIAL_COIN = registerItem("special_coin",
            new RNGItem(2, true, DEFAULT_PROPERTIES));
    public static final Item SPECIAL_D1 = registerItem("special_d1",
            new RNGItem(1, DEFAULT_PROPERTIES));
    public static final Item WHITE_SPECIAL_D6 = registerItem("white_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item LIGHT_GRAY_SPECIAL_D6 = registerItem("light_gray_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item GRAY_SPECIAL_D6 = registerItem("gray_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item BLACK_SPECIAL_D6 = registerItem("black_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item BROWN_SPECIAL_D6 = registerItem("brown_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item RED_SPECIAL_D6 = registerItem("red_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item ORANGE_SPECIAL_D6 = registerItem("orange_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item YELLOW_SPECIAL_D6 = registerItem("yellow_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item LIME_SPECIAL_D6 = registerItem("lime_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item GREEN_SPECIAL_D6 = registerItem("green_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item CYAN_SPECIAL_D6 = registerItem("cyan_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item LIGHT_BLUE_SPECIAL_D6 = registerItem("light_blue_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item BLUE_SPECIAL_D6 = registerItem("blue_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item PURPLE_SPECIAL_D6 = registerItem("purple_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item MAGENTA_SPECIAL_D6 = registerItem("magenta_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    public static final Item PINK_SPECIAL_D6 = registerItem("pink_special_d6",
            new RNGItem(6, DEFAULT_PROPERTIES));
    // All of the Cards and Booster Packs...
    // ===================================== //
    // Dev
    public static final Item DEV_BOOSTER_PACK = registerItem("dev_booster_pack",
            new BoosterPackItem("dev", "dev", 0, DEFAULT_EPIC_PROPERTIES));
    public static final Item DEV_TRADING_CARD = registerItem("dev_trading_card",
            new TradingCardItem("dev", 0, new int[]{20, 20}, "dev", true, DEFAULT_EPIC_PROPERTIES));
    // Legend of White Eyes
    public static final Item LEGEND_OF_WHITE_EYES_BOOSTER_PACK = registerItem("legend_of_white_eyes_booster_pack",
            new BoosterPackItem("legend_of_white_eyes", "lwe", 1, DEFAULT_EPIC_PROPERTIES));
    public static final Item LIL_GERALD_TRADING_CARD = registerItem("lil_gerald_trading_card",
            new TradingCardItem("lil_gerald", 1, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item BROODING_PIGLIN_TRADING_CARD = registerItem("brooding_piglin_trading_card",
            new TradingCardItem("brooding_piglin", 2, new int[]{8, 5}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item SHARPBONED_SCROOGE_TRADING_CARD = registerItem("sharpboned_scrooge_trading_card",
            new TradingCardItem("sharpboned_scrooge", 3, new int[]{10, 4}, "lwe", DEFAULT_PROPERTIES));
    public static final Item STICK_MAN_TRADING_CARD = registerItem("stick_man_trading_card",
            new TradingCardItem("stick_man", 4, new int[]{10, 5}, "lwe", DEFAULT_PROPERTIES));
    public static final Item ARCHER_OF_THE_SWAMP_TRADING_CARD = registerItem("archer_of_the_swamp_trading_card",
            new TradingCardItem("archer_of_the_swamp", 5, new int[]{8, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item NOPE_THE_FISH_TRADING_CARD = registerItem("nope_the_fish_trading_card",
            new TradingCardItem("nope_the_fish", 6, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item SMOKING_LAUNCHER_TRADING_CARD = registerItem("smoking_launcher_trading_card",
            new TradingCardItem("smoking_launcher", 7, new int[]{10, 4}, "lwe", DEFAULT_PROPERTIES));
    public static final Item JAM_THE_FROG_TRADING_CARD = registerItem("jam_the_frog_trading_card",
            new TradingCardItem("jam_the_frog", 8, new int[]{5, 2}, "lwe", DEFAULT_PROPERTIES));
    public static final Item FROSTED_BALLMAN_TRADING_CARD = registerItem("frosted_ballman_trading_card",
            new TradingCardItem("frosted_ballman", 9, new int[]{2, 1}, "lwe", DEFAULT_PROPERTIES));
    public static final Item SONIC_SCREECHER_TRADING_CARD = registerItem("sonic_screecher_trading_card",
            new TradingCardItem("sonic_screecher", 10, new int[]{3, 2}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item BOOK_OF_LOOTING_TRADING_CARD = registerItem("book_of_looting_trading_card",
            new TradingCardItem("book_of_looting", 11, null, "lwe", DEFAULT_EPIC_PROPERTIES));
    public static final Item CRY_OF_THE_UNDEAD_TRADING_CARD = registerItem("cry_of_the_undead_trading_card",
            new TradingCardItem("cry_of_the_undead", 12, null, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final Item ICED_MARKSMAN_TRADING_CARD = registerItem("iced_marksman_trading_card",
            new TradingCardItem("iced_marksman", 13, new int[]{10, 4}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item NOTCH_TRADING_CARD = registerItem("notch_trading_card",
            new TradingCardItem("notch", 14, new int[]{10, 6}, "lwe", DEFAULT_EPIC_PROPERTIES));
    public static final Item APPLE_TRADING_CARD = registerItem("apple_trading_card",
            new TradingCardItem("apple", 15, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item HUNGRY_CAMEL_TRADING_CARD = registerItem("hungry_camel_trading_card",
            new TradingCardItem("hungry_camel", 16, new int[]{8, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item CLEANER_ALLAY_TRADING_CARD = registerItem("cleaner_allay_trading_card",
            new TradingCardItem("cleaner_allay", 17, new int[]{5, 2}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final Item ANGRY_VEX_TRADING_CARD = registerItem("angry_vex_trading_card",
            new TradingCardItem("angry_vex", 18, new int[]{7, 4}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final Item HEATED_JUMPER_TRADING_CARD = registerItem("heated_jumper_trading_card",
            new TradingCardItem("heated_jumper", 19, new int[]{8, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item GLOW_OF_THE_DEEP_TRADING_CARD = registerItem("glow_of_the_deep_trading_card",
            new TradingCardItem("glow_of_the_deep", 20, new int[]{5, 2}, "lwe", DEFAULT_PROPERTIES));
    public static final Item LIVING_BOX_TRADING_CARD = registerItem("living_box_trading_card",
            new TradingCardItem("living_box", 21, new int[]{7, 4}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item BLOCK_THIEF_TRADING_CARD = registerItem("block_thief_trading_card",
            new TradingCardItem("block_thief", 22, new int[]{15, 5}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item DECAYING_STEED_TRADING_CARD = registerItem("decaying_steed_trading_card",
            new TradingCardItem("decaying_steed", 23, new int[]{7, 2}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final Item WILD_FELINE_TRADING_CARD = registerItem("wild_feline_trading_card",
            new TradingCardItem("wild_feline", 24, new int[]{5, 3}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item MENACE_OF_THE_STARS_TRADING_CARD = registerItem("menace_of_the_stars_trading_card",
            new TradingCardItem("menace_of_the_stars", 25, new int[]{5, 5}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final Item REPEATER_CROSSBOW_TRADING_CARD = registerItem("repeater_crossbow_trading_card",
            new TradingCardItem("repeater_crossbow", 26, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item GUIDE_TO_BETTER_FARMING_TRADING_CARD = registerItem("guide_to_better_farming_trading_card",
            new TradingCardItem("guide_to_better_farming", 27, null, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item MUSCLE_BUILDER_TRADING_CARD = registerItem("muscle_builder_trading_card",
            new TradingCardItem("muscle_builder", 28, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item IRON_TOE_BOOTS_TRADING_CARD = registerItem("iron_toe_boots_trading_card",
            new TradingCardItem("iron_toe_boots", 29, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item FEARED_SCREAM_TRADING_CARD = registerItem("feared_scream_trading_card",
            new TradingCardItem("feared_scream", 30, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item ROTTED_GANG_BRUTE_TRADING_CARD = registerItem("rotted_gang_brute_trading_card",
            new TradingCardItem("rotted_gang_brute", 31, new int[]{10, 6}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item FOUND_FLOUNDER_TRADING_CARD = registerItem("found_flounder_trading_card",
            new TradingCardItem("found_flounder", 32, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item MERCHANT_FROM_AFAR_TRADING_CARD = registerItem("merchant_from_afar_trading_card",
            new TradingCardItem("merchant_from_afar", 33, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item GUST_LEAPER_TRADING_CARD = registerItem("gust_leaper_trading_card",
            new TradingCardItem("gust_leaper", 34, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item GARDENER_GLOVES_TRADING_CARD = registerItem("gardener_gloves_trading_card",
            new TradingCardItem("gardener_gloves", 35, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item PROTECTED_BUNNY_TRADING_CARD = registerItem("protected_bunny_trading_card",
            new TradingCardItem("protected_bunny", 36, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item LEADER_OF_THE_ROTTED_GANG_TRADING_CARD = registerItem("leader_of_the_rotted_gang_trading_card",
            new TradingCardItem("leader_of_the_rotted_gang", 37, new int[]{0, 0}, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final Item NAVIGATION_MATE_TRADING_CARD = registerItem("navigation_mate_trading_card",
            new TradingCardItem("navigation_mate", 38, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item MOSSY_BEAST_TRADING_CARD = registerItem("mossy_beast_trading_card",
            new TradingCardItem("mossy_beast", 39, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item TRAINING_STICK_TRADING_CARD = registerItem("training_stick_trading_card",
            new TradingCardItem("training_stick", 40, null, "lwe", DEFAULT_PROPERTIES));
    public static final Item ROTTED_GANG_MUSCLE_TRADING_CARD = registerItem("rotted_gang_muscle_trading_card",
            new TradingCardItem("rotted_gang_muscle", 41, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item OUTCAST_RESIDENT_TRADING_CARD = registerItem("outcast_resident_trading_card",
            new TradingCardItem("outcast_resident", 42, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item MYSTERIOUS_MYSTIC_TRADING_CARD = registerItem("mysterious_mystic_trading_card",
            new TradingCardItem("mysterious_mystic", 43, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item BLOAT_TRADING_CARD = registerItem("bloat_trading_card",
            new TradingCardItem("bloat", 44, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item LIGHTNING_BOOTS_TRADING_CARD = registerItem("lightning_boots_trading_card",
            new TradingCardItem("lightning_boots", 45, null, "lwe", DEFAULT_RARE_PROPERTIES));
    public static final Item OLD_SAGE_TRADING_CARD = registerItem("old_sage_trading_card",
            new TradingCardItem("old_sage", 46, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item MISGUIDED_HOG_TRADING_CARD = registerItem("misguided_hog_trading_card",
            new TradingCardItem("misguided_hog", 47, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item HUNGRY_BEAST_TRADING_CARD = registerItem("hungry_beast_trading_card",
            new TradingCardItem("hungry_beast", 48, new int[]{0, 0}, "lwe", DEFAULT_PROPERTIES));
    public static final Item POISON_CRAWLER_TRADING_CARD = registerItem("poison_crawler_trading_card",
            new TradingCardItem("poison_crawler", 49, new int[]{0, 0}, "lwe", DEFAULT_UNCOMMON_PROPERTIES));
    public static final Item HEROBRINE_TRADING_CARD = registerItem("herobrine_trading_card",
            new TradingCardItem("herobrine", 50, new int[]{0, 0}, "lwe", DEFAULT_EPIC_PROPERTIES));
    // Tokens
    public static final Item MAGMA_CUBE_TOKEN_TRADING_CARD = registerItem("magma_cube_token_trading_card",
            new TradingCardItem("magma_cube_token", 1, new int[]{2, 2}, "token", DEFAULT_PROPERTIES));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CardCraft.MOD_ID, name), item);
    }

    public static void register() {
        CardCraft.LOGGER.info("Registering Items for " + CardCraft.MOD_ID);
    }
}
