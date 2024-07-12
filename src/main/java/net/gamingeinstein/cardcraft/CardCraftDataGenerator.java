package net.gamingeinstein.cardcraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gamingeinstein.cardcraft.datagen.*;
import net.gamingeinstein.cardcraft.datagen.lang.EnglishLangProvider;

public class CardCraftDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(BlockTagsProvider::new);
        pack.addProvider(ModelsProvider::new);
        pack.addProvider(ItemTagsProvider::new);
        pack.addProvider(LootTablesProvider::new);
        pack.addProvider(RecipesProvider::new);
        //pack.addProvider(EnglishLangProvider::new);
    }
}
