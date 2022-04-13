package fr.natixe.grimmod.init;

import fr.natixe.grimmod.GrimMod;
import fr.natixe.grimmod.utils.ModArmorMaterials;
import fr.natixe.grimmod.utils.ModCreativeTab;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GrimMod.MODID);

    //DAMOCLES_ARMOR : Ingot/Stuff/Other

    //Ingot in DAMOCLES_ARMOR/Other

    public static final RegistryObject<Item> DAMOCLES_INGOT = ITEMS.register("damolces_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.MOD_UTILS)));

    //Full stuff in DAMOCLES_ARMOR

    public static final RegistryObject<Item> DAMOCLES_HELMET = ITEMS.register("damolces_helmet",
            () -> new ArmorItem(ModArmorMaterials.DAMOCLES_ARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> DAMOCLES_CHESTPLATE = ITEMS.register("damolces_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DAMOCLES_ARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> DAMOCLES_LEGGING = ITEMS.register("damolces_leggings",
            () -> new ArmorItem(ModArmorMaterials.DAMOCLES_ARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> DAMOCLES_BOOTS = ITEMS.register("damolces_boots",
            () -> new ArmorItem(ModArmorMaterials.DAMOCLES_ARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));

    //GRIMMO_ARMOR : Ingot/Stuff/Other

    //Ingot in GRIMMO_ARMOR/Other

    public static final RegistryObject<Item> GRIMMO_INGOT = ITEMS.register("grimmo_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.MOD_UTILS)));

    //Full stuff in GRIMMO_ARMOR

    public static final RegistryObject<Item> GRIMMO_HELMET = ITEMS.register("grimmo_helmet",
            () -> new ArmorItem(ModArmorMaterials.GRIMMO_ARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> GRIMMO_CHESTPLATE = ITEMS.register("grimmo_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GRIMMO_ARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> GRIMMO_LEGGING = ITEMS.register("grimmo_leggings",
            () -> new ArmorItem(ModArmorMaterials.GRIMMO_ARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> GRIMMO_BOOTS = ITEMS.register("grimmo_boots",
            () -> new ArmorItem(ModArmorMaterials.GRIMMO_ARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));

    //HIBONITE_ARMOR : Ingot/Stuff/Other

    //Ingot in HIBONITE_ARMOR/Other

    public static final RegistryObject<Item> HIBONITE_INGOT = ITEMS.register("hibonite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.MOD_UTILS)));

    //Full stuff in HIBONITE_ARMOR

    public static final RegistryObject<Item> HIBONITE_HELMET = ITEMS.register("hibonite_helmet",
            () -> new ArmorItem(ModArmorMaterials.HIBONITE_ARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> HIBONITE_CHESTPLATE = ITEMS.register("hibonite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HIBONITE_ARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> HIBONITE_LEGGING = ITEMS.register("hibonite_leggings",
            () -> new ArmorItem(ModArmorMaterials.HIBONITE_ARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> HIBONITE_BOOTS = ITEMS.register("hibonite_boots",
            () -> new ArmorItem(ModArmorMaterials.HIBONITE_ARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));

    //PAINITE_ARMOR : Ingot/Stuff/Other

    //Ingot in PAINITE_ARMOR/Other

    public static final RegistryObject<Item> PAINITE_INGOT = ITEMS.register("painite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.MOD_UTILS)));

    //Full stuff in PAINITE_ARMOR

    public static final RegistryObject<Item> PAINITE_HELMET = ITEMS.register("painite_helmet",
            () -> new ArmorItem(ModArmorMaterials.PAINITE_ARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> PAINITE_CHESTPLATE = ITEMS.register("painite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PAINITE_ARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> PAINITE_LEGGING = ITEMS.register("painite_leggings",
            () -> new ArmorItem(ModArmorMaterials.PAINITE_ARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> PAINITE_BOOTS = ITEMS.register("painite_boots",
            () -> new ArmorItem(ModArmorMaterials.PAINITE_ARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));

    //PAINITE_ARMOR : Ingot/Stuff/Other

    //Ingot in PAINITE_ARMOR/Other

    public static final RegistryObject<Item> SODALITE_INGOT = ITEMS.register("sodalite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.MOD_UTILS)));

    //Full stuff in PAINITE_ARMOR

    public static final RegistryObject<Item> SODALITE_HELMET = ITEMS.register("sodalite_helmet",
            () -> new ArmorItem(ModArmorMaterials.SODALITE_ARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> SODALITE_CHESTPLATE = ITEMS.register("sodalite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SODALITE_ARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> SODALITE_LEGGING = ITEMS.register("sodalite_leggings",
            () -> new ArmorItem(ModArmorMaterials.SODALITE_ARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));
    public static final RegistryObject<Item> SODALITE_BOOTS = ITEMS.register("sodalite_boots",
            () -> new ArmorItem(ModArmorMaterials.SODALITE_ARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModCreativeTab.ARMOR_3D)));


}
