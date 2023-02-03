package net.fabricmc.example.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.apache.http.client.protocol.ClientContext;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.block.HorizontalFacingBlock.FACING;

/**
 * @author XaoooX
 */
public class AtmBlock extends Block {
    public AtmBlock(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,32,16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx){
        return SHAPE;
    }
    
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(FACING);
    }



    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING,ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation){
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror){
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

}
