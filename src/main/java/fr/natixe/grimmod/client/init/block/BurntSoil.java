package fr.natixe.grimmod.client.init.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class BurntSoil extends Block {
    public BurntSoil(AbstractBlock.Properties p_i48366_1_) {
        super(p_i48366_1_);
    }

    public void stepOn(World p_176199_1_, BlockPos p_176199_2_, Entity p_176199_3_) {
        if (!p_176199_3_.fireImmune() && p_176199_3_ instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)p_176199_3_)) {
            p_176199_3_.hurt(DamageSource.HOT_FLOOR, 3.7F);
        }

        super.stepOn(p_176199_1_, p_176199_2_, p_176199_3_);
    }


}
