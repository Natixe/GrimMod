package fr.natixe.grimmod.client.armor;

import fr.natixe.grimmod.client.init.ModItems;
import fr.natixe.grimmod.client.model.armor.DamoclesHelmet;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModArmorItem extends ArmorItem {

    private Supplier<Supplier<DamoclesHelmet>> armorModel;
    public ModArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Item.Properties properties, Supplier<Supplier<DamoclesHelmet>> armorModel) {
        super(material, equipmentSlot, properties);
        this.armorModel = armorModel;
    }

    @OnlyIn(Dist.CLIENT)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Nullable
    @Override
    public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
        this.armorModel.get().get().copyPropertiesTo((EntityModel<LivingEntity>) defaultArmor);
        return armorModel.get().get().applyEntityStats(defaultArmor).applySlot(EquipmentSlotType.HEAD);
    }

    @Nullable
    @Override
    public final String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return armorModel.get().get().getTexture();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if(player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.DAMOCLES_HELMET.get())
        {
            player.addEffect(new EffectInstance(Effects.DIG_SPEED,10,3,false,false));
            player.addEffect(new EffectInstance(Effects.REGENERATION,10,3,true,true));
        }
        super.onArmorTick(stack,world, player);
    }


  }






















//private Supplier<Supplier<DamoclesHelmet>> armorModel;

//public ModArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Item.Properties properties, Supplier<Supplier<DamoclesHelmet>> armorModel) {
//    super(material, equipmentSlot, properties);
//    this.armorModel = armorModel;
//}
////* A _default

//@Nullable
//@Override
//@OnlyIn(Dist.CLIENT)
//public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
//    return armorModel.get().get().applyEntityStats(defaultArmor).applySlot(armorSlot);
//}
///public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor){
///    return armorModel.get().get().applyEntityStats(defaultArmor).applySlot(armorSlot);
/// // return (A)new DamoclesHelmet();
///}

//@Nullable
//@Override
//@OnlyIn(Dist.CLIENT)
//public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType armorSlot, String type) {
//    return DamoclesHelmet.TEXTURE.toString();
//}

