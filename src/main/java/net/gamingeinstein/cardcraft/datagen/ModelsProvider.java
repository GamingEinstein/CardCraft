package net.gamingeinstein.cardcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

public class ModelsProvider extends FabricModelProvider {
    public ModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.DISPLAY_CASE, );
//        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(ModBlocks.PLAYMAT)
//                .with(When.create().set(Properties.HORIZONTAL_FACING, Direction.NORTH),
//                        BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R0)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Rulebook
        itemModelGenerator.register(ModItems.OFFICIAL_RULEBOOK, Models.GENERATED);
        // RNG Items
        itemModelGenerator.register(ModItems.SPECIAL_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPECIAL_D1, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_SPECIAL_D6, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPECIAL_D6, Models.GENERATED);
        // Cards and Booster Packs
        // ======================= //
        // Dev
        itemModelGenerator.register(ModItems.DEV_BOOSTER_PACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEV_TRADING_CARD, Models.GENERATED);
        // Legend of White Eyes
        itemModelGenerator.register(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIL_GERALD_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROODING_PIGLIN_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARPBONED_SCROOGE_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STICK_MAN_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOPE_THE_FISH_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOKING_LAUNCHER_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_THE_FROG_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROSTED_BALLMAN_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SONIC_SCREECHER_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOOK_OF_LOOTING_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICED_MARKSMAN_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOTCH_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUNGRY_CAMEL_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLEANER_ALLAY_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANGRY_VEX_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEATED_JUMPER_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_OF_THE_DEEP_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVING_BOX_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOCK_THIEF_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DECAYING_STEED_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WILD_FELINE_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MENACE_OF_THE_STARS_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.REPEATER_CROSSBOW_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUIDE_TO_BETTER_FARMING_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSCLE_BUILDER_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_TOE_BOOTS_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FEARED_SCREAM_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTED_GANG_BRUTE_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOUND_FLOUNDER_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MERCHANT_FROM_AFAR_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUST_LEAPER_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARDENER_GLOVES_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROTECTED_BUNNY_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEADER_OF_THE_ROTTED_GANG_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAVIGATION_MATE_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOSSY_BEAST_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRAINING_STICK_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTED_GANG_MUSCLE_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.OUTCAST_RESIDENT_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYSTERIOUS_MYSTIC_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOAT_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHTNING_BOOTS_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.OLD_SAGE_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MISGUIDED_HOG_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUNGRY_BEAST_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.POISON_CRAWLER_TRADING_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEROBRINE_TRADING_CARD, Models.GENERATED);
        // Tokens
        itemModelGenerator.register(ModItems.MAGMA_CUBE_TOKEN_TRADING_CARD, Models.GENERATED);
    }
}
