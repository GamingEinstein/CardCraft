package net.gamingeinstein.cardcraft.registries;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.item.BoosterPackItem;
import net.gamingeinstein.cardcraft.item.CardItem;
import net.gamingeinstein.cardcraft.item.RNGItem;
import net.gamingeinstein.cardcraft.item.RulebookItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CardCraft.MOD_ID);

    // Predefined rarities because I don't like retyping these over and over again...
    protected static final Item.Properties COMMON = new Item.Properties().rarity(Rarity.COMMON);
    protected static final Item.Properties UNCOMMON = new Item.Properties().rarity(Rarity.UNCOMMON);
    protected static final Item.Properties RARE = new Item.Properties().rarity(Rarity.RARE);
    protected static final Item.Properties EPIC = new Item.Properties().rarity(Rarity.EPIC);

    // "Basic" Items
    public static final RegistryObject<Item> OFFICIAL_RULEBOOK = ITEMS.register("official_rulebook",
            () -> new RulebookItem(new Item.Properties()));
    public static final RegistryObject<Item> SPECIAL_COIN = ITEMS.register("special_coin",
            () -> new RNGItem(2, true, new Item.Properties()));
    public static final RegistryObject<Item> SPECIAL_D1 = ITEMS.register("special_d1",
            () -> new RNGItem(1, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SPECIAL_D6 = ITEMS.register("white_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SPECIAL_D6 = ITEMS.register("light_gray_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SPECIAL_D6 = ITEMS.register("gray_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SPECIAL_D6 = ITEMS.register("black_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SPECIAL_D6 = ITEMS.register("brown_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> RED_SPECIAL_D6 = ITEMS.register("red_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SPECIAL_D6 = ITEMS.register("orange_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SPECIAL_D6 = ITEMS.register("yellow_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> LIME_SPECIAL_D6 = ITEMS.register("lime_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SPECIAL_D6 = ITEMS.register("green_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SPECIAL_D6 = ITEMS.register("cyan_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SPECIAL_D6 = ITEMS.register("light_blue_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SPECIAL_D6 = ITEMS.register("blue_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SPECIAL_D6 = ITEMS.register("purple_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SPECIAL_D6 = ITEMS.register("magenta_special_d6",
            () -> new RNGItem(6, new Item.Properties()));
    public static final RegistryObject<Item> PINK_SPECIAL_D6 = ITEMS.register("pink_special_d6",
            () -> new RNGItem(6, new Item.Properties()));

    // All of the Cards and Booster Packs...
    // ===================================== //
    // Dev
    public static final RegistryObject<Item> DEV_BOOSTER_PACK = ITEMS.register("dev_booster_pack",
            () -> new BoosterPackItem("dev", 0, EPIC));
    public static final RegistryObject<Item> DEV_TRADING_CARD = ITEMS.register("dev_trading_card",
            () -> new CardItem("dev", 0, new int[]{20, 20}, true, EPIC));
    // Legend of White Eyes
    public static final RegistryObject<Item> LEGEND_OF_WHITE_EYES_BOOSTER_PACK = ITEMS.register("legend_of_white_eyes_booster_pack",
            () -> new BoosterPackItem("legend_of_white_eyes", 1, EPIC));
    public static final RegistryObject<Item> LIL_GERALD_TRADING_CARD = ITEMS.register("lil_gerald_trading_card",
            () -> new CardItem("lil_gerald", 1, new int[]{5, 2}, COMMON));
    public static final RegistryObject<Item> BROODING_PIGLIN_TRADING_CARD = ITEMS.register("brooding_piglin_trading_card",
            () -> new CardItem("brooding_piglin", 2, new int[]{8, 5}, UNCOMMON));
    public static final RegistryObject<Item> SHARPBONED_SCROOGE_TRADING_CARD = ITEMS.register("sharpboned_scrooge_trading_card",
            () -> new CardItem("sharpboned_scrooge", 3, new int[]{10, 4}, COMMON));
    public static final RegistryObject<Item> STICK_MAN_TRADING_CARD = ITEMS.register("stick_man_trading_card",
            () -> new CardItem("stick_man", 4, new int[]{10, 5}, COMMON));
    public static final RegistryObject<Item> ARCHER_OF_THE_SWAMP_TRADING_CARD = ITEMS.register("archer_of_the_swamp_trading_card",
            () -> new CardItem("archer_of_the_swamp", 5, new int[]{8, 3}, UNCOMMON));
    public static final RegistryObject<Item> NOPE_THE_FISH_TRADING_CARD = ITEMS.register("nope_the_fish_trading_card",
            () -> new CardItem("nope_the_fish", 6, null, COMMON));
    public static final RegistryObject<Item> SMOKING_LAUNCHER_TRADING_CARD = ITEMS.register("smoking_launcher_trading_card",
            () -> new CardItem("smoking_launcher", 7, new int[]{10, 4}, COMMON));
    public static final RegistryObject<Item> JAM_THE_FROG_TRADING_CARD = ITEMS.register("jam_the_frog_trading_card",
            () -> new CardItem("jam_the_frog", 8, new int[]{5, 2}, COMMON));
    public static final RegistryObject<Item> FROSTED_BALLMAN_TRADING_CARD = ITEMS.register("frosted_ballman_trading_card",
            () -> new CardItem("frosted_ballman", 9, new int[]{2, 1}, COMMON));
    public static final RegistryObject<Item> SONIC_SCREECHER_TRADING_CARD = ITEMS.register("sonic_screecher_trading_card",
            () -> new CardItem("sonic_screecher", 10, new int[]{3, 2}, UNCOMMON));
    public static final RegistryObject<Item> BOOK_OF_LOOTING_TRADING_CARD = ITEMS.register("book_of_looting_trading_card",
            () -> new CardItem("book_of_looting", 11, null, EPIC));
    public static final RegistryObject<Item> CRY_OF_THE_UNDEAD_TRADING_CARD = ITEMS.register("cry_of_the_undead_trading_card",
            () -> new CardItem("cry_of_the_undead", 12, null, RARE));
    public static final RegistryObject<Item> ICED_MARKSMAN_TRADING_CARD = ITEMS.register("iced_marksman_trading_card",
            () -> new CardItem("iced_marksman", 13, new int[]{10, 4}, UNCOMMON));
    public static final RegistryObject<Item> NOTCH_TRADING_CARD = ITEMS.register("notch_trading_card",
            () -> new CardItem("notch", 14, new int[]{10, 6}, EPIC));
    public static final RegistryObject<Item> APPLE_TRADING_CARD = ITEMS.register("apple_trading_card",
            () -> new CardItem("apple", 15, null, COMMON));
    public static final RegistryObject<Item> HUNGRY_CAMEL_TRADING_CARD = ITEMS.register("hungry_camel_trading_card",
            () -> new CardItem("hungry_camel", 16, new int[]{8, 3}, UNCOMMON));
    public static final RegistryObject<Item> CLEANER_ALLAY_TRADING_CARD = ITEMS.register("cleaner_allay_trading_card",
            () -> new CardItem("cleaner_allay", 17, new int[]{5, 2}, RARE));
    public static final RegistryObject<Item> ANGRY_VEX_TRADING_CARD = ITEMS.register("angry_vex_trading_card",
            () -> new CardItem("angry_vex", 18, new int[]{7, 4}, RARE));
    public static final RegistryObject<Item> HEATED_JUMPER_TRADING_CARD = ITEMS.register("heated_jumper_trading_card",
            () -> new CardItem("heated_jumper", 19, new int[]{8, 3}, UNCOMMON));
    public static final RegistryObject<Item> GLOW_OF_THE_DEEP_TRADING_CARD = ITEMS.register("glow_of_the_deep_trading_card",
            () -> new CardItem("glow_of_the_deep", 20, new int[]{5, 2}, COMMON));
    public static final RegistryObject<Item> LIVING_BOX_TRADING_CARD = ITEMS.register("living_box_trading_card",
            () -> new CardItem("living_box", 21, new int[]{7, 4}, UNCOMMON));
    public static final RegistryObject<Item> BLOCK_THIEF_TRADING_CARD = ITEMS.register("block_thief_trading_card",
            () -> new CardItem("block_thief", 22, new int[]{15, 5}, UNCOMMON));
    public static final RegistryObject<Item> DECAYING_STEED_TRADING_CARD = ITEMS.register("decaying_steed_trading_card",
            () -> new CardItem("decaying_steed", 23, new int[]{7, 2}, RARE));
    public static final RegistryObject<Item> WILD_FELINE_TRADING_CARD = ITEMS.register("wild_feline_trading_card",
            () -> new CardItem("wild_feline", 24, new int[]{5, 3}, UNCOMMON));
    public static final RegistryObject<Item> MENACE_OF_THE_STARS_TRADING_CARD = ITEMS.register("menace_of_the_stars_trading_card",
            () -> new CardItem("menace_of_the_stars", 25, new int[]{5, 5}, RARE));
    public static final RegistryObject<Item> REPEATER_CROSSBOW_TRADING_CARD = ITEMS.register("repeater_crossbow_trading_card",
            () -> new CardItem("repeater_crossbow", 26, null, COMMON));
    public static final RegistryObject<Item> GUIDE_TO_BETTER_FARMING_TRADING_CARD = ITEMS.register("guide_to_better_farming_trading_card",
            () -> new CardItem("guide_to_better_farming", 27, null, UNCOMMON));
    public static final RegistryObject<Item> MUSCLE_BUILDER_TRADING_CARD = ITEMS.register("muscle_builder_trading_card",
            () -> new CardItem("muscle_builder", 28, null, COMMON));
    public static final RegistryObject<Item> IRON_TOE_BOOTS_TRADING_CARD = ITEMS.register("iron_toe_boots_trading_card",
            () -> new CardItem("iron_toe_boots", 29, null, COMMON));
    public static final RegistryObject<Item> FEARED_SCREAM_TRADING_CARD = ITEMS.register("feared_scream_trading_card",
            () -> new CardItem("feared_scream", 30, null, COMMON));
    // Tokens
    public static final RegistryObject<Item> MAGMA_CUBE_TOKEN_TRADING_CARD = ITEMS.register("magma_cube_token_trading_card",
            () -> new CardItem("magma_cube_token", -1, new int[]{2, 2}, COMMON));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
