package net.undertaker.basiccopper.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.undertaker.basiccopper.item.ModItems;

import java.util.function.Consumer;

public class ModRecepiesProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecepiesProvider(DataGenerator generator) {
        super(generator);
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
    ShapedRecipeBuilder.shaped(ModItems.COPPER_PICKAXE.get())
        .pattern("CCC")
        .pattern(" S ")
        .pattern(" S ")
        .define('C', Items.COPPER_INGOT)
            .define('S', Items.STICK)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_AXE.get())
        .pattern("CC")
        .pattern("CS")
        .pattern(" S")
        .define('C', Items.COPPER_INGOT)
            .define('S', Items.STICK)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_SHOVEL.get())
        .pattern("C")
        .pattern("S")
        .pattern("S")
        .define('C', Items.COPPER_INGOT)
            .define('S', Items.STICK)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_HOE.get())
        .pattern("CC")
        .pattern(" S")
        .pattern(" S")
        .define('C', Items.COPPER_INGOT)
            .define('S', Items.STICK)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_SWORD.get())
        .pattern("C")
        .pattern("C")
        .pattern("S")
        .define('C', Items.COPPER_INGOT)
            .define('S', Items.STICK)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_HELMET.get())
        .pattern("CCC")
        .pattern("C C")
        .define('C', Items.COPPER_INGOT)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_CHESTPLATE.get())
        .pattern("C C")
        .pattern("CCC")
        .pattern("CCC")
        .define('C', Items.COPPER_INGOT)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_LEGGINGS.get())
        .pattern("CCC")
        .pattern("C C")
        .pattern("C C")
        .define('C', Items.COPPER_INGOT)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
            ShapedRecipeBuilder.shaped(ModItems.COPPER_BOOTS.get())
        .pattern("C C")
        .pattern("C C")
        .define('C', Items.COPPER_INGOT)
        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
        .save(consumer);
    }
}
