package fr.natixe.grimmod.data.recipe;

import fr.natixe.grimmod.client.init.ModBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModBlocks.CHARRED_DIRT.get())
                .requires(Items.COAL)
                .requires(Blocks.DIRT)
                .unlockedBy("Unlock Charred Dirt", InventoryChangeTrigger.Instance.hasItems(Items.COAL, Blocks.DIRT))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CHARRED_GRASS.get())
                .requires(Items.COAL)
                .requires(Blocks.GRASS_BLOCK)
                .unlockedBy("Unlock Charred Grass", InventoryChangeTrigger.Instance.hasItems(Items.COAL, Blocks.GRASS_BLOCK))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CHARRED_PLANKS.get(), 4)
                .requires(ModBlocks.CHARRED_LOG.get())
                .unlockedBy("Unlock Charred Planks", InventoryChangeTrigger.Instance.hasItems(ModBlocks.CHARRED_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CHARRED_STAIRS.get(), 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .define('P', ModBlocks.CHARRED_PLANKS.get())
                .unlockedBy("Unlock Charred Stairs", InventoryChangeTrigger.Instance.hasItems(ModBlocks.CHARRED_PLANKS.get()))
                .save(consumer);
    }

}
