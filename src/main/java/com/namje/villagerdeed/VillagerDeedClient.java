package com.namje.villagerdeed;

import com.namje.villagerdeed.block.entity.custom.VillagerDeedBlockEntity;
import com.namje.villagerdeed.menu.custom.VillagerDeedScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@Mod.EventBusSubscriber(modid = VillagerDeed.MODID, value = Dist.CLIENT)
public class VillagerDeedClient {
    public static void openDeedScreen(VillagerDeedBlockEntity blockEntity) {
        Minecraft.getInstance().setScreen(new VillagerDeedScreen(Component.translatable("block.villagerdeed.namje_villagerdeed"), blockEntity));
    }
}
