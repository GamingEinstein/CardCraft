package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.gamingeinstein.cardcraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                    CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, CardCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Items.RNG_ITEMS)
                .addTag(ModTags.Items.COINS)
                .addTag(ModTags.Items.DICE);

        this.tag(ModTags.Items.COINS)
                .add(ModItems.SPECIAL_COIN.get());

        this.tag(ModTags.Items.DICE)
                .add(ModItems.SPECIAL_D1.get(),
                        ModItems.WHITE_SPECIAL_D6.get(),
                        ModItems.LIGHT_GRAY_SPECIAL_D6.get(),
                        ModItems.GRAY_SPECIAL_D6.get(),
                        ModItems.BLACK_SPECIAL_D6.get(),
                        ModItems.BROWN_SPECIAL_D6.get(),
                        ModItems.RED_SPECIAL_D6.get(),
                        ModItems.ORANGE_SPECIAL_D6.get(),
                        ModItems.YELLOW_SPECIAL_D6.get(),
                        ModItems.LIME_SPECIAL_D6.get(),
                        ModItems.GREEN_SPECIAL_D6.get(),
                        ModItems.CYAN_SPECIAL_D6.get(),
                        ModItems.LIGHT_BLUE_SPECIAL_D6.get(),
                        ModItems.BLUE_SPECIAL_D6.get(),
                        ModItems.PURPLE_SPECIAL_D6.get(),
                        ModItems.MAGENTA_SPECIAL_D6.get(),
                        ModItems.PINK_SPECIAL_D6.get());

        this.tag(ModTags.Items.BOOSTER_PACKS)
                .add(ModItems.DEV_BOOSTER_PACK.get(),
                        ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK.get());

        this.tag(ModTags.Items.CARDS)
                .add(ModItems.DEV_TRADING_CARD.get())
                .addTag(ModTags.Items.LEGEND_OF_WHITE_EYES_CARDS)
                .addTag(ModTags.Items.TOKEN_CARDS);

        this.tag(ModTags.Items.LEGEND_OF_WHITE_EYES_CARDS)
                .add(ModItems.LIL_GERALD_TRADING_CARD.get(),
                        ModItems.BROODING_PIGLIN_TRADING_CARD.get(),
                        ModItems.SHARPBONED_SCROOGE_TRADING_CARD.get(),
                        ModItems.STICK_MAN_TRADING_CARD.get(),
                        ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD.get(),
                        ModItems.NOPE_THE_FISH_TRADING_CARD.get(),
                        ModItems.SMOKING_LAUNCHER_TRADING_CARD.get(),
                        ModItems.JAM_THE_FROG_TRADING_CARD.get(),
                        ModItems.FROSTED_BALLMAN_TRADING_CARD.get(),
                        ModItems.SONIC_SCREECHER_TRADING_CARD.get(),
                        ModItems.BOOK_OF_LOOTING_TRADING_CARD.get(),
                        ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD.get(),
                        ModItems.ICED_MARKSMAN_TRADING_CARD.get(),
                        ModItems.NOTCH_TRADING_CARD.get(),
                        ModItems.APPLE_TRADING_CARD.get(),
                        ModItems.HUNGRY_CAMEL_TRADING_CARD.get(),
                        ModItems.CLEANER_ALLAY_TRADING_CARD.get(),
                        ModItems.ANGRY_VEX_TRADING_CARD.get(),
                        ModItems.HEATED_JUMPER_TRADING_CARD.get(),
                        ModItems.GLOW_OF_THE_DEEP_TRADING_CARD.get(),
                        ModItems.LIVING_BOX_TRADING_CARD.get(),
                        ModItems.BLOCK_THIEF_TRADING_CARD.get(),
                        ModItems.DECAYING_STEED_TRADING_CARD.get(),
                        ModItems.WILD_FELINE_TRADING_CARD.get());
                        ModItems.MENACE_OF_THE_STARS_TRADING_CARD.get();
                        ModItems.REPEATER_CROSSBOW_TRADING_CARD.get();
                        ModItems.GUIDE_TO_BETTER_FARMING_TRADING_CARD.get();
                        ModItems.MUSCLE_BUILDER_TRADING_CARD.get();
                        ModItems.IRON_TOE_BOOTS_TRADING_CARD.get();
                        ModItems.FEARED_SCREAM_TRADING_CARD.get();
                        ModItems.ROTTED_GANG_BRUTE_TRADING_CARD.get();
                        ModItems.FOUND_FLOUNDER_TRADING_CARD.get();
                        ModItems.MERCHANT_FROM_AFAR_TRADING_CARD.get();
                        ModItems.GUST_LEAPER_TRADING_CARD.get();
                        ModItems.GARDENER_GLOVES_TRADING_CARD.get();
                        ModItems.PROTECTED_BUNNY_TRADING_CARD.get();
                        ModItems.LEADER_OF_THE_ROTTED_GANG_TRADING_CARD.get();
                        ModItems.NAVIGATION_MATE_TRADING_CARD.get();
                        ModItems.MOSSY_BEAST_TRADING_CARD.get();
                        ModItems.TRAINING_STICK_TRADING_CARD.get();
                        ModItems.ROTTED_GANG_MUSCLE_TRADING_CARD.get();
                        ModItems.OUTCAST_RESIDENT_TRADING_CARD.get();
                        ModItems.MYSTERIOUS_MYSTIC_TRADING_CARD.get();
                        ModItems.BLOAT_TRADING_CARD.get();
                        ModItems.LIGHTNING_BOOTS_TRADING_CARD.get();
                        ModItems.OLD_SAGE_TRADING_CARD.get();
                        ModItems.MISGUIDED_HOG_TRADING_CARD.get();
                        ModItems.HUNGRY_BEAST_TRADING_CARD.get();
                        ModItems.POISON_CRAWLER_TRADING_CARD.get();
                        ModItems.HEROBRINE_TRADING_CARD.get();

        this.tag(ModTags.Items.TOKEN_CARDS)
                .add(ModItems.MAGMA_CUBE_TOKEN_TRADING_CARD.get());
    }
}