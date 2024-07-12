package net.gamingeinstein.cardcraft.util;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        // Insert Tags here

        private static TagKey<Block> tag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(CardCraft.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RNG_ITEMS = tag("rng_items");
        public static final TagKey<Item> COINS = tag("coins");
        public static final TagKey<Item> DICE = tag("dice");
        public static final TagKey<Item> BOOSTER_PACKS = tag("booster_packs");
        public static final TagKey<Item> CARDS = tag("cards");
        public static final TagKey<Item> LEGEND_OF_WHITE_EYES_CARDS = tag("legend_of_white_eyes_cards");
        public static final TagKey<Item> TOKEN_CARDS = tag("token_cards");

        private static TagKey<Item> tag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(CardCraft.MOD_ID, name));
        }
    }
}
