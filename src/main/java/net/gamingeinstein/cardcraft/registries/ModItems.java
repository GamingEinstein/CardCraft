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
            () -> new CardItem("base", 0, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BASE_BOOSTER_PACK = ITEMS.register("base_booster_pack",
            () -> new BoosterPackItem("base", 0, new Item.Properties().rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
