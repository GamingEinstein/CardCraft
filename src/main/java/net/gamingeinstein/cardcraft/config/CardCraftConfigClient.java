package net.gamingeinstein.cardcraft.config;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CardCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CardCraftConfigClient {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // Quite the air we have here

    static {
        BUILDER.push("CardCraft Client Config");

        // Wow such empty

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
