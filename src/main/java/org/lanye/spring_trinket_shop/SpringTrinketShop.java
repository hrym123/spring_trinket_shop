package org.lanye.spring_trinket_shop;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lanye.reverie_core.content.fantasy_core.workbench.FantasyWorkbenchCatalogRegistry;
import org.lanye.spring_trinket_shop.bootstrap.ModBootstrap;
import org.slf4j.Logger;

@Mod(SpringTrinketShop.MODID)
public final class SpringTrinketShop {

    public static final String MODID = "spring_trinket_shop";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpringTrinketShop(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModEventBus();
        ModBootstrap.register(modEventBus);
        modEventBus.addListener(this::onCommonSetup);
        LOGGER.info("{} loaded", MODID);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> FantasyWorkbenchCatalogRegistry.registerContentMod(MODID));
    }
}
