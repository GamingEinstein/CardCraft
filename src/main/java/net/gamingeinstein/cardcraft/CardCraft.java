package net.gamingeinstein.cardcraft;

import com.mojang.logging.LogUtils;
import net.gamingeinstein.cardcraft.config.CardCraftConfig;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.gamingeinstein.cardcraft.registries.ModCreativeModeTabs;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.gamingeinstein.cardcraft.registries.ModLootModifiers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CardCraft.MOD_ID)
public class CardCraft {

    public static final String MOD_ID = "cardcraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CardCraft() {
        CardCraftConfig.register(ModLoadingContext.get());

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

    /*
     *  The ultimate list of things to fix, add, change, etc. Will inevitably grow massive and become unmanageable
     *  The higher something is on this list, the more important it is. And the reverse is true
     *  TODO: Fix Display Case not dropping itself when mined, even when using the correct tool
     *  TODO: Make a system that gives players a card with a certain rarity if they open a number of Booster Packs
     *  TODO: Make a villager or some other mob that can trade individual cards
     *  TODO: Add more content besides the cards (advancements, items, structures, mobs)
     *  TODO: Make rarities configurable (how do config?)
     *  TODO: Design the actual game (probably won't come until after the cards have been made)
     *  TODO: Fix Booster Pack getting used in Creative if it's a single item and is used in a slot where cards would go
     *  TODO: Make Fabric port once the main content of the mod is planned out and exists (also make project multiloader)
     */
}
