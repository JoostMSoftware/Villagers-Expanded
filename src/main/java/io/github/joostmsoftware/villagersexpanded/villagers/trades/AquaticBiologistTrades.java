package io.github.joostmsoftware.villagersexpanded.villagers.trades;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

import static io.github.joostmsoftware.villagersexpanded.villagers.VEVillagers.AQUATIC_BIOLOGIST;

public class AquaticBiologistTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(AQUATIC_BIOLOGIST, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.PRISMARINE_SHARD, 5),
                    20, 1, 0.02f
            ));
            factories.add((entity, random) -> new TradeOffer(
               new ItemStack(Items.COD, 4),
               new ItemStack(Items.EMERALD, 4),
               20, 1, 0.02f
            ));
        });
    }
}
