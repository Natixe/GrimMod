package fr.natixe.grimmod.init;

import fr.natixe.grimmod.client.model.armor.DamoclesHelmet;
import net.minecraftforge.eventbus.api.IEventBus;

public class ItemArmorRegistration {


    private final static DamoclesHelmet YOUR_FIRST_ARMOR = new DamoclesHelmet();

    public static DamoclesHelmet getFirstArmor(){
        return YOUR_FIRST_ARMOR;
    }

}

//Creating an Armor Item now looks similar to this:
//new ModArmorItem(material, slotType, properties, () -> ItemArmorRegistration::getFirstArmor);


