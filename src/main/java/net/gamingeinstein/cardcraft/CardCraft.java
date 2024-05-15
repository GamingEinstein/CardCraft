package net.gamingeinstein.cardcraft;

import com.mojang.logging.LogUtils;
import net.gamingeinstein.cardcraft.config.CardCraftConfig;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.gamingeinstein.cardcraft.registries.ModCreativeModeTabs;
import net.gamingeinstein.cardcraft.registries.ModItems;
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
     *  TODO: Fix Display Case not dropping itself when mined, even when using the correct tool
     *  TODO: Fix Booster Pack getting used in Creative if it's a single item and is used in a slot where cards would go
     *  TODO: Make a system that can count how many boosters a player has opened, then giving them a certain rarity of card if they reach that threshold
     *  TODO: Add more cards and details
     *  TODO: Figure out how to play the game. Maybe that can wait until I have enough content added
     *  TODO: Add more content besides the cards (advancements, structures(?), villager profession(?), mobs(?))
     *  TODO: Add a way to obtain booster packs and cards in Survival (probably loot chests for Booster Packs and Villagers for individual cards)
     *  TODO: Make rarities configurable (will require learning how to make configs, since for some reason there isn't a tutorial on the internet for that)
     *  TODO: Make Fabric port once the main content of the mod is planned out and exists? Or maybe someone else can do that?
     */
}
