package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CardCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.DISPLAY_CASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/display_case")));
        simpleBlockWithItem(ModBlocks.PLAYMAT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/playmat")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}