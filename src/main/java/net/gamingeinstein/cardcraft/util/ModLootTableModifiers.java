package net.gamingeinstein.cardcraft.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier VILLAGE_DESERT_HOUSE_ID =
            new Identifier("minecraft", "chests/village/village_desert_house");
    private static final Identifier VILLAGE_PLAINS_HOUSE_ID =
            new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier VILLAGE_SAVANNA_HOUSE_ID =
            new Identifier("minecraft", "chests/village/village_savanna_house");
    private static final Identifier VILLAGE_SNOWY_HOUSE_ID =
            new Identifier("minecraft", "chests/village/village_snowy_house");
    private static final Identifier VILLAGE_TAIGA_HOUSE_ID =
            new Identifier("minecraft", "chests/village/village_taiga_house");
    private static final Identifier SIMPLE_DUNGEON_ID =
            new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier SPAWN_BONUS_CHEST_ID =
            new Identifier("minecraft", "chests/spawn_bonus_chest");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (VILLAGE_DESERT_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_PLAINS_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_SAVANNA_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_SNOWY_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TAIGA_HOUSE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.65f))
                        .with(ItemEntry.builder(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if (SPAWN_BONUS_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LEGEND_OF_WHITE_EYES_BOOSTER_PACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        }));
    }
}