package net.jak0bw.copper_rail_crafting.item;

import net.jak0bw.copper_rail_crafting.CopperRailCrafting;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CopperRailCrafting.MOD_ID);


    //ingot
    //steel

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

