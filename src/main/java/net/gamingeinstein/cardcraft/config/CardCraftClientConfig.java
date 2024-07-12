package net.gamingeinstein.cardcraft.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CardCraftClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOW_DETAILS;

    static {
        BUILDER.push("Client");

        SHOW_DETAILS = BUILDER.comment("Toggles the in-progress details that all cards have")
                .define("Card Details", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
