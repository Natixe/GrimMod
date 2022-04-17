package fr.natixe.grimmod.init.armor;

import fr.natixe.grimmod.client.model.armor.DamoclesHelmet;
import fr.natixe.grimmod.init.ModItems;
import fr.natixe.grimmod.utils.ModArmorMaterials;
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
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModArmorItem extends ArmorItem {

       private final DamoclesHelmet DamoclesHelmetModel;

    @OnlyIn(Dist.CLIENT)
    public ModArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Item.Properties properties, DamoclesHelmet armorModel) {
        super(material, equipmentSlot, properties);
        this.DamoclesHelmetModel = armorModel;
    }


    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public <A extends BipedModel<?>> A getArmorModel (LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A)new DamoclesHelmet();
    }

    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType armorSlot, String type) {
        return DamoclesHelmet.TEXTURE.toString();
    }


    // // Define an armor class in our second step
    // @OnlyIn(Dist.CLIENT)
    // private final DamoclesHelmet damocleshelmetModel;
    //   private final ModCallArmor damocleshelmetModel;

    //   private Supplier<Supplier<DamoclesHelmet>> armorModel;
//
    //   @Nullable
    //   @Override
      //public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
      //    this.armorModel.copyPropertiesTo((EntityModel<LivingEntity>) defaultArmor);
      //    // Last EquipmentSlotType It's the part we wear ： Breastplate CHEST, Helmet HEAD, Shin guards LEGS, Boots FEET
      //    return ModCallArmor.applyEntityStats(defaultArmor).applySlot(EquipmentSlotType.HEAD);
     //  public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
     //      return armorModel.get().get().applyEntityStats(defaultArmor).applySlot(armorSlot);
     //  }


     // Define the effect of wearing armor
     // @Override
     // public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
     //     if(player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.DAMOCLES_HELMET.get())
     //     {
     //        // player.addEffect(new EffectInstance(Effects.DIG_SPEED,10,3,false,false));
     //       //  player.addEffect(new EffectInstance(Effects.REGENERATION,10,3,true,true));
     //     }
     //     super.onArmorTick(stack,world, player);
     // }

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

