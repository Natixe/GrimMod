package fr.natixe.grimmod.core.registries.item;

import fr.natixe.grimmod.client.model.armor.DamoclesHelmet;
import fr.natixe.grimmod.client.render.armor.ModArmorDamoclesHelmetImplementation;

public class ItemRegistrationDamoclesArmor {

    private final static DamoclesHelmet DAMOCLES_HELMET = new ModArmorDamoclesHelmetImplementation();

    public static DamoclesHelmet DamoclesHelmetArmor(){
        return DAMOCLES_HELMET;
    }

}

