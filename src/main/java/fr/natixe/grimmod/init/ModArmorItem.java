package fr.natixe.grimmod.init;

import com.google.common.base.Supplier;
import fr.natixe.grimmod.client.model.armor.DamoclesHelmet;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class ModArmorItem extends ArmorItem {

    private Supplier<Supplier<DamoclesHelmet>> armorModel;

    public ModArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Item.Properties properties, Supplier<Supplier<DamoclesHelmet>> armorModel) {
        super(material, equipmentSlot, properties);
        this.armorModel = armorModel;
    }


    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default){
        return (A)new DamoclesHelmet();
    }

    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType armorSlot, String type) {
        return DamoclesHelmet.TEXTURE.toString();
    }
}
