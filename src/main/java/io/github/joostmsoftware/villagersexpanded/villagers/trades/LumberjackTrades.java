package io.github.joostmsoftware.villagersexpanded.villagers.trades;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

import java.util.ArrayList;
import java.util.List;

import static io.github.joostmsoftware.villagersexpanded.villagers.VEVillagers.LUMBERJACK;

public class LumberjackTrades {

    private static final List<Item> SAPLINGS = new ArrayList<>();
    private static final List<Item> LEAVES = new ArrayList<>();

    static {
        SAPLINGS.add(Items.ACACIA_SAPLING);
        SAPLINGS.add(Items.BIRCH_SAPLING);
        SAPLINGS.add(Items.DARK_OAK_SAPLING);
        SAPLINGS.add(Items.JUNGLE_SAPLING);
        SAPLINGS.add(Items.OAK_SAPLING);
        SAPLINGS.add(Items.SPRUCE_SAPLING);
        SAPLINGS.add(Items.MANGROVE_PROPAGULE);

        LEAVES.add(Items.ACACIA_LEAVES);
        LEAVES.add(Items.AZALEA_LEAVES);
        LEAVES.add(Items.BIRCH_LEAVES);
        LEAVES.add(Items.DARK_OAK_LEAVES);
        LEAVES.add(Items.FLOWERING_AZALEA_LEAVES);
        LEAVES.add(Items.JUNGLE_LEAVES);
        LEAVES.add(Items.MANGROVE_LEAVES);
        LEAVES.add(Items.OAK_LEAVES);
        LEAVES.add(Items.SPRUCE_LEAVES);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 1, factories -> {
            factories.add(((entity, random) -> new TradeOffer(
                new ItemStack(SAPLINGS.get(random.nextInt(SAPLINGS.size())), 1),
                new ItemStack(Items.EMERALD, 2),
                15, 1, 0.02f
            )));
            factories.add(((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(Items.BONE_MEAL, 4),
                20, 2, 0.02f
            )));
        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 4),
                new ItemStack(LEAVES.get(random.nextInt(LEAVES.size())), 12),
                20, 5, 0.02f
            ));
            factories.add((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(Items.IRON_AXE, 1),
                10, 10, 0.02f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 3, factories -> {

        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 4, factories -> {

        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 5, factories -> {

        });
    }
}
