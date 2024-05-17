package net.gamingeinstein.cardcraft.registries;

import net.gamingeinstein.cardcraft.CardCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CardCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CARDCRAFT_TAB_MAIN = CREATIVE_MODE_TABS.register("cardcraft_tab_main",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DISPLAY_CASE.get()))
                    .title(Component.translatable("creativetab.cardcraft_tab.main"))
                    .displayItems((pParameters, pOutput) -> {
                        // Normal Things
                        pOutput.accept(ModBlocks.DISPLAY_CASE.get());
                        pOutput.accept(ModItems.SPECIAL_COIN.get());
                        pOutput.accept(ModItems.SPECIAL_D1.get());
                        pOutput.accept(ModItems.WHITE_SPECIAL_D6.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_SPECIAL_D6.get());
                        pOutput.accept(ModItems.GRAY_SPECIAL_D6.get());
                        pOutput.accept(ModItems.BLACK_SPECIAL_D6.get());
                        pOutput.accept(ModItems.BROWN_SPECIAL_D6.get());
                        pOutput.accept(ModItems.RED_SPECIAL_D6.get());
                        pOutput.accept(ModItems.ORANGE_SPECIAL_D6.get());
                        pOutput.accept(ModItems.YELLOW_SPECIAL_D6.get());
                        pOutput.accept(ModItems.LIME_SPECIAL_D6.get());
                        pOutput.accept(ModItems.GREEN_SPECIAL_D6.get());
                        pOutput.accept(ModItems.CYAN_SPECIAL_D6.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_SPECIAL_D6.get());
                        pOutput.accept(ModItems.BLUE_SPECIAL_D6.get());
                        pOutput.accept(ModItems.PURPLE_SPECIAL_D6.get());
                        pOutput.accept(ModItems.MAGENTA_SPECIAL_D6.get());
                        pOutput.accept(ModItems.PINK_SPECIAL_D6.get());
                        // Booster Packs
                        pOutput.accept(ModItems.BASE_BOOSTER_PACK.get());
                        pOutput.accept(ModItems.WHITE_EYES_BOOSTER_PACK.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CARDCRAFT_TAB_CARDS = CREATIVE_MODE_TABS.register("cardcraft_tab_cards",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BASE_TRADING_CARD.get()))
                    .title(Component.translatable("creativetab.cardcraft_tab.cards"))
                    .displayItems((pParameters, pOutput) -> {
                        // All the cards... ever
                        // Legend of White Eyes
                        pOutput.accept(ModItems.BASE_TRADING_CARD.get());
                        pOutput.accept(ModItems.LIL_GERALD_TRADING_CARD.get());
                        pOutput.accept(ModItems.BROODING_PIGLIN_TRADING_CARD.get());
                        pOutput.accept(ModItems.SHARPBONED_SCROOGE_TRADING_CARD.get());
                        pOutput.accept(ModItems.STICK_MAN_TRADING_CARD.get());
                        pOutput.accept(ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD.get());
                        pOutput.accept(ModItems.NOPE_THE_FISH_TRADING_CARD.get());
                        pOutput.accept(ModItems.SMOKING_LAUNCHER_TRADING_CARD.get());
                        pOutput.accept(ModItems.JAM_THE_FROG_TRADING_CARD.get());
                        pOutput.accept(ModItems.FROSTED_BALLMAN_TRADING_CARD.get());
                        pOutput.accept(ModItems.SONIC_SCREECHER_TRADING_CARD.get());
                        pOutput.accept(ModItems.BOOK_OF_LOOTING_TRADING_CARD.get());
                        pOutput.accept(ModItems.CRY_OF_THE_UNDEAD_TRADING_CARD.get());
                        pOutput.accept(ModItems.ICED_MARKSMAN_TRADING_CARD.get());
                        pOutput.accept(ModItems.NOTCH_TRADING_CARD.get());
                        pOutput.accept(ModItems.APPLE_TRADING_CARD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}