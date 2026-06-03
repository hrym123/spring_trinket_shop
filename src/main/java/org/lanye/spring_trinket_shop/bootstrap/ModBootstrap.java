package org.lanye.spring_trinket_shop.bootstrap;

import net.minecraftforge.eventbus.api.IEventBus;
import org.lanye.spring_trinket_shop.bootstrap.item.ModCreativeTabs;
import org.lanye.spring_trinket_shop.bootstrap.item.ModItems;

public final class ModBootstrap {

    private ModBootstrap() {}

    public static void register(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }
}
