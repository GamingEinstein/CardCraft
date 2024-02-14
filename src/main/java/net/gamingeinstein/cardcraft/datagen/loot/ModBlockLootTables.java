package net.gamingeinstein.cardcraft.datagen.loot;

import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //this.dropSelf(ModBlocks.BITS_FABRICATOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {

        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}