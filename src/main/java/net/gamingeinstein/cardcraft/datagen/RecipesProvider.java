package net.gamingeinstein.cardcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gamingeinstein.cardcraft.registries.ModBlocks;
import net.gamingeinstein.cardcraft.registries.ModItems;
import net.gamingeinstein.cardcraft.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class RecipesProvider extends FabricRecipeProvider {
    public RecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Rulebook
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OFFICIAL_RULEBOOK, 1)
                .input(Items.BOOK)
                .input(ModTags.Items.CARDS)
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OFFICIAL_RULEBOOK)));
        // Blocks
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.DISPLAY_CASE)
                .pattern("111")
                .pattern("131")
                .pattern("222")
                .input('1', Items.GLASS)
                .input('2', Items.STONE)
                .input('3', Items.ITEM_FRAME)
                .criterion(hasItem(Items.ITEM_FRAME), conditionsFromItem(Items.ITEM_FRAME))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DISPLAY_CASE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PLAYMAT)
                .pattern("11")
                .input('1', Items.BLUE_CARPET)
                .criterion(hasItem(Blocks.BLUE_CARPET), conditionsFromItem(Blocks.BLUE_CARPET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PLAYMAT)));
        // RNG Items
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SPECIAL_COIN)
                .pattern(" 2 ")
                .pattern("212")
                .pattern(" 2 ")
                .input('1', Items.IRON_NUGGET)
                .input('2', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SPECIAL_COIN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SPECIAL_D1)
                .pattern("23")
                .pattern("1 ")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.BLACK_DYE)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SPECIAL_D1)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WHITE_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.WHITE_DYE)
                .input('4', Items.BLACK_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WHITE_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIGHT_GRAY_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.LIGHT_GRAY_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_GRAY_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRAY_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.GRAY_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GRAY_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLACK_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.BLACK_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLACK_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BROWN_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.BROWN_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BROWN_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RED_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.RED_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RED_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORANGE_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.ORANGE_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORANGE_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.YELLOW_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.YELLOW_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.YELLOW_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIME_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.LIME_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIME_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GREEN_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.GREEN_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GREEN_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CYAN_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.CYAN_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CYAN_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LIGHT_BLUE_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.LIGHT_BLUE_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_BLUE_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLUE_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.BLUE_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLUE_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PURPLE_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.PURPLE_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MAGENTA_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.MAGENTA_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGENTA_SPECIAL_D6)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_SPECIAL_D6)
                .pattern("324")
                .pattern("212")
                .pattern("423")
                .input('1', Items.STONE_BUTTON)
                .input('2', Items.CLAY_BALL)
                .input('3', Items.PINK_DYE)
                .input('4', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BUTTON), conditionsFromItem(Items.STONE_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_SPECIAL_D6)));
    }
}
