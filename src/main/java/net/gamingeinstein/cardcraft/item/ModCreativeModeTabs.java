package net.gamingeinstein.cardcraft.item;

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

    public static final RegistryObject<CreativeModeTab> CARDCRAFT_TAB = CREATIVE_MODE_TABS.register("cardcraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TRADING_CARD.get()))
                    .title(Component.translatable("creativetab.cardcraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TRADING_CARD.get());
                        pOutput.accept(ModItems.BOOSTER_PACK.get());

                        pOutput.accept(ModItems.WHITE_EYES_BOOSTER_PACK.get());
                        pOutput.accept(ModItems.ALEX_TRADING_CARD.get());
                        pOutput.accept(ModItems.BLAZE_TRADING_CARD.get());
                        pOutput.accept(ModItems.CAT_TRADING_CARD.get());
                        pOutput.accept(ModItems.CAVE_SPIDER_TRADING_CARD.get());
                        pOutput.accept(ModItems.CHICKEN_TRADING_CARD.get());
                        pOutput.accept(ModItems.COD_TRADING_CARD.get());
                        pOutput.accept(ModItems.COW_TRADING_CARD.get());
                        pOutput.accept(ModItems.CREEPER_TRADING_CARD.get());
                        pOutput.accept(ModItems.DONKEY_TRADING_CARD.get());
                        pOutput.accept(ModItems.ENDER_DRAGON_TRADING_CARD.get());
                        pOutput.accept(ModItems.GHAST_TRADING_CARD.get());
                        pOutput.accept(ModItems.HEROBRINE_TRADING_CARD.get());
                        pOutput.accept(ModItems.HORSE_TRADING_CARD.get());
                        pOutput.accept(ModItems.IRON_GOLEM_TRADING_CARD.get());
                        pOutput.accept(ModItems.MAGMA_CUBE_TRADING_CARD.get());
                        pOutput.accept(ModItems.MOOSHROOM_TRADING_CARD.get());
                        pOutput.accept(ModItems.OCELOT_TRADING_CARD.get());
                        pOutput.accept(ModItems.PIG_TRADING_CARD.get());
                        pOutput.accept(ModItems.RABBIT_TRADING_CARD.get());
                        pOutput.accept(ModItems.SHEEP_TRADING_CARD.get());
                        pOutput.accept(ModItems.SALMON_TRADING_CARD.get());
                        pOutput.accept(ModItems.SILVERFISH_TRADING_CARD.get());
                        pOutput.accept(ModItems.SKELETON_TRADING_CARD.get());
                        pOutput.accept(ModItems.SLIME_TRADING_CARD.get());
                        pOutput.accept(ModItems.SNOW_GOLEM_TRADING_CARD.get());
                        pOutput.accept(ModItems.SPIDER_TRADING_CARD.get());
                        pOutput.accept(ModItems.SQUID_TRADING_CARD.get());
                        pOutput.accept(ModItems.STEVE_TRADING_CARD.get());
                        pOutput.accept(ModItems.VILLAGER_TRADING_CARD.get());
                        pOutput.accept(ModItems.WITCH_TRADING_CARD.get());
                        pOutput.accept(ModItems.WOLF_TRADING_CARD.get());
                        pOutput.accept(ModItems.ZOMBIE_TRADING_CARD.get());
                        pOutput.accept(ModItems.ZOMBIE_VILLAGER_TRADING_CARD.get());
                        pOutput.accept(ModItems.ZOMBIFIED_PIGLIN_TRADING_CARD.get());

                        //pOutput.accept(ModBlocks.XXX.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}