package com.namje.villagerdeed;

import com.namje.villagerdeed.block.entity.custom.VillagerDeedBlockEntity;
import com.namje.villagerdeed.menu.custom.VillagerDeedScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = VillagerDeed.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = VillagerDeed.MODID, value = Dist.CLIENT)
public class VillagerDeedClient {
    public static void openDeedScreen(VillagerDeedBlockEntity blockEntity) {
        Minecraft.getInstance().setScreenAndShow(new VillagerDeedScreen(Component.translatable("block.villagerdeed.namje_villagerdeed"), blockEntity));
    }
}
