package fr.natixe.grimmod.core.data.recipe;

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


        /*Special Block*/
        ShapedRecipeBuilder.shaped(ModBlocks.DEATH_SIGN.get())
                .pattern("OOO")
                .pattern("OSO")
                .pattern(" T ")
                .define('O', Blocks.OAK_PLANKS)
                .define('S', Blocks.SKELETON_SKULL)
                .define('T', Items.STICK)
                .unlockedBy("Unlock Death Sing", InventoryChangeTrigger.Instance.hasItems(Items.STICK, Blocks.OAK_PLANKS, Blocks.SKELETON_SKULL))
                .save(consumer);

        /*Chain Block*/
        ShapedRecipeBuilder.shaped(ModBlocks.GIANT_GOLDEN_CHAINS.get(), 4)
                .pattern(" N ")
                .pattern(" I ")
                .pattern(" N ")
                .define('I', Items.GOLD_INGOT)
                .define('N', Items.GOLD_NUGGET)
                .unlockedBy("Unlock Giant Golden Chain ", InventoryChangeTrigger.Instance.hasItems(Items.GOLD_NUGGET, Items.GOLD_INGOT))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GIANT_NETHERITE_CHAINS.get(), 4)
                .pattern(" S ")
                .pattern(" I ")
                .pattern(" S ")
                .define('S', Items.NETHERITE_SCRAP)
                .define('I', Items.NETHERITE_INGOT)
                .unlockedBy("Unlock Giant Netherite Chain ", InventoryChangeTrigger.Instance.hasItems(Items.NETHERITE_INGOT, Items.NETHERITE_SCRAP))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.IRON_GOLDEN_CHAINS.get(), 4)
                .pattern(" N ")
                .pattern(" O ")
                .pattern(" N ")
                .define('N', Items.IRON_NUGGET)
                .define('O', Items.GOLD_INGOT)
                .unlockedBy("Unlock Iron Golden Chain ", InventoryChangeTrigger.Instance.hasItems(Items.IRON_NUGGET, Items.GOLD_INGOT))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RUSTY_CHAINS.get(), 4)
                .pattern(" N ")
                .pattern(" V ")
                .pattern(" N ")
                .define('N', Items.IRON_NUGGET)
                .define('V', Items.VINE)
                .unlockedBy("Unlock Rusty Chain ", InventoryChangeTrigger.Instance.hasItems(Items.IRON_NUGGET, Items.VINE))
                .save(consumer);


        /*Charred Block*/
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


    //DEATH_SIGN
    //        GIANT_GOLDEN_CHAINS
    //GIANT_NETHERITE_CHAINS
    //        IRON_GOLDEN_CHAINS
    //RUSTY_CHAINS
    //        SAVANNAH_PLANKS
    //SAVANNAH_DENSE_MUD_GRASSY
    //        SAVANNAH_BLOCK_MOSSY
    //SAVANNAH_BLOCK_DRY
}
