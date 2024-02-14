package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.CardCraft;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CardCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.BASE_TRADING_CARD);
        simpleItem(ModItems.BASE_BOOSTER_PACK);

        simpleItem(ModItems.WHITE_EYES_BOOSTER_PACK);
        simpleItem(ModItems.ALEX_TRADING_CARD);
        simpleItem(ModItems.BAT_TRADING_CARD);
        simpleItem(ModItems.BLAZE_TRADING_CARD);
        simpleItem(ModItems.CAT_TRADING_CARD);
        simpleItem(ModItems.CAVE_SPIDER_TRADING_CARD);
        simpleItem(ModItems.CHICKEN_TRADING_CARD);
        simpleItem(ModItems.COD_TRADING_CARD);
        simpleItem(ModItems.COW_TRADING_CARD);
        simpleItem(ModItems.CREEPER_TRADING_CARD);
        simpleItem(ModItems.DONKEY_TRADING_CARD);
        simpleItem(ModItems.ENDERMAN_TRADING_CARD);
        simpleItem(ModItems.ENDER_DRAGON_TRADING_CARD);
        simpleItem(ModItems.GHAST_TRADING_CARD);
        simpleItem(ModItems.HEROBRINE_TRADING_CARD);
        simpleItem(ModItems.HORSE_TRADING_CARD);
        simpleItem(ModItems.IRON_GOLEM_TRADING_CARD);
        simpleItem(ModItems.MAGMA_CUBE_TRADING_CARD);
        simpleItem(ModItems.MOOSHROOM_TRADING_CARD);
        simpleItem(ModItems.MULE_TRADING_CARD);
        simpleItem(ModItems.OCELOT_TRADING_CARD);
        simpleItem(ModItems.PIG_TRADING_CARD);
        simpleItem(ModItems.RABBIT_TRADING_CARD);
        simpleItem(ModItems.SALMON_TRADING_CARD);
        simpleItem(ModItems.SHEEP_TRADING_CARD);
        simpleItem(ModItems.SILVERFISH_TRADING_CARD);
        simpleItem(ModItems.SKELETON_TRADING_CARD);
        simpleItem(ModItems.SKELETON_HORSE_TRADING_CARD);
        simpleItem(ModItems.SLIME_TRADING_CARD);
        simpleItem(ModItems.SNOW_GOLEM_TRADING_CARD);
        simpleItem(ModItems.SPIDER_TRADING_CARD);
        simpleItem(ModItems.SQUID_TRADING_CARD);
        simpleItem(ModItems.STEVE_TRADING_CARD);
        simpleItem(ModItems.VILLAGER_TRADING_CARD);
        simpleItem(ModItems.WITCH_TRADING_CARD);
        simpleItem(ModItems.WOLF_TRADING_CARD);
        simpleItem(ModItems.ZOMBIE_TRADING_CARD);
        simpleItem(ModItems.ZOMBIE_HORSE_TRADING_CARD);
        simpleItem(ModItems.ZOMBIE_VILLAGER_TRADING_CARD);
        simpleItem(ModItems.ZOMBIFIED_PIGLIN_TRADING_CARD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CardCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
