package io.github.joostmsoftware.villagersexpanded.util;

import io.github.joostmsoftware.villagersexpanded.VillagersExpanded;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.poi.PointOfInterestType;

public class ProfessionKeyList {
    public static final RegistryKey<PointOfInterestType> WOOD_CUTTER_POI = registerKey("wood_cutter_poi");

    private static RegistryKey<PointOfInterestType> registerKey(String path) {
        return RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(VillagersExpanded.MOD_ID, path));
    }
}
