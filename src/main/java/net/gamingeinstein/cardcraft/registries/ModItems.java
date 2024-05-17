package net.gamingeinstein.cardcraft.registries;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.item.BoosterPackItem;
import net.gamingeinstein.cardcraft.item.CardItem;
import net.gamingeinstein.cardcraft.item.RNGItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CardCraft.MOD_ID);

    // Some normal items... probably
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
                    new Item.Properties().rarity(Rarity.EPIC)));
    // Legend of White Eyes
    public static final RegistryObject<Item> WHITE_EYES_BOOSTER_PACK = ITEMS.register("white_eyes_booster_pack",
            () -> new BoosterPackItem("white_eyes",
                    1,
                    "Contains 3 random cards from the Legend of White Eyes Booster Pack",
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> LIL_GERALD_TRADING_CARD = ITEMS.register("lil_gerald_trading_card",
            () -> new CardItem("lil_gerald",
                    1,
                    "Creature - Swine",
                    new int[]{4, 2, 2},
                    "None",
                    "None",
                    "He's a lil guy, doing lil things | WHEY-EN01",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BROODING_PIGLIN_TRADING_CARD = ITEMS.register("brooding_piglin_trading_card",
            () -> new CardItem("brooding_piglin",
                    2,
                    "Creature - Swine Fighter",
                    new int[]{6, 5, 4},
                    "Tribute one Swine you control",
                    "None",
                    "A lone Piglin looking for his missing Gold Sword | WHEY-EN02",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SHARPBONED_SCROOGE_TRADING_CARD = ITEMS.register("sharpboned_scrooge_trading_card",
            () -> new CardItem("sharpboned_scrooge",
                    3,
                    "Creature - Undead Archer",
                    new int[]{3, 3, 2},
                    "None",
                    "Ranged",
                    "He's looking for a certain Human to use as target practice | WHEY-EN03",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STICK_MAN_TRADING_CARD = ITEMS.register("stick_man_trading_card",
            () -> new CardItem("stick_man",
                    4,
                    true,
                    "Creature - Human Warrior",
                    new int[]{3, 3, 2},
                    "None",
                    "None",
                    "He's running from a certain Skeleton who wants to use him as target practice | WHEY-EN04",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ARCHER_OF_THE_SWAMP_TRADING_CARD = ITEMS.register("archer_of_the_swamp_trading_card",
            () -> new CardItem("archer_of_the_swamp",
                    5,
                    "Creature - Undead Archer",
                    new int[]{2, 4, 3},
                    "Tribute one Skeleton you control",
                    "Ranged | This Mob's Battle Target gains Poison (after Damage Calculation)",
                    "It constantly see rainbows as a result of having mushrooms growing into it's skull | WHEY-EN05",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NOPE_THE_FISH_TRADING_CARD = ITEMS.register("nope_the_fish_trading_card",
            () -> new CardItem("nope_the_fish",
                    6,
                    "Equipment - Fish",
                    null,
                    "None",
                    "Equip to a target Mob you control. It gains +1/+0 and Double Swing",
                    "Why did we fol- wait what's this doing here | WHEY-EN06",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SMOKING_LAUNCHER_TRADING_CARD = ITEMS.register("smoking_launcher_trading_card",
            () -> new CardItem("smoking_launcher",
                    7,
                    "Creature - Fire Elemental",
                    new int[]{5, 2, 2},
                    "None",
                    "Ranged, Triple Swing | During each Battle, flip 3 Coins. Lose one Swing for each Tails flipped | This mob's Battle Target gains Burning (after Damage Calculation)",
                    "A blazing creature capable of shooting fireballs with precision | WHEY-EN07",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> JAM_THE_FROG_TRADING_CARD = ITEMS.register("jam_the_frog_trading_card",
            () -> new CardItem("jam_the_frog",
                    8,
                    "Creature - Amphibian Mimic",
                    new int[]{3, 2, 1},
                    "None",
                    "Target one Mob you control. This Mob gains target's ATK/DEF",
                    "No, it's still not a valid target | WHEY-EN08",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> FROSTED_BALLMAN_TRADING_CARD = ITEMS.register("frosted_ballman_trading_card",
            () -> new CardItem("frosted_ballman",
                    9,
                    "Creature - Ice Elemental",
                    new int[]{3, 1, 3},
                    "None",
                    "Ranged",
                    "It tries its best even though it can't defend itself well | WHEY-EN09",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SONIC_SCREECHER_TRADING_CARD = ITEMS.register("sonic_screecher_trading_card",
            () -> new CardItem("sonic_screecher",
                    10,
                    "Creature - Bat",
                    new int[]{2, 2, 2},
                    "None",
                    "Flying",
                    "The only thing more annoying than a flying rat is a loud flying rat | WHEY-EN10",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> BOOK_OF_LOOTING_TRADING_CARD = ITEMS.register("book_of_looting_trading_card",
            () -> new CardItem("book_of_looting",
                    11,
                    "Spell - Enchanted Book",
                    null,
                    "None",
                    "Draw 2 Cards",
                    "Some people wonder what this book does, even though the contents are quite simple to read | WHEY-EN11",
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CRY_OF_THE_UNDEAD_TRADING_CARD = ITEMS.register("cry_of_the_undead_trading_card",
            () -> new CardItem("cry_of_the_undead",
                    12,
                    "Spell - Item",
                    null,
                    "None",
                    "Kill one Mob",
                    "The undead are always looking for more victims to add to their ranks | WHEY-EN12",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ICED_MARKSMAN_TRADING_CARD = ITEMS.register("iced_marksman_trading_card",
            () -> new CardItem("iced_marksman_trading_card",
                    13,
                    "Creature - Undead Archer",
                    new int[]{3, 2, 2},
                    "Tribute one Skeleton you control",
                    "Ranger | This Mob's Battle Target gains Slowness (after Damage Calculation)",
                    "The tundra can be unforgiving for those unprepared | WHEY-EN13",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NOTCH_TRADING_CARD = ITEMS.register("notch_trading_card",
            () -> new CardItem("notch_trading_card",
                    13,
                    "Legendary Hero - Notch",
                    new int[]{10, 5, 5},
                    "Discard your entire Hand",
                    "Destroy one Mob you control, then take control of one Mob your Opponent controls | If this Hero dies, search your deck for 'Apple' and add it to your hand",
                    "His dead brother is rumored to be haunting the people of the Overworld. But Notch denies this, even with overwhelming evidence saying otherwise | WHEY-EN14",
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> APPLE_TRADING_CARD = ITEMS.register("apple_trading_card",
            () -> new CardItem("apple_trading_card",
                    14,
                    "Spell - Item",
                    new int[]{10, 5, 5},
                    "None",
                    "Target one Mob you control. It regains it's Stamina, then if this card was added to your hand by the effect of 'Notch', it also gains +3 HP",
                    "A healthy snack, perfect for any scenario | WHEY-EN15",
                    new Item.Properties().rarity(Rarity.COMMON)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
