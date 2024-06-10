package net.gamingeinstein.cardcraft.config;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CardCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CardCraftConfigCommon {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> CARDS_PER_BOOSTER_PACK;

    static {
        BUILDER.push("CardCraft Common Config");

        CARDS_PER_BOOSTER_PACK = BUILDER.comment("The amount of cards you can pull from a Booster Pack (Default is 3)")
                .defineInRange("Cards per Booster Pack", 3, 1, 64);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
