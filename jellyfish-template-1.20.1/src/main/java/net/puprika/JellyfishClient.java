package net.puprika;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.puprika.entity.ModEntities;
import net.puprika.entity.client.JellyfishModel;
import net.puprika.entity.client.JellyfishRenderer;
import net.puprika.entity.client.ModModelLayers;

public class JellyfishClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.JELLYFISH, JellyfishRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.JELLYFISH,
                JellyfishModel::getTexturedModelData);

    }
}
