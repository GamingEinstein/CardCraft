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
        // Dev Items
        simpleItem(ModItems.BASE_TRADING_CARD);
        simpleItem(ModItems.BASE_BOOSTER_PACK);
        // Legend of White Eyes Booster Set
        simpleItem(ModItems.WHITE_EYES_BOOSTER_PACK);
        simpleItem(ModItems.LIL_GERALD_TRADING_CARD);
        simpleItem(ModItems.BROODING_PIGLIN_TRADING_CARD);
        simpleItem(ModItems.SHARPBONED_SCROOGE_TRADING_CARD);
        simpleItem(ModItems.STICK_MAN_TRADING_CARD);
        simpleItem(ModItems.ARCHER_OF_THE_SWAMP_TRADING_CARD);
        simpleItem(ModItems.NOPE_THE_FISH_TRADING_CARD);
        simpleItem(ModItems.SMOKING_LAUNCHER_TRADING_CARD);
        simpleItem(ModItems.JAM_THE_FROG_TRADING_CARD);
        simpleItem(ModItems.FROSTED_BALLMAN_TRADING_CARD);
        simpleItem(ModItems.SONIC_SCREECHER_TRADING_CARD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CardCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
