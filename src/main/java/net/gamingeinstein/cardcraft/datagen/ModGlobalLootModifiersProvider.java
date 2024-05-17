package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.loot.AddItemModifier;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, CardCraft.MOD_ID);
    }

    @Override
    protected void start() {
        // Legend of White Eyes
        // Village Houses
        add("white_eyes_booster_pack_from_village_desert_house", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_desert_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build() },
                ModItems.WHITE_EYES_BOOSTER_PACK.get()));
        add("white_eyes_booster_pack_from_village_plains_house", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build() },
                ModItems.WHITE_EYES_BOOSTER_PACK.get()));
        add("white_eyes_booster_pack_from_village_savanna_house", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_savanna_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build() },
                ModItems.WHITE_EYES_BOOSTER_PACK.get()));
        add("white_eyes_booster_pack_from_village_snowy_house", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_snowy_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build() },
                ModItems.WHITE_EYES_BOOSTER_PACK.get()));
        add("white_eyes_booster_pack_from_village_taiga_house", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ModItems.WHITE_EYES_BOOSTER_PACK.get()));
        add("white_eyes_booster_pack_from_simple_dungeon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.65f).build() },
                ModItems.WHITE_EYES_BOOSTER_PACK.get()));
        add("white_eyes_booster_pack_from_spawn_bonus_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build() },
                ModItems.WHITE_EYES_BOOSTER_PACK.get()));
    }
}
