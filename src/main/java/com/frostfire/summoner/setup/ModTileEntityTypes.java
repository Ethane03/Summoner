package com.frostfire.summoner.setup;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

import java.util.Arrays;
import java.util.function.Supplier;

import com.frostfire.summoner.block.metalpress.MetalPressTileEntity;

public class ModTileEntityTypes {
    public static final RegistryObject<TileEntityType<MetalPressTileEntity>> METAL_PRESS = register(
            "metal_press",
            MetalPressTileEntity::new,
            ModBlocks.METAL_PRESS
    );

    static void register() {}

    private static <T extends TileEntity> RegistryObject<TileEntityType<T>> register(String name, Supplier<T> factory, RegistryObject<? extends Block> block) {
        return Registration.TILE_ENTITIES.register(name, () -> {
            //noinspection ConstantConditions - null in build
            return TileEntityType.Builder.of(factory, block.get()).build(null);
        });
    }
}
