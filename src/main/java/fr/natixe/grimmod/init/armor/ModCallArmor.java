package fr.natixe.grimmod.init.armor;

import fr.natixe.grimmod.client.model.armor.DamoclesHelmet;
import net.minecraft.util.ResourceLocation;


public class ModCallArmor {

    private final static DamoclesHelmet YOUR_FIRST_ARMOR = new DamoclesHelmet();

    public static DamoclesHelmet getFirstArmor(){
        return YOUR_FIRST_ARMOR;
    }

}
