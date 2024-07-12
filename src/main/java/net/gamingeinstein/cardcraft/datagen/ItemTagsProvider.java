package net.gamingeinstein.cardcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.gamingeinstein.cardcraft.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.RNG_ITEMS)
                .addTag(ModTags.Items.COINS)
                .addTag(ModTags.Items.DICE);

        getOrCreateTagBuilder(ModTags.Items.COINS)
                .add(ModItems.SPECIAL_COIN);

        getOrCreateTagBuilder(ModTags.Items.DICE)
                .add(ModItems.SPECIAL_D1,
                        ModItems.WHITE_SPECIAL_D6,
                        ModItems.LIGHT_GRAY_SPECIAL_D6,
                        ModItems.GRAY_SPECIAL_D6,
                        ModItems.BLACK_SPECIAL_D6,
                        ModItems.BROWN_SPECIAL_D6,
                        ModItems.RED_SPECIAL_D6,
                        ModItems.ORANGE_SPECIAL_D6,
                        ModItems.YELLOW_SPECIAL_D6,
                        ModItems.LIME_SPECIAL_D6,
                        ModItems.GREEN_SPECIAL_D6,
                        ModItems.CYAN_SPECIAL_D6,
                        ModItems.LIGHT_BLUE_SPECIAL_D6,
                        ModItems.BLUE_SPECIAL_D6,
                        ModItems.PURPLE_SPECIAL_D6,
                        ModItems.MAGENTA_SPECIAL_D6,
                        ModItems.PINK_SPECIAL_D6);

        getOrCreateTagBuilder(ModTags.Items.BOOSTER_PACKS)
                .add(ModItems.DEV_BOOSTER_PACK,
                        ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK);

        getOrCreateTagBuilder(ModTags.Items.CARDS)
                .add(ModItems.DEV_TRADING_CARD)
                .addTag(ModTags.Items.LEGEND_OF_WHITE_EYES_CARDS)
                .addTag(ModTags.Items.TOKEN_CARDS);

        getOrCreateTagBuilder(ModTags.Items.LEGEND_OF_WHITE_EYES_CARDS)
                .add(ModItems.LIL_GERALD_TRADING_CARD,
                        ModItems.BROODING_PIGLIN_TRADING_CARD,
                        ModItems.SHARPBONED_SCROOGE_TRADING_CARD,
                        ModItems.STICK_MAN_TRADING_CARD,
                        ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD,
                        ModItems.NOPE_THE_FISH_TRADING_CARD,
                        ModItems.SMOKING_LAUNCHER_TRADING_CARD,
                        ModItems.JAM_THE_FROG_TRADING_CARD,
                        ModItems.FROSTED_BALLMAN_TRADING_CARD,
                        ModItems.SONIC_SCREECHER_TRADING_CARD,
                        ModItems.BOOK_OF_LOOTING_TRADING_CARD,
                        ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD,
                        ModItems.ICED_MARKSMAN_TRADING_CARD,
                        ModItems.NOTCH_TRADING_CARD,
                        ModItems.APPLE_TRADING_CARD,
                        ModItems.HUNGRY_CAMEL_TRADING_CARD,
                        ModItems.CLEANER_ALLAY_TRADING_CARD,
                        ModItems.ANGRY_VEX_TRADING_CARD,
                        ModItems.HEATED_JUMPER_TRADING_CARD,
                        ModItems.GLOW_OF_THE_DEEP_TRADING_CARD,
                        ModItems.LIVING_BOX_TRADING_CARD,
                        ModItems.BLOCK_THIEF_TRADING_CARD,
                        ModItems.DECAYING_STEED_TRADING_CARD,
                        ModItems.WILD_FELINE_TRADING_CARD,
                        ModItems.MENACE_OF_THE_STARS_TRADING_CARD,
                        ModItems.REPEATER_CROSSBOW_TRADING_CARD,
                        ModItems.GUIDE_TO_BETTER_FARMING_TRADING_CARD,
                        ModItems.MUSCLE_BUILDER_TRADING_CARD,
                        ModItems.IRON_TOE_BOOTS_TRADING_CARD,
                        ModItems.FEARED_SCREAM_TRADING_CARD,
                        ModItems.ROTTED_GANG_BRUTE_TRADING_CARD,
                        ModItems.FOUND_FLOUNDER_TRADING_CARD,
                        ModItems.MERCHANT_FROM_AFAR_TRADING_CARD,
                        ModItems.GUST_LEAPER_TRADING_CARD,
                        ModItems.GARDENER_GLOVES_TRADING_CARD,
                        ModItems.PROTECTED_BUNNY_TRADING_CARD,
                        ModItems.LEADER_OF_THE_ROTTED_GANG_TRADING_CARD,
                        ModItems.NAVIGATION_MATE_TRADING_CARD,
                        ModItems.MOSSY_BEAST_TRADING_CARD,
                        ModItems.TRAINING_STICK_TRADING_CARD,
                        ModItems.ROTTED_GANG_MUSCLE_TRADING_CARD,
                        ModItems.OUTCAST_RESIDENT_TRADING_CARD,
                        ModItems.MYSTERIOUS_MYSTIC_TRADING_CARD,
                        ModItems.BLOAT_TRADING_CARD,
                        ModItems.LIGHTNING_BOOTS_TRADING_CARD,
                        ModItems.OLD_SAGE_TRADING_CARD,
                        ModItems.MISGUIDED_HOG_TRADING_CARD,
                        ModItems.HUNGRY_BEAST_TRADING_CARD,
                        ModItems.POISON_CRAWLER_TRADING_CARD,
                        ModItems.HEROBRINE_TRADING_CARD);

        getOrCreateTagBuilder(ModTags.Items.TOKEN_CARDS)
                .add(ModItems.MAGMA_CUBE_TOKEN_TRADING_CARD);
    }
}
