package fr.natixe.grimmod.client.init;

import fr.natixe.grimmod.GrimMod;
import fr.natixe.grimmod.client.init.block.BurntSoil;
import fr.natixe.grimmod.client.utils.ModCreativeTab;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrimMod.MODID);


    /*Randome Block*/
    public static final RegistryObject<Block> BLUE_MOSSY_COBBLESTONE = registerBlock("blue_mossy_cobblestone",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SPIRAL_DARK_QUARTZ = registerBlock("spiral_dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TILES_DARK_QUARTZ = registerBlock("tiles_dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_QUARTZ = registerBlock("dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_DARK_QUARTZ = registerBlock("chiseled_dark_quartz",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_QUARTZ_PILLAR = registerBlock("dark_quartz_pillar",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAKED_ICE = registerBlock("craked_ice",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NEW_ICE_PACKED = registerBlock("new_ice_packed",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SHADOW_INDIGOT_BLOCK = registerBlock("shadow_indigot_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> INDIGOT_BLOCK = registerBlock("indigot_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL = registerBlock("mud_soil",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUD_SOIL_GRASS = registerBlock("mud_soil_grass",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    /*Charred Block*/

    public static final RegistryObject<Block> CHARRED_DIRT = registerBlock("charred_dirt",
            () -> new Block(AbstractBlock.Properties.of(Material.DIRT)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHARRED_GRASS = registerBlock("charred_grass",
            () -> new Block(AbstractBlock.Properties.of(Material.DIRT)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHARRED_LOG = registerBlock("charred_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHARRED_PLANKS = registerBlock("charred_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHARRED_DIRT_EMBERS = registerBlock("charred_dirt_embers",
            () -> new BurntSoil(AbstractBlock.Properties.of(Material.DIRT)
                    .strength(3f, 15f).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairsBlock> CHARRED_STAIRS = registerBlock("charred_stairs",
            () -> new StairsBlock(() -> CHARRED_PLANKS.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.WOOD)
                            .harvestTool(ToolType.PICKAXE)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeTab.MOD_BLOCK)));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

}
