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

    // Base for me to copy for the rest of the cards
    public static final RegistryObject<Item> BASE_BOOSTER_PACK = ITEMS.register("base_booster_pack",
            () -> new BoosterPackItem("base", 0, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BASE_TRADING_CARD = ITEMS.register("base_trading_card",
            () -> new CardItem("base", 0, true, new Item.Properties().rarity(Rarity.EPIC)));
    // Legend of White Eyes
    public static final RegistryObject<Item> WHITE_EYES_BOOSTER_PACK = ITEMS.register("white_eyes_booster_pack",
            () -> new BoosterPackItem("white_eyes", 1, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> LIL_GERALD_TRADING_CARD = ITEMS.register("lil_gerald_trading_card",
            () -> new CardItem("lil_gerald", 1, false, new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BROODING_PIGLIN_TRADING_CARD = ITEMS.register("brooding_piglin_trading_card",
            () -> new CardItem("brooding_piglin", 2, false, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SHARPBONED_SCROOGE_TRADING_CARD = ITEMS.register("sharpboned_scrooge_trading_card",
            () -> new CardItem("sharpboned_scrooge", 3, false, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STICK_MAN_TRADING_CARD = ITEMS.register("stick_man_trading_card",
            () -> new CardItem("stick_man", 4, true, new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ARCHER_OF_THE_SWAMP_TRADING_CARD = ITEMS.register("archer_of_the_swamp_trading_card",
            () -> new CardItem("archer_of_the_swamp", 5, false, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NOPE_THE_FISH_TRADING_CARD = ITEMS.register("nope_the_fish_trading_card",
            () -> new CardItem("nope_the_fish", 6, false, new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SMOKING_LAUNCHER_TRADING_CARD = ITEMS.register("smoking_launcher_trading_card",
            () -> new CardItem("smoking_launcher", 7, false, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> JAM_THE_FROG_TRADING_CARD = ITEMS.register("jam_the_frog_trading_card",
            () -> new CardItem("jam_the_frog", 8, false, new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> FROSTED_BALLMAN_TRADING_CARD = ITEMS.register("frosted_ballman_trading_card",
            () -> new CardItem("frosted_ballman", 9, false, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SONIC_SCREECHER_TRADING_CARD = ITEMS.register("sonic_screecher_trading_card",
            () -> new CardItem("sonic_screecher", 10, false, new Item.Properties().rarity(Rarity.UNCOMMON)));

    //public static final RegistryObject<Item> GRAVEYARD_CRY_TRADING_CARD = ITEMS.register("graveyard_cry_trading_card",
    //        () -> new CardItem("graveyard_cry", 3, false, new Item.Properties().rarity(Rarity.COMMON)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
