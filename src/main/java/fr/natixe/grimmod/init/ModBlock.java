package fr.natixe.grimmod.init;

import fr.natixe.grimmod.GrimMod;
import fr.natixe.grimmod.utils.ModCreativeTab;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrimMod.MODID);


    /*Randome Block*/
    public static final RegistryObject<Block> BLUE_MOSSY_COBBLESTONE = createBlock("blue_mossy_cobblestone",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SPIRAL_DARK_QUARTZ = createBlock("spiral_dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TILES_DARK_QUARTZ = createBlock("tiles_dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_QUARTZ = createBlock("dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_DARK_QUARTZ = createBlock("chiseled_dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_QUARTZ_PILLAR = createBlock("dark_quartz_pillar",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAKED_ICE = createBlock("craked_ice",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NEW_ICE_PACKED = createBlock("new_ice_packed",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SHADOW_INDIGOT_BLOCK = createBlock("shadow_indigot_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> INDIGOT_BLOCK = createBlock("indigot_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL = createBlock("mud_soil",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL_GRASS = createBlock("mud_soil_grass",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));



    /*Charred Block*/

    public static final RegistryObject<Block> MUD_SOIL_GRASS = createBlock("charred_dirt",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL_GRASS = createBlock("charred_grass_block_side",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL_GRASS = createBlock("charred_grass_block_top",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL_GRASS = createBlock("charred_log",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL_GRASS = createBlock("charred_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));


















    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeTab.MOD_BLOCK)));
        return block;
    }
}
