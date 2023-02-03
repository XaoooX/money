/*package net.fabricmc.example.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BlockAtm extends HorizontalFacingBlock {
    public BlockAtm(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(Properties.HORIZONTAL_FACING,Properties.DOUBLE_BLOCK_HALF);
    }

    public VoxelShape makeShape(){
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.4375, 1, 0.0625, 0.5, 1.6875, 0.3125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.4375, 1.6875, 0.0625, 0.5625, 1.75, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5625, 1.75, 0.0625, 0.6875, 1.8125, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.6875, 1.8125, 0.0625, 0.8125, 1.875, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.8125, 1.875, 0.0625, 0.9375, 1.9375, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 1, 0, 1, 2, 0.0625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 1, 0.9375, 1, 2, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 1, 0.0625, 0.0625, 2, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 1.9375, 0.0625, 1, 2, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0.0625, 0, 0.0625, 1, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0.0625, 0.9375, 1, 1, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.375, 0.9375, 0.0625, 0.9375, 1, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.9375, 0.0625, 0.0625, 1, 1, 0.9375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0.0625, 0, 1, 1, 0.0625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.0625, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.375, 1, 0.3125, 0.4375, 1.6875, 0.9375));

        return shape;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH,SOUTH,EAST,WEST -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

}

*/