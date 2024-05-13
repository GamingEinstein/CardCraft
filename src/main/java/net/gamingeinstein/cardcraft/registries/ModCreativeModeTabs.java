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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BASE_BOOSTER_PACK.get()))
                    .title(Component.translatable("creativetab.cardcraft_tab_main"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BASE_BOOSTER_PACK.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CARDCRAFT_TAB_CARDS = CREATIVE_MODE_TABS.register("cardcraft_tab_cards",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BASE_TRADING_CARD.get()))
                    .title(Component.translatable("creativetab.cardcraft_tab_cards"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BASE_TRADING_CARD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}