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

    // Some normal items... probably
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

    // BEHOLD, THE WALL OF TEXT! ISN'T IT GLORIOUS?! Basically everything that is a card/booster pack...
    // ============================================= //
    // The Dev items, basically a base for me to use
    public static final RegistryObject<Item> BASE_BOOSTER_PACK = ITEMS.register("base_booster_pack",
            () -> new BoosterPackItem("base", // Booster Name
                    0, // Booster Pack Number
                    "Dev Booster Pack. You shouldn't have this", // Booster Pack Information
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BASE_TRADING_CARD = ITEMS.register("base_trading_card",
            () -> new CardItem("base", // Card Name
                    0, // Card Number
                    "Dev - Ultimate Super Card of Doom", // Card Type
                    new int[]{20, 20, 20}, // Card Stats
                    "Your family lineage", // Card Costs
                    "+1 Happiness for your Franchise", // Card Effect
                    "Dev Trading Card. You shouldn't have this | BASE-EN00 | Cannot be used in Official Duels", // Card Flavor Text
                    new Item.Properties().rarity(Rarity.EPIC))); // Anything special that should be defined (mostly Rarity)
    // Legend of White Eyes
    public static final RegistryObject<Item> WHITE_EYES_BOOSTER_PACK = ITEMS.register("white_eyes_booster_pack",
            () -> new BoosterPackItem("white_eyes",
                    1,
                    "Legend of White Eyes",
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> LIL_GERALD_TRADING_CARD = ITEMS.register("lil_gerald_trading_card",
            () -> new CardItem("lil_gerald",
                    1,
                    "Mob - Swine",
                    new int[]{4, 2, 2},
                    "None",
                    "None",
                    "He's a lil guy, doing lil things | WHEY-EN01",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BROODING_PIGLIN_TRADING_CARD = ITEMS.register("brooding_piglin_trading_card",
            () -> new CardItem("brooding_piglin",
                    2,
                    "Mob - Swine",
                    new int[]{6, 5, 4},
                    "Tribute one Swine you control",
                    "None",
                    "A lone Piglin looking for his missing Gold Sword | WHEY-EN02",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SHARPBONED_SCROOGE_TRADING_CARD = ITEMS.register("sharpboned_scrooge_trading_card",
            () -> new CardItem("sharpboned_scrooge",
                    3,
                    "Mob - Undead",
                    new int[]{3, 3, 2},
                    "None",
                    "Ranger",
                    "He's looking for a certain Human to use as target practice | WHEY-EN03",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STICK_MAN_TRADING_CARD = ITEMS.register("stick_man_trading_card",
            () -> new CardItem("stick_man",
                    4,
                    true,
                    "Mob - Human",
                    new int[]{3, 3, 2},
                    "None",
                    "None",
                    "He's running from a certain Skeleton who wants to use him as target practice | WHEY-EN04",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ARCHER_OF_THE_SWAMP_TRADING_CARD = ITEMS.register("archer_of_the_swamp_trading_card",
            () -> new CardItem("archer_of_the_swamp",
                    5,
                    "Mob - Undead",
                    new int[]{2, 4, 3},
                    "Tribute one Skeleton you control",
                    "Ranger | This Mob's Battle Target gains Poison (after Damage Calculation)",
                    "It constantly see rainbows as a result of having mushrooms growing into it's skull | WHEY-EN05",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NOPE_THE_FISH_TRADING_CARD = ITEMS.register("nope_the_fish_trading_card",
            () -> new CardItem("nope_the_fish",
                    6,
                    "Equipment - Fish Weapon",
                    null,
                    "None",
                    "Equip to a Mob you control. It gains +1/+0 and Double Swing",
                    "Why did we fol- wait what's this doing here | WHEY-EN06",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SMOKING_LAUNCHER_TRADING_CARD = ITEMS.register("smoking_launcher_trading_card",
            () -> new CardItem("smoking_launcher",
                    7,
                    "Mob - Fire Elemental",
                    new int[]{5, 2, 2},
                    "None",
                    "Ranger, Triple Swing | During each Battle, flip 3 Coins. Lose one Swing for each Tails flipped | This mob's Battle Target gains Burning (after Damage Calculation)",
                    "A blazing creature capable of shooting fireballs with precision | WHEY-EN07",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> JAM_THE_FROG_TRADING_CARD = ITEMS.register("jam_the_frog_trading_card",
            () -> new CardItem("jam_the_frog",
                    8,
                    "Mob - Frog",
                    new int[]{3, 2, 1},
                    "None",
                    "Target one Mob you control. This Mob gains target's ATK/DEF",
                    "No, it's still not a valid target | WHEY-EN08",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> FROSTED_BALLMAN_TRADING_CARD = ITEMS.register("frosted_ballman_trading_card",
            () -> new CardItem("frosted_ballman",
                    9,
                    "Mob - Ice Elemental",
                    new int[]{3, 1, 3},
                    "None",
                    "Ranger",
                    "It tries its best even though it can't defend itself well | WHEY-EN09",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SONIC_SCREECHER_TRADING_CARD = ITEMS.register("sonic_screecher_trading_card",
            () -> new CardItem("sonic_screecher",
                    10,
                    "Mob - Bat",
                    new int[]{3, 2, 2},
                    "None",
                    "Flying",
                    "The only thing more annoying than a flying rat is a loud flying rat | WHEY-EN10",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> BOOK_OF_LOOTING_TRADING_CARD = ITEMS.register("book_of_looting_trading_card",
            () -> new CardItem("book_of_looting",
                    11,
                    "Item - Enchanted Book",
                    null,
                    "None",
                    "Draw 2 Cards",
                    "Some people wonder what this book does, even though the contents are quite simple to read | WHEY-EN11",
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CRY_OF_THE_UNDEAD_TRADING_CARD = ITEMS.register("cry_of_the_undead_trading_card",
            () -> new CardItem("cry_of_the_undead",
                    12,
                    "Item - Horn",
                    null,
                    "None",
                    "Kill one Mob",
                    "The undead are always looking for more victims to add to their ranks | WHEY-EN12",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ICED_MARKSMAN_TRADING_CARD = ITEMS.register("iced_marksman_trading_card",
            () -> new CardItem("iced_marksman_trading_card",
                    13,
                    "Mob - Undead",
                    new int[]{3, 2, 2},
                    "Tribute one Skeleton you control",
                    "Ranger | This Mob's Battle Target gains Slowness (after Damage Calculation)",
                    "The tundra can be unforgiving for those unprepared | WHEY-EN13",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NOTCH_TRADING_CARD = ITEMS.register("notch_trading_card",
            () -> new CardItem("notch_trading_card",
                    14,
                    "Legendary Hero - Notch",
                    new int[]{10, 5, 5},
                    "Discard your entire Hand",
                    "Kill one Mob you control, then take control of one Mob an opponent controls | If this Hero dies, search your deck for 'Apple' and add it to your hand",
                    "His dead brother is rumored to be haunting the people of the Overworld. But Notch denies this, even with overwhelming evidence saying otherwise | WHEY-EN14",
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> APPLE_TRADING_CARD = ITEMS.register("apple_trading_card",
            () -> new CardItem("apple_trading_card",
                    15,
                    "Item - Food",
                    new int[]{10, 5, 5},
                    "None",
                    "Target one Mob you control. It regains Stamina, then if was added to your hand by the effect of 'Notch', it also gains +3 HP",
                    "A healthy snack, perfect for any scenario | WHEY-EN15",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> HUNGRY_CAMEL_TRADING_CARD = ITEMS.register("hungry_camel_trading_card",
            () -> new CardItem("hungry_camel_trading_card",
                    16,
                    "Mob - Camel",
                    new int[]{8, 4, 3},
                    "None",
                    "Transport 2 | Mobs or Heroes being transported by this Mob cannot be attacked by non-Rangers | If this Mob was given Food this turn, it gains +2/+1",
                    "Camels were used | WHEY-EN16",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> WORKING_ALLAY_TRADING_CARD = ITEMS.register("working_allay_trading_card",
            () -> new CardItem("working_allay_trading_card",
                    17,
                    "Mob - Spirit",
                    new int[]{2, 1, 2},
                    "None",
                    "Discard one Item, then search your deck for an Item and add it to your hand",
                    "Allays are known for retrieving items that you give them, making them perfect for sorters or cleaner | WHEY-EN17",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ANGRY_VEX_TRADING_CARD = ITEMS.register("angry_vex_trading_card",
            () -> new CardItem("angry_vex_trading_card",
                    18,
                    "Mob - Spirit",
                    new int[]{2, 2, 2},
                    "None",
                    "Flying",
                    "It's interesting to think about how Vexes can shrink a sword enough for them to hold one effectively | WHEY-EN18",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> HEATED_JUMPER_TRADING_CARD = ITEMS.register("heated_jumper_trading_card",
            () -> new CardItem("heated_jumper_trading_card",
                    19,
                    "Mob - Slime",
                    new int[]{5, 4, 2},
                    "None",
                    "This Mob's Battle Target gains Burning (after Damage Calculation) | If this Mob dies, spawn two Magma Cube Tokens (1 HP, 2/2)",
                    "Magma Cubes are capable of jumping very high and far if they are chasing something | WHEY-EN19",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> GLOW_OF_THE_DEEP_TRADING_CARD = ITEMS.register("glow_of_the_deep_trading_card",
            () -> new CardItem("glow_of_the_deep_trading_card",
                    20,
                    "Mob - Squid",
                    new int[]{3, 1, 2},
                    "None",
                    "None",
                    "One theory stats that Glow Squids may contain Radium, which causes them and anything their ink touches to glow | WHEY-EN20",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LIVING_BOX_TRADING_CARD = ITEMS.register("living_box_trading_card",
            () -> new CardItem("living_box_trading_card",
                    21,
                    "Mob - Enderian",
                    new int[]{4, 3, 4},
                    "None",
                    "Ranger | During Battle, flip a coin. If heads, this Mob cannot attack and gains +0/+2",
                    "People use its shells in order to make portable storage | WHEY-EN21",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> BLOCK_THIEF_TRADING_CARD = ITEMS.register("block_thief_trading_card",
            () -> new CardItem("block_thief_trading_card",
                    22,
                    "Mob - Enderian",
                    new int[]{5, 3, 4},
                    "None",
                    "During Battle, flip two coins. If both are heads, this mob doesn't take damage from that Battle",
                    "Many Endermen specialize in taking blocks from the front lawns of people. Who know's why they | WHEY-EN22",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DECAYING_STEED_TRADING_CARD = ITEMS.register("decaying_steed_trading_card",
            () -> new CardItem("decaying_steed_trading_card",
                    23,
                    "Mob - Undead Horse",
                    new int[]{5, 2, 1},
                    "Tribute one Horse you control",
                    "Transport 1 | Mobs or Heroes being transported by this Mob inflict Poison during Battle (after Damage Calculation)",
                    "Some Horses have such strong loyalty to their masters, they can come back to life in hopes of reuniting | WHEY-EN23",
                    new Item.Properties().rarity(Rarity.RARE)));
    // Tokens
    public static final RegistryObject<Item> MAGMA_CUBE_TOKEN_TRADING_CARD = ITEMS.register("magma_cube_token_trading_card",
            () -> new CardItem("magma_cube_token_trading_card",
                    -1,
                    "Token - Slime",
                    new int[]{1, 2, 2},
                    "None",
                    "None",
                    "TOKEN-EN01",
                    new Item.Properties().rarity(Rarity.COMMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
