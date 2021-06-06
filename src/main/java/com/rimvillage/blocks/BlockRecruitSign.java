package com.rimvillage.blocks;

import com.rimvillage.base.BaseHorizontalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class BlockRecruitSign extends BaseHorizontalBlock {

    private static final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(-6, 26, 7, 7, 32, 9), Block.makeCuboidShape(7, 0, 7, 9, 32, 9), IBooleanFunction.OR);

    public BlockRecruitSign(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }
    
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }
}
