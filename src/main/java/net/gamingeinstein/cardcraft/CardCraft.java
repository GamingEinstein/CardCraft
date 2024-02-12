package net.gamingeinstein.cardcraft;

import com.mojang.logging.LogUtils;
import net.gamingeinstein.cardcraft.block.ModBlocks;
import net.gamingeinstein.cardcraft.config.CardCraftConfig;
import net.gamingeinstein.cardcraft.item.ModItems;
import net.gamingeinstein.cardcraft.item.ModCreativeModeTabs;
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

        //ModBlockEntities.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        //ModMenuTypes.register(modEventBus);
        //ModRecipes.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            //MenuScreens.register(ModMenuTypes.XXX.get(), XXX::new);
        }
    }
}
