package org.lanye.spring_trinket_shop.bootstrap.item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.lanye.spring_trinket_shop.SpringTrinketShop;

/**
 * 本模组创造模式物品栏（CreativeModeTab）注册。
 */
public final class ModCreativeTabs {

    private ModCreativeTabs() {}

    private static List<Consumer<CreativeModeTab.Output>> mainTabDisplayOrder() {
        List<Consumer<CreativeModeTab.Output>> list = new ArrayList<>();
        list.add(out -> out.accept(ModItems.DECORATIVE_HELMET_BLUE_TOP_HAT.get()));
        list.add(out -> out.accept(ModItems.DECORATIVE_HELMET_PINK_TOP_HAT.get()));
        list.add(out -> out.accept(ModItems.DECORATIVE_HELMET_LOP_EARED_RABBIT.get()));
        list.add(out -> out.accept(ModItems.DECORATIVE_HELMET_PHOEBE.get()));
        return List.copyOf(list);
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpringTrinketShop.MODID);

    /** 主创造栏（创造物品栏图标：粉色礼帽） */
    public static final RegistryObject<CreativeModeTab> MAIN =
            CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.spring_trinket_shop.main"))
                    .icon(() -> new ItemStack(ModItems.DECORATIVE_HELMET_PINK_TOP_HAT.get()))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .displayItems((params, output) -> {
                        for (Consumer<CreativeModeTab.Output> entry : mainTabDisplayOrder()) {
                            entry.accept(output);
                        }
                    })
                    .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
