package org.lanye.spring_trinket_shop;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lanye.spring_trinket_shop.bootstrap.ModBootstrap;
import org.slf4j.Logger;

@Mod(SpringTrinketShop.MODID)
public final class SpringTrinketShop {

    public static final String MODID = "spring_trinket_shop";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpringTrinketShop(FMLJavaModLoadingContext context) {
        ModBootstrap.register(context.getModEventBus());
        LOGGER.info("{} loaded", MODID);
    }
}
