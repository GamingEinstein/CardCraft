package net.gamingeinstein.cardcraft;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.gamingeinstein.cardcraft.config.CardCraftClientConfig;
import net.gamingeinstein.cardcraft.config.CardCraftServerConfig;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.gamingeinstein.cardcraft.registries.ModItemGroups;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.gamingeinstein.cardcraft.util.ModLootTableModifiers;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 *  The ultimate list of things to fix, add, change, etc. Will inevitably grow massive and become unmanageable
 *  The higher something is on this list, the more important it is, and vice versa
 *  TODO:
 *   - Make Display Case and Playmat datagen correctly
 *   - Make Playmat render correctly
 *   - Make Playmat hitbox rotate when placed
 *   - Have 100 cards for the first Booster Pack (will be done for the first beta release)
 *   - Datagen more things (mainly advancements and lang files)
 *   - Make a system that gives players a guaranteed rarity if they open a certain number of Booster Packs
 *   - Make a villager or some other mob that can trade individual cards
 *   - Have cards have a right-click that enlarges the card, in order to provide details without using tooltips. Just thought of a super hacky-ish kinda way to do it using GUI screens, since that can allow text in places
 *   - Make an API or something for the rest of the mod to call on when it needs to get a specific Card or Booster Pack instead of rewriting the same set of code repeatedly
 *   - Add more content besides the cards (advancements, items, structures, mobs)
 *   - Design the actual game (probably won't come until after the cards have been made)
 *   - Fix Booster Pack getting used in Creative if it's a single item and is used in a slot where cards would go
 *   - Port to newer versions/different loaders once the main content of the mod is planned out and exists (also make project multi-loader?, which will probably come even later)
 */

public class CardCraft implements ModInitializer {
    public static final String MOD_ID = "cardcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger("CardCraft");

    public static boolean patchouliLoaded = false;

    @Override
    public void onInitialize() {
        patchouliLoaded = FabricLoader.getInstance().isModLoaded("patchouli");

        ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.CLIENT, CardCraftClientConfig.SPEC, "cardcraft-client.toml");
        ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.SERVER, CardCraftServerConfig.SPEC, "cardcraft-server.toml");

        ModBlocks.register();
        ModItemGroups.register();
        ModItems.register();

        ModLootTableModifiers.modifyLootTables();
    }
}
