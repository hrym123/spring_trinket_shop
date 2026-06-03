package org.lanye.spring_trinket_shop.bootstrap.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lanye.reverie_core.item.DecorativeHelmetRegistration;
import org.lanye.spring_trinket_shop.SpringTrinketShop;

public final class ModItems {

    private ModItems() {}

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpringTrinketShop.MODID);

    public static final RegistryObject<Item> DECORATIVE_HELMET_BLUE_TOP_HAT =
            DecorativeHelmetRegistration.register(
                    ITEMS,
                    new Item.Properties().stacksTo(1),
                    SpringTrinketShop.MODID,
                    "decorative_helmet_blue_top_hat",
                    "decorative_helmet_blue_top_hat_atlas");

    public static final RegistryObject<Item> DECORATIVE_HELMET_PINK_TOP_HAT =
            DecorativeHelmetRegistration.register(
                    ITEMS,
                    new Item.Properties().stacksTo(1),
                    SpringTrinketShop.MODID,
                    "decorative_helmet_pink_top_hat",
                    "decorative_helmet_pink_top_hat");

    public static final RegistryObject<Item> DECORATIVE_HELMET_LOP_EARED_RABBIT =
            DecorativeHelmetRegistration.register(
                    ITEMS,
                    new Item.Properties().stacksTo(1),
                    SpringTrinketShop.MODID,
                    "decorative_helmet_lop_eared_rabbit",
                    "decorative_helmet_lop_eared_rabbit");

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
