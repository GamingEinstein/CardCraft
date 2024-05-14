package net.gamingeinstein.cardcraft.registries;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.item.BoosterPackItem;
import net.gamingeinstein.cardcraft.item.CardItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CardCraft.MOD_ID);

    // BEHOLD, THE WALL OF TEXT! ISN'T IT GLORIOUS?!... At least I started this before I added a ton of cards without details... yay...
    // Base for me to copy for the rest of the cards
    public static final RegistryObject<Item> BASE_BOOSTER_PACK = ITEMS.register("base_booster_pack",
            () -> new BoosterPackItem("base",
                    0, // Booster Pack Number
                    "Base Booster Pack. You shouldn't have this", // Booster Pack Information
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BASE_TRADING_CARD = ITEMS.register("base_trading_card",
            () -> new CardItem("base", // Card Name
                    0, // Card Number
                    "Dev - Ultimate Super Card of Doom", // Card Type
                    new int[]{20, 20, 20}, // Card Stats
                    "Your family lineage", // Card Costs
                    "+1 Happiness for your Franchise", // Card Effect
                    "Base Trading Card. You shouldn't have this | BASE-EN00", // Card Flavor Text
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
                    "None",
                    "None",
                    "A lone Piglin looking for his missing Gold Sword | WHEY-EN02",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SHARPBONED_SCROOGE_TRADING_CARD = ITEMS.register("sharpboned_scrooge_trading_card",
            () -> new CardItem("sharpboned_scrooge",
                    3,
                    "Creature - Undead Archer",
                    new int[]{3, 3, 2},
                    "None",
                    "None",
                    "He's looking for a certain stick to use as target practice | WHEY-EN03",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STICK_MAN_TRADING_CARD = ITEMS.register("stick_man_trading_card",
            () -> new CardItem("stick_man",
                    4,
                    true,
                    "Creature - Ent",
                    new int[]{3, 3, 2},
                    "None",
                    "None",
                    "He's running from a certain Skeleton using him as target practice | WHEY-EN04",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ARCHER_OF_THE_SWAMP_TRADING_CARD = ITEMS.register("archer_of_the_swamp_trading_card",
            () -> new CardItem("archer_of_the_swamp",
                    5,
                    "Creature - Undead Archer",
                    new int[]{4, 4, 3},
                    "None",
                    "None",
                    "They say that they constantly see rainbows. It's probably a result of having mushrooms growing into their skull | WHEY-EN05",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NOPE_THE_FISH_TRADING_CARD = ITEMS.register("nope_the_fish_trading_card",
            () -> new CardItem("nope_the_fish",
                    6,
                    "Equipment - Fish",
                    new int[]{1, 1, 0},
                    "None",
                    "Equip to target Mob. It gains +1/+0 and gains Double Strike",
                    "Why did we follow Shrimp... wait what's this doing here | WHEY-EN06",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SMOKING_LAUNCHER_TRADING_CARD = ITEMS.register("smoking_launcher_trading_card",
            () -> new CardItem("smoking_launcher",
                    7,
                    "Creature - Fire Elemental",
                    new int[]{5, 4, 2},
                    "None",
                    "None",
                    "A capable warrior, launching fireballs with precision | WHEY-EN07",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> JAM_THE_FROG_TRADING_CARD = ITEMS.register("jam_the_frog_trading_card",
            () -> new CardItem("jam_the_frog",
                    8,
                    "Creature - Amphibian Mimic",
                    new int[]{3, 2, 1},
                    "None",
                    "Target one Mob you control. It gain's target's ATK/DEF",
                    "No, it's still not a valid target | WHEY-EN08",
                    new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> FROSTED_BALLMAN_TRADING_CARD = ITEMS.register("frosted_ballman_trading_card",
            () -> new CardItem("frosted_ballman",
                    9,
                    "Creature - Ice Elemental",
                    new int[]{3, 1, 3},
                    "None",
                    "None",
                    "While not the strongest defender, it tries its best | WHEY-EN09",
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SONIC_SCREECHER_TRADING_CARD = ITEMS.register("sonic_screecher_trading_card",
            () -> new CardItem("sonic_screecher",
                    10,
                    "Creature - Bat",
                    new int[]{2, 2, 2},
                    "None",
                    "None",
                    "The only thing more annoying than a flying rat is a flying rat that makes your ears hurt | WHEY-EN10",
                    new Item.Properties().rarity(Rarity.UNCOMMON)));

    //public static final RegistryObject<Item> GRAVEYARD_CRY_TRADING_CARD = ITEMS.register("graveyard_cry_trading_card",
    //        () -> new CardItem("graveyard_cry", 3, new Item.Properties().rarity(Rarity.COMMON)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
