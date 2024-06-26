package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class BlockTags extends BlockTagsProvider {
    public BlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CardCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DISPLAY_CASE.get());
    }
}