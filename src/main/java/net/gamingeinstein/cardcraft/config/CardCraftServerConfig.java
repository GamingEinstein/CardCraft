package net.gamingeinstein.cardcraft.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CardCraftServerConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> CARDS_PER_BOOSTER_PACK;

    static {
        BUILDER.push("Server");

        CARDS_PER_BOOSTER_PACK = BUILDER.comment("Changes how many cards someone can get when opening Booster Packs")
                .defineInRange("Cards Per Booster Pack", 3, 1, 64);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
