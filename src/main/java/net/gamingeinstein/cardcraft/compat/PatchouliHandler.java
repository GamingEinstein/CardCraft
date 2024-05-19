package net.gamingeinstein.cardcraft.compat;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.registries.ForgeRegistries;
import vazkii.patchouli.api.PatchouliAPI;
import vazkii.patchouli.client.book.gui.GuiBookEntry;

public class PatchouliHandler {
    public static void openBookGUI(ServerPlayer player) {
        PatchouliAPI.get().openBookGUI(player, new ResourceLocation(CardCraft.MOD_ID, "official_rulebook"));
    }

    public static void openBookClient(){
        PatchouliAPI.get().openBookGUI(ForgeRegistries.ITEMS.getKey(ModItems.OFFICIAL_RULEBOOK.get()));
    }

    public static boolean isPatchouliWorld() {
        if(!CardCraft.patchouliLoaded)
            return false;

        return Minecraft.getInstance().screen instanceof GuiBookEntry;
    }
}
