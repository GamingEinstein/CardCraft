package net.gamingeinstein.cardcraft.config;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/*
 * Basically copied this from Traveler's Backpack, since it was the most sensible one that works.
 * That, and... there aren't really any updated tutorials on configs... nor are they this simple...
 * This might not work or is broken somewhere, but hey, at least it's something I guess
 */

@Mod.EventBusSubscriber(modid = CardCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CardCraftConfig {

    //Test Config
    public static boolean testButton;

    public static class Common {

        private static final String REGISTRY_NAME_MATCHER = "([a-z0-9_.-]+:[a-z0-9_/.-]+)";

        TestSettings testSettings;

        Common(final ForgeConfigSpec.Builder builder) {

            builder.comment("Common Config Settings")
                    .push("common");

            //Tests Settings
            testSettings = new TestSettings(builder, "testSettings");

            builder.pop();
        }

        public static class TestSettings {

            public final ForgeConfigSpec.BooleanValue testButton;

            TestSettings(final ForgeConfigSpec.Builder builder, final String path) {

                builder.push(path);

                //Test Settings
                testButton = builder
                        .comment("Massive test time")
                        .define("testSetting", false);

                builder.pop();
            }
        }

        public void loadItemsFromConfig(List<? extends String> configList, List<Item> targetList) {

            for (String registryName : configList) {
                ResourceLocation res  = new ResourceLocation(registryName);

                if (ForgeRegistries.ITEMS.containsKey(res)) {
                    targetList.add(ForgeRegistries.ITEMS.getValue(res));
                }
            }
        }
    }

    //Common
    private static final ForgeConfigSpec commonSpec;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        commonSpec = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    //Registry
    public static void register(final ModLoadingContext context) {

        context.registerConfig(ModConfig.Type.COMMON, commonSpec);
    }

    @SubscribeEvent
    public static void onModConfigEvent(final ModConfigEvent.Loading configEvent) {

        if (configEvent.getConfig().getSpec() == CardCraftConfig.commonSpec) {
            bakeCommonConfig();
        }
    }

    public static void bakeCommonConfig() {

        //Test Settings
        testButton = COMMON.testSettings.testButton.get();
    }

    //Gather Data
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        boolean includeServer = event.includeServer();
    }
}
