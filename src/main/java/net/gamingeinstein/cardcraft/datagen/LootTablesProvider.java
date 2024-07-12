package net.gamingeinstein.cardcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gamingeinstein.cardcraft.registries.ModBlocks;

public class LootTablesProvider extends FabricBlockLootTableProvider {
    public LootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DISPLAY_CASE);
        addDrop(ModBlocks.PLAYMAT);
    }
}
