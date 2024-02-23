package net.puprika.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.puprika.item.ModItems;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WASHED_MESOGLEA, 1)
                .input(Items.WATER_BUCKET)
                .input(Items.DRIED_KELP)
                .input(ModItems.MESOGLEA)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .criterion(hasItem(ModItems.MESOGLEA), conditionsFromItem(ModItems.MESOGLEA))
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(Items.DRIED_KELP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WASHED_MESOGLEA)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JELLY_BLOUSE)
                .pattern("M M")
                .pattern("MSM")
                .pattern("MSM")
                .input('S', ModItems.WASHED_MESOGLEA)
                .input('M', ModItems.MESOGLEA)
                .criterion(hasItem(ModItems.WASHED_MESOGLEA), conditionsFromItem(ModItems.WASHED_MESOGLEA))
                .criterion(hasItem(ModItems.MESOGLEA), conditionsFromItem(ModItems.MESOGLEA))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JELLY_BLOUSE)));
    }
}
