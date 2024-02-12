package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
//import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CardCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        simpleBlockWithItem(ModBlocks.BITS_FABRICATOR.get(),
//                new ModelFile.UncheckedModelFile(modLoc("block/bits_fabricator")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
