package fr.natixe.grimmod.client.init;

import fr.natixe.grimmod.GrimMod;
import fr.natixe.grimmod.client.init.block.BurntSoil;
import fr.natixe.grimmod.client.init.block.CharredFarmLandBlock;
import fr.natixe.grimmod.client.utils.ModCreativeTab;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrimMod.MODID);


    /*Randome Block*/
    public static final RegistryObject<Block> BLUE_MOSSY_COBBLESTONE = registerBlock("blue_mossy_cobblestone",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
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

    /*Mud Block*/

    public static final RegistryObject<Block> MUD_SOIL = registerBlock("mud_soil",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(0.6f)));
    public static final RegistryObject<Block> MUD_SOIL_GRASS = registerBlock("mud_soil_grass",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(0.6f)));


    /*Quartz Block*/

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

    /*Charred Block*/

    public static final RegistryObject<Block> CHARRED_DIRT = registerBlock("charred_dirt",
            () -> new Block(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL)
                    .strength(0.7F)));
    public static final RegistryObject<Block> CHARRED_GRASS = registerBlock("charred_grass",
            () -> new Block(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL)
                    .strength(0.8F)));
    public static final RegistryObject<Block> CHARRED_LOG = registerBlock("charred_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(2.2F, 3.3F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> CHARRED_PLANKS = registerBlock("charred_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE)
                    .strength(2.2F, 3.3F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> CHARRED_DIRT_EMBERS = registerBlock("charred_dirt_embers",
            () -> new BurntSoil(AbstractBlock.Properties.of(Material.DIRT).harvestTool(ToolType.SHOVEL)
                    .strength(1F)));
    public static final RegistryObject<StairsBlock> CHARRED_STAIRS = registerBlock("charred_stairs",
            () -> new StairsBlock(() -> CHARRED_PLANKS.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE)
                            .strength(2.2F, 3.3F)));
    public static final RegistryObject<Block> CHARRED_FARMLAND = registerBlock("charred_farmland",
            () -> new CharredFarmLandBlock(AbstractBlock.Properties.of(Material.DIRT)
                    .strength(0.8F).sound(SoundType.GRAVEL).harvestTool(ToolType.SHOVEL)
                    .isViewBlocking(ModBlocks::always).isSuffocating(ModBlocks::always)));




    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeTab.MOD_BLOCK)));
    }

    private static boolean always(BlockState p_235426_0_, IBlockReader p_235426_1_, BlockPos p_235426_2_) {
        return true;
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

}
