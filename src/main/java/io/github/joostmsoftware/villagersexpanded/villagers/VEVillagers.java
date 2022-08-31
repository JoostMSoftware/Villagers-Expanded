package io.github.joostmsoftware.villagersexpanded.villagers;

import com.google.common.collect.ImmutableSet;
import io.github.joostmsoftware.villagersexpanded.VillagersExpanded;
import io.github.joostmsoftware.villagersexpanded.util.ProfessionKeyList;
import io.github.joostmsoftware.villagersexpanded.villagers.trades.LumberjackTrades;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class VEVillagers {

    // register POI's
    public static final PointOfInterestType WOOD_CUTTER_POI = registerPOI("wood_cutter_poi", Blocks.BONE_BLOCK);

    // register Professions
    public static final VillagerProfession LUMBERJACK = registerProfession("lumberjack", ProfessionKeyList.WOOD_CUTTER_POI);

    public static void registerVillagers() {
        VillagersExpanded.LOGGER.debug("Registering villagers & their trades for " + VillagersExpanded.MOD_ID);
    }

    public static void registerTrades() {
        LumberjackTrades.registerTrades();
    }

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(VillagersExpanded.MOD_ID, name),
                VillagerProfessionBuilder.create()
                        .id(new Identifier(VillagersExpanded.MOD_ID, name))
                        .workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER)
                        .build()
        );
    }

    @Contract("_, _ -> new")
    private static @NotNull PointOfInterestType registerPOI(String name, @NotNull Block block) {
        return PointOfInterestHelper.register(new Identifier(VillagersExpanded.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }
}
