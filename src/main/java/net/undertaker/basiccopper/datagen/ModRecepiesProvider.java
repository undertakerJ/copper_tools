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

    public ModRecepiesProvider(DataGenerator p_125973_) {
        super(p_125973_);
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
    }
}
