package fr.natixe.grimmod.data;

import fr.natixe.grimmod.client.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {

        /*Randome Block*/
        this.dropSelf(ModBlocks.BLUE_MOSSY_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CRAKED_ICE.get());
        this.dropSelf(ModBlocks.NEW_ICE_PACKED.get());
        this.dropSelf(ModBlocks.SHADOW_INDIGOT_BLOCK.get());
        this.dropSelf(ModBlocks.INDIGOT_BLOCK.get());

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
    }

        @Override
        protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());

        }

}


