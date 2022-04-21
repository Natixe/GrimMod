package fr.natixe.grimmod.client.utils;

import fr.natixe.grimmod.client.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModCreativeTab {
    public static final ItemGroup ARMOR_3D = new ItemGroup("Armor_3d") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DAMOCLES_INGOT.get());
        }
    };
    public static final ItemGroup MOD_UTILS = new ItemGroup("Mod Utils") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DAMOCLES_HELMET.get());
        }
    };
    public static final ItemGroup MOD_BLOCK = new ItemGroup("Mod Block") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DAMOCLES_INGOT.get());
        }
    };

}