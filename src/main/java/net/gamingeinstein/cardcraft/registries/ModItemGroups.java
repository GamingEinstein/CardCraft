package net.gamingeinstein.cardcraft.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CARDCRAFT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CardCraft.MOD_ID, "cardcraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.cardcraft"))
                    .icon(() -> new ItemStack(ModItems.OFFICIAL_RULEBOOK)).entries((displayContext, entries) -> {
                        // Normal Things
                        entries.add(ModItems.OFFICIAL_RULEBOOK);
                        entries.add(ModBlocks.DISPLAY_CASE);
                        entries.add(ModBlocks.PLAYMAT);
                        entries.add(ModItems.SPECIAL_COIN);
                        entries.add(ModItems.SPECIAL_D1);
                        entries.add(ModItems.WHITE_SPECIAL_D6);
                        entries.add(ModItems.LIGHT_GRAY_SPECIAL_D6);
                        entries.add(ModItems.GRAY_SPECIAL_D6);
                        entries.add(ModItems.BLACK_SPECIAL_D6);
                        entries.add(ModItems.BROWN_SPECIAL_D6);
                        entries.add(ModItems.RED_SPECIAL_D6);
                        entries.add(ModItems.ORANGE_SPECIAL_D6);
                        entries.add(ModItems.YELLOW_SPECIAL_D6);
                        entries.add(ModItems.LIME_SPECIAL_D6);
                        entries.add(ModItems.GREEN_SPECIAL_D6);
                        entries.add(ModItems.CYAN_SPECIAL_D6);
                        entries.add(ModItems.LIGHT_BLUE_SPECIAL_D6);
                        entries.add(ModItems.BLUE_SPECIAL_D6);
                        entries.add(ModItems.PURPLE_SPECIAL_D6);
                        entries.add(ModItems.MAGENTA_SPECIAL_D6);
                        entries.add(ModItems.PINK_SPECIAL_D6);
                        // Booster Packs
                        entries.add(ModItems.DEV_BOOSTER_PACK);
                        entries.add(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK);

                    }).build());
    public static final ItemGroup CARDCRAFT_CARDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CardCraft.MOD_ID, "cardcraft_cards"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.cardcraft_cards"))
                    .icon(() -> new ItemStack(ModItems.DEV_TRADING_CARD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DEV_TRADING_CARD);
                        entries.add(ModItems.LIL_GERALD_TRADING_CARD);
                        entries.add(ModItems.BROODING_PIGLIN_TRADING_CARD);
                        entries.add(ModItems.SHARPBONED_SCROOGE_TRADING_CARD);
                        entries.add(ModItems.STICK_MAN_TRADING_CARD);
                        entries.add(ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD);
                        entries.add(ModItems.NOPE_THE_FISH_TRADING_CARD);
                        entries.add(ModItems.SMOKING_LAUNCHER_TRADING_CARD);
                        entries.add(ModItems.JAM_THE_FROG_TRADING_CARD);
                        entries.add(ModItems.FROSTED_BALLMAN_TRADING_CARD);
                        entries.add(ModItems.SONIC_SCREECHER_TRADING_CARD);
                        entries.add(ModItems.BOOK_OF_LOOTING_TRADING_CARD);
                        entries.add(ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD);
                        entries.add(ModItems.ICED_MARKSMAN_TRADING_CARD);
                        entries.add(ModItems.NOTCH_TRADING_CARD);
                        entries.add(ModItems.APPLE_TRADING_CARD);
                        entries.add(ModItems.HUNGRY_CAMEL_TRADING_CARD);
                        entries.add(ModItems.CLEANER_ALLAY_TRADING_CARD);
                        entries.add(ModItems.ANGRY_VEX_TRADING_CARD);
                        entries.add(ModItems.HEATED_JUMPER_TRADING_CARD);
                        entries.add(ModItems.GLOW_OF_THE_DEEP_TRADING_CARD);
                        entries.add(ModItems.LIVING_BOX_TRADING_CARD);
                        entries.add(ModItems.BLOCK_THIEF_TRADING_CARD);
                        entries.add(ModItems.DECAYING_STEED_TRADING_CARD);
                        entries.add(ModItems.WILD_FELINE_TRADING_CARD);
                        entries.add(ModItems.MENACE_OF_THE_STARS_TRADING_CARD);
                        entries.add(ModItems.REPEATER_CROSSBOW_TRADING_CARD);
                        entries.add(ModItems.GUIDE_TO_BETTER_FARMING_TRADING_CARD);
                        entries.add(ModItems.MUSCLE_BUILDER_TRADING_CARD);
                        entries.add(ModItems.IRON_TOE_BOOTS_TRADING_CARD);
                        entries.add(ModItems.FEARED_SCREAM_TRADING_CARD);
                        entries.add(ModItems.ROTTED_GANG_BRUTE_TRADING_CARD);
                        entries.add(ModItems.FOUND_FLOUNDER_TRADING_CARD);
                        entries.add(ModItems.MERCHANT_FROM_AFAR_TRADING_CARD);
                        entries.add(ModItems.GUST_LEAPER_TRADING_CARD);
                        entries.add(ModItems.GARDENER_GLOVES_TRADING_CARD);
                        entries.add(ModItems.PROTECTED_BUNNY_TRADING_CARD);
                        entries.add(ModItems.LEADER_OF_THE_ROTTED_GANG_TRADING_CARD);
                        entries.add(ModItems.NAVIGATION_MATE_TRADING_CARD);
                        entries.add(ModItems.MOSSY_BEAST_TRADING_CARD);
                        entries.add(ModItems.TRAINING_STICK_TRADING_CARD);
                        entries.add(ModItems.ROTTED_GANG_MUSCLE_TRADING_CARD);
                        entries.add(ModItems.OUTCAST_RESIDENT_TRADING_CARD);
                        entries.add(ModItems.MYSTERIOUS_MYSTIC_TRADING_CARD);
                        entries.add(ModItems.BLOAT_TRADING_CARD);
                        entries.add(ModItems.LIGHTNING_BOOTS_TRADING_CARD);
                        entries.add(ModItems.OLD_SAGE_TRADING_CARD);
                        entries.add(ModItems.MISGUIDED_HOG_TRADING_CARD);
                        entries.add(ModItems.HUNGRY_BEAST_TRADING_CARD);
                        entries.add(ModItems.POISON_CRAWLER_TRADING_CARD);
                        entries.add(ModItems.HEROBRINE_TRADING_CARD);
                        // Tokens
                        entries.add(ModItems.MAGMA_CUBE_TOKEN_TRADING_CARD);
                    }).build());

    public static void register() {
        CardCraft.LOGGER.info("Registering Item Groups for " + CardCraft.MOD_ID);
    }
}
