package io.github.joostmsoftware.villagersexpanded.villagers.trades;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

import static io.github.joostmsoftware.villagersexpanded.villagers.VEVillagers.LUMBERJACK;

public class LumberjackTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 1, factories -> {
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.SPRUCE_SAPLING, 1),
                    new ItemStack(Items.EMERALD, 2),
                    6, 2, 0.02f
            )));
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.ACACIA_SAPLING, 1),
                    new ItemStack(Items.EMERALD, 2),
                    6, 2, 0.02f
            )));
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.BIRCH_SAPLING, 1),
                    new ItemStack(Items.EMERALD, 2),
                    6, 2, 0.02f
            )));
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.OAK_SAPLING, 1),
                    new ItemStack(Items.EMERALD, 2),
                    6, 2, 0.02f
            )));
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.JUNGLE_SAPLING, 1),
                    new ItemStack(Items.EMERALD, 2),
                    6, 2, 0.02f
            )));
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.DARK_OAK_SAPLING, 1),
                    new ItemStack(Items.EMERALD, 2),
                    6, 2, 0.02f
            )));
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.BONE_MEAL, 4),
                    6, 2, 0.02f
            )));
        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 2, factories -> {

        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 3, factories -> {

        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 4, factories -> {

        });

        TradeOfferHelper.registerVillagerOffers(LUMBERJACK, 5, factories -> {

        });
    }
}
