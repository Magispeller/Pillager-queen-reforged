package com.magispeller.pillagerqueen.core.registry;

import com.magispeller.pillagerqueen.core.ModMain;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems 
{
    // 修改方案A：使用 ForgeRegistries.Keys (推荐且明确)
    // 这是1.19.3+ 推荐的方式之一，能确保类型安全。
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.Keys.ITEMS, ModMain.MOD_ID);

    // 修改方案B (备用)：如果你遇到问题，可以尝试回退到这种旧的泛型方式，但需要导入 ForgeRegistries
    // public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModMain.MOD_ID);
	
    public static final RegistryObject<Item> PILLAGER_QUEEN_SPAWN_EGG = ITEMS.register("pillager_queen_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    () -> ModEntities.PILLAGER_QUEEN.get(), // 实体引用
                    10977222, // 主颜色
                    7558869, // 斑点颜色
                    new Item.Properties()
                    // 1.20.1 中，.tab() 方法已被移除。刷怪蛋会自动归入“杂项”或“刷怪蛋”标签页。
                    // 如果你需要自定义，需按新API实现，这属于高级功能，可暂不处理。
            ));
}