package net.gamingeinstein.cardcraft.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.block.PlaymatBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DISPLAY_CASE = registerBlock("display_case",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block PLAYMAT = registerBlock("playmat",
            new PlaymatBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CARPET).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CardCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CardCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void register() {
        CardCraft.LOGGER.info("Registering Blocks for " + CardCraft.MOD_ID);
    }
}
