package net.puprika.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.puprika.Jellyfish;
import net.puprika.entity.custom.JellyfishEntity;

public class JellyfishRenderer extends MobEntityRenderer<JellyfishEntity, JellyfishModel<JellyfishEntity>> {
    private static final Identifier TEXTURE = new Identifier(Jellyfish.MOD_ID,
            "textures/entity/jellyfish.png");

    public JellyfishRenderer(EntityRendererFactory.Context context) {
        super(context, new JellyfishModel<>(context.getPart(ModModelLayers.JELLYFISH)), 0.5f);
    }

    @Override
    public Identifier getTexture(JellyfishEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(JellyfishEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
