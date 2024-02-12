package net.gamingeinstein.cardcraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.XXX.get(), #)
//                .requires(ModItems.XXX.get())
//                .unlockedBy(getHasName(ModItems.XXX.get()), has(ModItems.XXX.get()))
//                .save(pWriter);

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.XXX.get())
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', Items.AIR)
//                .unlockedBy(getHasName(Items.AIR), has(Items.AIR))
//                .save(pWriter);
    }
}
