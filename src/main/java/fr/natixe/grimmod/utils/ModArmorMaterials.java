package fr.natixe.grimmod.utils;

import fr.natixe.grimmod.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterials implements IArmorMaterial {
    DAMOCLES_ARMOR("damocles", 76, new int[]{8, 14, 16, 12}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            5.0F, 0.4F, () -> Ingredient.of(ModItems.DAMOCLES_INGOT.get())),
    GRIMMO_ARMOR("grimmo", 64, new int[]{7, 11, 13, 9}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            4.0F, 0.3F, () -> Ingredient.of(ModItems.GRIMMO_INGOT.get())),
    HIBONITE_ARMOR("hibonite", 59, new int[]{6, 10, 12, 7}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            3.0F, 0.2F, () -> Ingredient.of(ModItems.HIBONITE_INGOT.get())),
    PAINITE_ARMOR("painite", 53, new int[]{5, 9, 8, 6}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.1F, () -> Ingredient.of(ModItems.PAINITE_INGOT.get())),
    SODALITE_ARMOR("sodalite", 46, new int[]{3, 7, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.1F, () -> Ingredient.of(ModItems.SODALITE_INGOT.get()));



    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final net.minecraft.util.SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, net.minecraft.util.SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
        this.name = p_i231593_3_;
        this.durabilityMultiplier = p_i231593_4_;
        this.slotProtections = p_i231593_5_;
        this.enchantmentValue = p_i231593_6_;
        this.sound = p_i231593_7_;
        this.toughness = p_i231593_8_;
        this.knockbackResistance = p_i231593_9_;
        this.repairIngredient = new LazyValue<>(p_i231593_10_);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.slotProtections[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}