package net.gamingeinstein.cardcraft.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class CardCraftConfig extends MidnightConfig {
    @Entry(category = "cards", min = 1, max = 64) public static int cards_per_booster_pack = 3;
    @Entry(category = "cards") public static boolean showDetails = false;
}