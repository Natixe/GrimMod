package fr.natixe.grimmod.utils;

import fr.natixe.grimmod.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModCreativeTab {
    public static final ItemGroup ARMOR_3D = new ItemGroup("Armor_3d") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DAMOCLES_HELMET.get());
        }
    };
    public static final ItemGroup MOD_UTILS = new ItemGroup("Mod Utils") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DAMOCLES_INGOT.get());
        }
    };
}