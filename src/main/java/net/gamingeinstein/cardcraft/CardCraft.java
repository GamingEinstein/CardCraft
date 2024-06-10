package net.gamingeinstein.cardcraft;

import com.mojang.logging.LogUtils;
import net.gamingeinstein.cardcraft.config.CardCraftConfigClient;
import net.gamingeinstein.cardcraft.config.CardCraftConfigCommon;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.gamingeinstein.cardcraft.registries.ModCreativeModeTabs;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.gamingeinstein.cardcraft.registries.ModLootModifiers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CardCraft.MOD_ID)
public class CardCraft {
    public static final String MOD_ID = "cardcraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static boolean patchouliLoaded = false;

    public CardCraft() {
        patchouliLoaded = ModList.get().isLoaded("patchouli");

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CardCraftConfigClient.SPEC, "cardcraft-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CardCraftConfigCommon.SPEC, "cardcraft-common.toml");

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
     *  The higher something is on this list, the more important it is, and vice versa
     *  TODO:
     *   - Fix Patchouli/EMI not letting runData work when included in the build.gradle file (something about a Mixin error)
     *   - Make Playmat hitbox rotate when placed
     *   - Have 100 cards for the first Booster Pack
     *   - Make a system that gives players a guaranteed rarity if they open a certain number of Booster Packs
     *   - Make a villager or some other mob that can trade individual cards
     *   - Make an API or something for the rest of the mod to call on when it needs to get a specific Card or Booster Pack instead of rewriting the same set of code repeatedly
     *   - Add more content besides the cards (advancements, items, structures, mobs)
     *   - Make all text translatable instead of mostly hardcoded
     *   - Design the actual game (probably won't come until after the cards have been made)
     *   - Fix Booster Pack getting used in Creative if it's a single item and is used in a slot where cards would go
     *   - Make Fabric port once the main content of the mod is planned out and exists (also make project multi-loader, which will probably come even later)
     */
}
