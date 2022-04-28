package fr.natixe.grimmod.data;

import fr.natixe.grimmod.client.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.LootTable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables implements Consumer<BiConsumer<ResourceLocation, LootTable.Builder>> {
    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};


    @Override
    protected void addTables() {

        /*Randome Block*/
        this.dropSelf(ModBlocks.BLUE_MOSSY_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CRAKED_ICE.get());
        this.dropSelf(ModBlocks.NEW_ICE_PACKED.get());
        this.dropSelf(ModBlocks.SHADOW_INDIGOT_BLOCK.get());
        this.dropSelf(ModBlocks.INDIGOT_BLOCK.get());
        this.dropSelf(ModBlocks.DEATH_SIGN.get());

        /*Chain Block*/

        this.dropSelf(ModBlocks.GIANT_GOLDEN_CHAINS.get());
        this.dropSelf(ModBlocks.GIANT_NETHERITE_CHAINS.get());
        this.dropSelf(ModBlocks.IRON_GOLDEN_CHAINS.get());
        this.dropSelf(ModBlocks.RUSTY_CHAINS.get());

        /*Mud Block*/
        this.dropSelf(ModBlocks.MUD_SOIL.get());
        this.add(ModBlocks.MUD_SOIL_GRASS.get(), (p_218529_0_) -> {
            return createSingleItemTableWithSilkTouch(p_218529_0_, ModBlocks.MUD_SOIL.get());
        });

        /*Quartz*/

        this.dropSelf(ModBlocks.SPIRAL_DARK_QUARTZ.get());
        this.dropSelf(ModBlocks.TILES_DARK_QUARTZ.get());
        this.dropSelf(ModBlocks.DARK_QUARTZ.get());
        this.dropSelf(ModBlocks.CHISELED_DARK_QUARTZ .get());
        this.dropSelf(ModBlocks.DARK_QUARTZ_PILLAR.get());

        /*Charred Block*/
        this.dropSelf(ModBlocks.CHARRED_DIRT.get());
        this.dropSelf(ModBlocks.CHARRED_LOG.get());
        this.dropSelf(ModBlocks.CHARRED_PLANKS.get());
        this.dropSelf(ModBlocks.CHARRED_DIRT_EMBERS.get());
        this.dropSelf(ModBlocks.CHARRED_STAIRS.get());
        this.add(ModBlocks.CHARRED_GRASS.get(), (p_218529_0_) -> {
            return createSingleItemTableWithSilkTouch(p_218529_0_, ModBlocks.CHARRED_DIRT.get());
        });
        this.add(ModBlocks.CHARRED_FARMLAND.get(), (p_218529_0_) -> {
            return createSingleItemTableWithSilkTouch(p_218529_0_, ModBlocks.CHARRED_DIRT.get());
        });

        /*Savannah Block*/
        this.dropSelf(ModBlocks.SAVANNAH_BLOCK.get());
        this.dropSelf(ModBlocks.SAVANNAH_BLOCK_DRY.get());
        this.dropSelf(ModBlocks.SAVANNAH_BLOCK_MOSSY.get());
        this.dropSelf(ModBlocks.SAVANNAH_LOG.get());
        this.dropSelf(ModBlocks.SAVANNAH_PLANKS.get());
        this.add(ModBlocks.SAVANNAH_GRASS_BLOCK.get(), (p_218529_0_) -> {
            return createSingleItemTableWithSilkTouch(p_218529_0_, ModBlocks.SAVANNAH_BLOCK.get());
        });
        this.add(ModBlocks.SAVANNAH_MUD_GRASSY.get(), (p_218529_0_) -> {
            return createSingleItemTableWithSilkTouch(p_218529_0_, ModBlocks.SAVANNAH_MUD.get());
        });
        this.add(ModBlocks.SAVANNAH_DENSE_MUD_GRASSY.get(), (p_218529_0_) -> {
            return createSingleItemTableWithSilkTouch(p_218529_0_, ModBlocks.SAVANNAH_MUD.get());
        });
        this.add(ModBlocks.SAVANNAH_MUD.get(), (p_218529_0_) -> {
            return createSingleItemTableWithSilkTouch(p_218529_0_, ModBlocks.SAVANNAH_MUD.get());
        });
        this.add(ModBlocks.SAVANNAH_LEAVES.get(), (p_218473_0_) -> {
            return createLeavesDrops(p_218473_0_, ModBlocks.SAVANNAH_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES);
        });


    }


    @Override
        protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());

        }

}


