package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ItemModelProvider {
    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CardCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // There's got to be a simpler way of doing this en-masse
        // Normal Items
        simpleItem(ModItems.OFFICIAL_RULEBOOK);
        simpleItem(ModItems.SPECIAL_COIN);
        simpleItem(ModItems.SPECIAL_D1);
        simpleItem(ModItems.WHITE_SPECIAL_D6);
        simpleItem(ModItems.LIGHT_GRAY_SPECIAL_D6);
        simpleItem(ModItems.GRAY_SPECIAL_D6);
        simpleItem(ModItems.BLACK_SPECIAL_D6);
        simpleItem(ModItems.BROWN_SPECIAL_D6);
        simpleItem(ModItems.RED_SPECIAL_D6);
        simpleItem(ModItems.ORANGE_SPECIAL_D6);
        simpleItem(ModItems.YELLOW_SPECIAL_D6);
        simpleItem(ModItems.LIME_SPECIAL_D6);
        simpleItem(ModItems.GREEN_SPECIAL_D6);
        simpleItem(ModItems.CYAN_SPECIAL_D6);
        simpleItem(ModItems.LIGHT_BLUE_SPECIAL_D6);
        simpleItem(ModItems.BLUE_SPECIAL_D6);
        simpleItem(ModItems.PURPLE_SPECIAL_D6);
        simpleItem(ModItems.MAGENTA_SPECIAL_D6);
        simpleItem(ModItems.PINK_SPECIAL_D6);
        // Dev
        simpleItem(ModItems.DEV_BOOSTER_PACK);
        simpleItem(ModItems.DEV_TRADING_CARD);
        // Legend of White Eyes
        simpleItem(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK);
        simpleItem(ModItems.LIL_GERALD_TRADING_CARD);
        simpleItem(ModItems.BROODING_PIGLIN_TRADING_CARD);
        simpleItem(ModItems.SHARPBONED_SCROOGE_TRADING_CARD);
        simpleItem(ModItems.STICK_MAN_TRADING_CARD);
        simpleItem(ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD);
        simpleItem(ModItems.NOPE_THE_FISH_TRADING_CARD);
        simpleItem(ModItems.SMOKING_LAUNCHER_TRADING_CARD);
        simpleItem(ModItems.JAM_THE_FROG_TRADING_CARD);
        simpleItem(ModItems.FROSTED_BALLMAN_TRADING_CARD);
        simpleItem(ModItems.SONIC_SCREECHER_TRADING_CARD);
        simpleItem(ModItems.BOOK_OF_LOOTING_TRADING_CARD);
        simpleItem(ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD);
        simpleItem(ModItems.ICED_MARKSMAN_TRADING_CARD);
        simpleItem(ModItems.NOTCH_TRADING_CARD);
        simpleItem(ModItems.APPLE_TRADING_CARD);
        simpleItem(ModItems.HUNGRY_CAMEL_TRADING_CARD);
        simpleItem(ModItems.CLEANER_ALLAY_TRADING_CARD);
        simpleItem(ModItems.ANGRY_VEX_TRADING_CARD);
        simpleItem(ModItems.HEATED_JUMPER_TRADING_CARD);
        simpleItem(ModItems.GLOW_OF_THE_DEEP_TRADING_CARD);
        simpleItem(ModItems.LIVING_BOX_TRADING_CARD);
        simpleItem(ModItems.BLOCK_THIEF_TRADING_CARD);
        simpleItem(ModItems.DECAYING_STEED_TRADING_CARD);
        simpleItem(ModItems.WILD_FELINE_TRADING_CARD);
        simpleItem(ModItems.MENACE_OF_THE_STARS_TRADING_CARD);
        simpleItem(ModItems.REPEATER_CROSSBOW_TRADING_CARD);
        simpleItem(ModItems.GUIDE_TO_BETTER_FARMING_TRADING_CARD);
        simpleItem(ModItems.MUSCLE_BUILDER_TRADING_CARD);
        simpleItem(ModItems.IRON_TOE_BOOTS_TRADING_CARD);
        simpleItem(ModItems.FEARED_SCREAM_TRADING_CARD);
        simpleItem(ModItems.ROTTED_GANG_BRUTE_TRADING_CARD);
        simpleItem(ModItems.FOUND_FLOUNDER_TRADING_CARD);
        simpleItem(ModItems.MERCHANT_FROM_AFAR_TRADING_CARD);
        simpleItem(ModItems.GUST_LEAPER_TRADING_CARD);
        simpleItem(ModItems.GARDENER_GLOVES_TRADING_CARD);
        simpleItem(ModItems.PROTECTED_BUNNY_TRADING_CARD);
        simpleItem(ModItems.LEADER_OF_THE_ROTTED_GANG_TRADING_CARD);
        simpleItem(ModItems.NAVIGATION_MATE_TRADING_CARD);
        simpleItem(ModItems.MOSSY_BEAST_TRADING_CARD);
        simpleItem(ModItems.TRAINING_STICK_TRADING_CARD);
        simpleItem(ModItems.ROTTED_GANG_MUSCLE_TRADING_CARD);
        simpleItem(ModItems.OUTCAST_RESIDENT_TRADING_CARD);
        simpleItem(ModItems.MYSTERIOUS_MYSTIC_TRADING_CARD);
        simpleItem(ModItems.BLOAT_TRADING_CARD);
        simpleItem(ModItems.LIGHTNING_BOOTS_TRADING_CARD);
        simpleItem(ModItems.OLD_SAGE_TRADING_CARD);
        simpleItem(ModItems.MISGUIDED_HOG_TRADING_CARD);
        simpleItem(ModItems.HUNGRY_BEAST_TRADING_CARD);
        simpleItem(ModItems.POISON_CRAWLER_TRADING_CARD);
        simpleItem(ModItems.HEROBRINE_TRADING_CARD);
        // Tokens
        simpleItem(ModItems.MAGMA_CUBE_TOKEN_TRADING_CARD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CardCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
