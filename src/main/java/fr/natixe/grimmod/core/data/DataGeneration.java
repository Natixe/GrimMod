package fr.natixe.grimmod.core.data;

import fr.natixe.grimmod.GrimMod;
import fr.natixe.grimmod.core.data.recipe.RecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = GrimMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {

    @SubscribeEvent
    public static void gatherData(final GatherDataEvent e)
    {
        DataGenerator generator = e.getGenerator();

        if(e.includeServer())
        {
            generator.addProvider(new RecipeGenerator(generator));
            generator.addProvider(new ModLootTableProvider(generator));

        }
    }
}
