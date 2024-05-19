package net.gamingeinstein.cardcraft.datagen;

import net.gamingeinstein.cardcraft.registries.ModItems;
import net.gamingeinstein.cardcraft.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OFFICIAL_RULEBOOK.get(), 1)
                .requires(Items.BOOK)
                .requires(ModTags.Items.CARDS)
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(pWriter);

//        Temporarily disabled until I can figure out why it won't drop iteself when mined
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DISPLAY_CASE.get())
//                .pattern("111")
//                .pattern("1 1")
//                .pattern("222")
//                .define('1', Items.GLASS)
//                .define('2', Items.STONE)
//                .unlockedBy(getHasName(Items.GLASS), has(Items.GLASS))
//                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPECIAL_COIN.get())
                .pattern(" 2 ")
                .pattern("212")
                .pattern(" 2 ")
                .define('1', Items.IRON_NUGGET)
                .define('2', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPECIAL_D1.get())
                .pattern("23")
                .pattern("1 ")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHITE_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.WHITE_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIGHT_GRAY_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.LIGHT_GRAY_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GRAY_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.GRAY_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.BLACK_DYE)
                .define('4', Items.WHITE_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BROWN_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.BROWN_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RED_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.RED_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORANGE_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.ORANGE_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YELLOW_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.YELLOW_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIME_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.LIME_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GREEN_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.GREEN_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CYAN_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.CYAN_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIGHT_BLUE_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.LIGHT_BLUE_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLUE_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.BLUE_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PURPLE_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.PURPLE_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGENTA_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.MAGENTA_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PINK_SPECIAL_D6.get())
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .define('1', Items.STONE_BUTTON)
                .define('2', Items.CLAY_BALL)
                .define('3', Items.PINK_DYE)
                .define('4', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .save(pWriter);
    }
}
