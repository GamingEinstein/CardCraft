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
    public static final RegistryObject<Item> BASE_TRADING_CARD = ITEMS.register("base_trading_card",
            () -> new CardItem("base", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BASE_BOOSTER_PACK = ITEMS.register("base_booster_pack",
            () -> new BoosterPackItem("base", new Item.Properties().rarity(Rarity.EPIC)));

    // Legend of White Eyes Pack: Includes several overworld mobs
    public static final RegistryObject<Item> WHITE_EYES_BOOSTER_PACK = ITEMS.register("white_eyes_booster_pack",
            () -> new BoosterPackItem("white_eyes", new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ALEX_TRADING_CARD = ITEMS.register("alex_trading_card",
            () -> new CardItem("alex", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BAT_TRADING_CARD = ITEMS.register("bat_trading_card",
            () -> new CardItem("bat", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> BLAZE_TRADING_CARD = ITEMS.register("blaze_trading_card",
            () -> new CardItem("blaze", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CAT_TRADING_CARD = ITEMS.register("cat_trading_card",
            () -> new CardItem("cat", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CAVE_SPIDER_TRADING_CARD = ITEMS.register("cave_spider_trading_card",
            () -> new CardItem("cave_spider", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CHICKEN_TRADING_CARD = ITEMS.register("chicken_trading_card",
            () -> new CardItem("chicken", new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COD_TRADING_CARD = ITEMS.register("cod_trading_card",
            () -> new CardItem("cod", new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COW_TRADING_CARD = ITEMS.register("cow_trading_card",
            () -> new CardItem("cow", new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CREEPER_TRADING_CARD = ITEMS.register("creeper_trading_card",
            () -> new CardItem("creeper", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DONKEY_TRADING_CARD = ITEMS.register("donkey_trading_card",
            () -> new CardItem("donkey", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ENDERMAN_TRADING_CARD = ITEMS.register("enderman_trading_card",
            () -> new CardItem("enderman", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ENDER_DRAGON_TRADING_CARD = ITEMS.register("ender_dragon_trading_card",
            () -> new CardItem("ender_dragon", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> GHAST_TRADING_CARD = ITEMS.register("ghast_trading_card",
            () -> new CardItem("ghast", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> HEROBRINE_TRADING_CARD = ITEMS.register("herobrine_trading_card",
            () -> new CardItem("herobrine", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> HORSE_TRADING_CARD = ITEMS.register("horse_trading_card",
            () -> new CardItem("horse", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> IRON_GOLEM_TRADING_CARD = ITEMS.register("iron_golem_trading_card",
            () -> new CardItem("iron_golem", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> MAGMA_CUBE_TRADING_CARD = ITEMS.register("magma_cube_trading_card",
            () -> new CardItem("magma_cube", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MOOSHROOM_TRADING_CARD = ITEMS.register("mooshroom_trading_card",
            () -> new CardItem("mooshroom", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> MULE_TRADING_CARD = ITEMS.register("mule_trading_card",
            () -> new CardItem("mule", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> OCELOT_TRADING_CARD = ITEMS.register("ocelot_trading_card",
            () -> new CardItem("ocelot", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PIG_TRADING_CARD = ITEMS.register("pig_trading_card",
            () -> new CardItem("pig", new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RABBIT_TRADING_CARD = ITEMS.register("rabbit_trading_card",
            () -> new CardItem("rabbit", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SHEEP_TRADING_CARD = ITEMS.register("sheep_trading_card",
            () -> new CardItem("sheep", new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SALMON_TRADING_CARD = ITEMS.register("salmon_trading_card",
            () -> new CardItem("salmon", new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SILVERFISH_TRADING_CARD = ITEMS.register("silverfish_trading_card",
            () -> new CardItem("silverfish", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SKELETON_TRADING_CARD = ITEMS.register("skeleton_trading_card",
            () -> new CardItem("skeleton", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SKELETON_HORSE_TRADING_CARD = ITEMS.register("skeleton_horse_trading_card",
            () -> new CardItem("skeleton_horse", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> SLIME_TRADING_CARD = ITEMS.register("slime_trading_card",
            () -> new CardItem("slime", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SNOW_GOLEM_TRADING_CARD = ITEMS.register("snow_golem_trading_card",
            () -> new CardItem("snow_golem", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SPIDER_TRADING_CARD = ITEMS.register("spider_trading_card",
            () -> new CardItem("spider", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SQUID_TRADING_CARD = ITEMS.register("squid_trading_card",
            () -> new CardItem("squid", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STEVE_TRADING_CARD = ITEMS.register("steve_trading_card",
            () -> new CardItem("steve", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> VILLAGER_TRADING_CARD = ITEMS.register("villager_trading_card",
            () -> new CardItem("villager", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> WITCH_TRADING_CARD = ITEMS.register("witch_trading_card",
            () -> new CardItem("witch", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> WOLF_TRADING_CARD = ITEMS.register("wolf_trading_card",
            () -> new CardItem("wolf", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ZOMBIE_TRADING_CARD = ITEMS.register("zombie_trading_card",
            () -> new CardItem("zombie", new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ZOMBIE_HORSE_TRADING_CARD = ITEMS.register("zombie_horse_trading_card",
            () -> new CardItem("zombie_horse", new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ZOMBIE_VILLAGER_TRADING_CARD = ITEMS.register("zombie_villager_trading_card",
            () -> new CardItem("zombie_villager", new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ZOMBIFIED_PIGLIN_TRADING_CARD = ITEMS.register("zombified_piglin_trading_card",
            () -> new CardItem("zombified_piglin", new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
