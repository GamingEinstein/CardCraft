package net.gamingeinstein.cardcraft.compat;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import vazkii.patchouli.api.PatchouliAPI;
import vazkii.patchouli.client.book.gui.GuiBookEntry;

public class PatchouliHandler {
    public static void openBookGUI(ServerPlayerEntity player) {
        PatchouliAPI.get().openBookGUI(player, new Identifier(CardCraft.MOD_ID, "official_rulebook"));
    }

    public static void openBookClient(){
        PatchouliAPI.get().openBookGUI(new Identifier(CardCraft.MOD_ID, "official_rulebook"));
    }

    public static boolean isPatchouliWorld() {
        if(!CardCraft.patchouliLoaded)
            return false;

        return MinecraftClient.getInstance().currentScreen instanceof GuiBookEntry;
    }
}