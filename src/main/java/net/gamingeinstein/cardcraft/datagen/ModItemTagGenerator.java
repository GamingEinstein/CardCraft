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

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, CardCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Items.BOOSTER_PACKS)
                .add(ModItems.BASE_BOOSTER_PACK.get(),
                        ModItems.WHITE_EYES_BOOSTER_PACK.get());

        this.tag(ModTags.Items.CARDS)
                .add(ModItems.BASE_TRADING_CARD.get())
                .addTag(ModTags.Items.WHITE_EYES_CARDS)
                .addTag(ModTags.Items.TOKEN_CARDS);

        this.tag(ModTags.Items.WHITE_EYES_CARDS)
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
                        ModItems.WORKING_ALLAY_TRADING_CARD.get(),
                        ModItems.ANGRY_VEX_TRADING_CARD.get(),
                        ModItems.HEATED_JUMPER_TRADING_CARD.get(),
                        ModItems.GLOW_OF_THE_DEEP_TRADING_CARD.get(),
                        ModItems.LIVING_BOX_TRADING_CARD.get(),
                        ModItems.BLOCK_THIEF_TRADING_CARD.get(),
                        ModItems.DECAYING_STEED_TRADING_CARD.get());

        this.tag(ModTags.Items.TOKEN_CARDS)
                .add(ModItems.MAGMA_CUBE_TOKEN_TRADING_CARD.get());
    }
}