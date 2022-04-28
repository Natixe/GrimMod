package fr.natixe.grimmod.client.init.custom.block;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;
import javax.annotation.Nullable;
import java.util.stream.Stream;

public class Sing extends HorizontalBlock implements IWaterLoggable {
    public Sing(AbstractBlock.Properties p_i241175_1_) {
        super(p_i241175_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.valueOf(false)));
        //this.registerDefaultState(this.stateDefinition.any().setValue(ROTATION, Integer.valueOf(0)).setValue(WATERLOGGED, Boolean.valueOf(false)));

    }
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;


    @Nullable
    @Override
    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (p_196271_1_.getValue(WATERLOGGED)) {
            p_196271_4_.getLiquidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickDelay(p_196271_4_));
        }

        return p_196271_2_ == Direction.DOWN && !this.canSurvive(p_196271_1_, p_196271_4_, p_196271_5_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }


   @Override
   public FluidState getFluidState(BlockState p_204507_1_) {
       return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
   }

   @Override
   public boolean isPathfindable(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
       return false;
   }

    private static final VoxelShape SHAPE_N = VoxelShapes.join(
                    Block.box(7, 0, 7, 9, 14, 9),
                    Block.box(0, 5, 6, 16, 16, 7),
                    IBooleanFunction.OR);

    private static final VoxelShape SHAPE_W = VoxelShapes.join(
            Block.box(7, 0, 7, 9, 14, 9),
            Block.box(6, 5, 0, 7, 16, 16),
            IBooleanFunction.OR);

    private static final VoxelShape SHAPE_S = VoxelShapes.join(
            Block.box(7, 0, 7, 9, 14, 9),
            Block.box(0, 5, 9, 16, 16, 10),
            IBooleanFunction.OR);

    private static final VoxelShape SHAPE_E = VoxelShapes.join(
            Block.box(7, 0, 7, 9, 14, 9),
            Block.box(9, 5, 0, 10, 16, 16),
            IBooleanFunction.OR);


    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
       switch(state.getValue(FACING)) {
           case NORTH:
               return SHAPE_N;
           case SOUTH:
               return SHAPE_S;
           case WEST:
               return SHAPE_W;
           case EAST:
               return SHAPE_E;
           default:
               return SHAPE_N;
       }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        boolean flag = fluidstate.getType() == Fluids.WATER;
        return super.getStateForPlacement(context).setValue(WATERLOGGED, Boolean.valueOf(flag));
    }


    @Override
    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.setValue(ROTATION, Integer.valueOf(p_185499_2_.rotate(p_185499_1_.getValue(ROTATION), 16)));
    }

    @Override
    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.setValue(ROTATION, Integer.valueOf(p_185471_2_.mirror(p_185471_1_.getValue(ROTATION), 16)));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(WATERLOGGED).add(FACING);
    }

}
