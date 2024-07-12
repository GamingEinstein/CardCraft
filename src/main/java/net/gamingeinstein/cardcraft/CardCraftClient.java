package net.gamingeinstein.cardcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class CardCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DISPLAY_CASE, RenderLayer.getCutout());
    }
}
