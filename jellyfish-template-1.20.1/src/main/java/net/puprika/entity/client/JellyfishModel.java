package net.puprika.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.puprika.entity.animation.ModAnimations;
import net.puprika.entity.custom.JellyfishEntity;

public class JellyfishModel<T extends JellyfishEntity> extends SinglePartEntityModel<T> {
	private final ModelPart main;

	public JellyfishModel(ModelPart root) {

		this.main = root.getChild("main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -17.0F, 0.0F, 8.0F, 6.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.0F, -4.0F));

		ModelPartData tentacle1 = main.addChild("tentacle1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = tentacle1.addChild("cube_r1", ModelPartBuilder.create().uv(12, 20).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone = tentacle1.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(10, 20).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone2 = bone.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = bone2.addChild("cube_r3", ModelPartBuilder.create().uv(8, 20).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone3 = bone2.addChild("bone3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r4 = bone3.addChild("cube_r4", ModelPartBuilder.create().uv(6, 20).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone4 = bone3.addChild("bone4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r5 = bone4.addChild("cube_r5", ModelPartBuilder.create().uv(4, 20).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone5 = bone4.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r6 = bone5.addChild("cube_r6", ModelPartBuilder.create().uv(2, 20).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone6 = bone5.addChild("bone6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r7 = bone6.addChild("cube_r7", ModelPartBuilder.create().uv(0, 20).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone7 = bone6.addChild("bone7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r8 = bone7.addChild("cube_r8", ModelPartBuilder.create().uv(18, 19).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle2 = main.addChild("tentacle2", ModelPartBuilder.create(), ModelTransform.of(-5.0F, 0.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r9 = tentacle2.addChild("cube_r9", ModelPartBuilder.create().uv(16, 19).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone8 = tentacle2.addChild("bone8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r10 = bone8.addChild("cube_r10", ModelPartBuilder.create().uv(4, 19).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone9 = bone8.addChild("bone9", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r11 = bone9.addChild("cube_r11", ModelPartBuilder.create().uv(2, 19).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone10 = bone9.addChild("bone10", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r12 = bone10.addChild("cube_r12", ModelPartBuilder.create().uv(14, 19).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone11 = bone10.addChild("bone11", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r13 = bone11.addChild("cube_r13", ModelPartBuilder.create().uv(12, 19).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone12 = bone11.addChild("bone12", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r14 = bone12.addChild("cube_r14", ModelPartBuilder.create().uv(10, 19).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone13 = bone12.addChild("bone13", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r15 = bone13.addChild("cube_r15", ModelPartBuilder.create().uv(8, 19).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone14 = bone13.addChild("bone14", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r16 = bone14.addChild("cube_r16", ModelPartBuilder.create().uv(6, 19).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone15 = bone14.addChild("bone15", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r17 = bone15.addChild("cube_r17", ModelPartBuilder.create().uv(18, 18).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone16 = bone15.addChild("bone16", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tentacle3 = main.addChild("tentacle3", ModelPartBuilder.create(), ModelTransform.of(-8.0F, 0.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r18 = tentacle3.addChild("cube_r18", ModelPartBuilder.create().uv(18, 17).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone17 = tentacle3.addChild("bone17", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r19 = bone17.addChild("cube_r19", ModelPartBuilder.create().uv(12, 18).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone18 = bone17.addChild("bone18", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r20 = bone18.addChild("cube_r20", ModelPartBuilder.create().uv(10, 18).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone19 = bone18.addChild("bone19", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r21 = bone19.addChild("cube_r21", ModelPartBuilder.create().uv(18, 16).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone20 = bone19.addChild("bone20", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r22 = bone20.addChild("cube_r22", ModelPartBuilder.create().uv(16, 18).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone21 = bone20.addChild("bone21", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r23 = bone21.addChild("cube_r23", ModelPartBuilder.create().uv(18, 15).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone22 = bone21.addChild("bone22", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r24 = bone22.addChild("cube_r24", ModelPartBuilder.create().uv(18, 14).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone23 = bone22.addChild("bone23", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r25 = bone23.addChild("cube_r25", ModelPartBuilder.create().uv(14, 18).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone24 = bone23.addChild("bone24", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r26 = bone24.addChild("cube_r26", ModelPartBuilder.create().uv(8, 18).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone25 = bone24.addChild("bone25", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r27 = bone25.addChild("cube_r27", ModelPartBuilder.create().uv(0, 1).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone26 = bone25.addChild("bone26", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r28 = bone26.addChild("cube_r28", ModelPartBuilder.create().uv(0, 0).cuboid(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle4 = main.addChild("tentacle4", ModelPartBuilder.create(), ModelTransform.of(-7.0F, 0.0F, 4.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r29 = tentacle4.addChild("cube_r29", ModelPartBuilder.create().uv(6, 18).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone27 = tentacle4.addChild("bone27", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r30 = bone27.addChild("cube_r30", ModelPartBuilder.create().uv(12, 17).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone28 = bone27.addChild("bone28", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r31 = bone28.addChild("cube_r31", ModelPartBuilder.create().uv(10, 17).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone29 = bone28.addChild("bone29", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r32 = bone29.addChild("cube_r32", ModelPartBuilder.create().uv(4, 18).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone30 = bone29.addChild("bone30", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r33 = bone30.addChild("cube_r33", ModelPartBuilder.create().uv(2, 18).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone31 = bone30.addChild("bone31", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r34 = bone31.addChild("cube_r34", ModelPartBuilder.create().uv(0, 18).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone32 = bone31.addChild("bone32", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r35 = bone32.addChild("cube_r35", ModelPartBuilder.create().uv(16, 17).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone33 = bone32.addChild("bone33", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r36 = bone33.addChild("cube_r36", ModelPartBuilder.create().uv(14, 17).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone34 = bone33.addChild("bone34", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r37 = bone34.addChild("cube_r37", ModelPartBuilder.create().uv(8, 17).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle5 = main.addChild("tentacle5", ModelPartBuilder.create(), ModelTransform.of(-7.0F, 0.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r38 = tentacle5.addChild("cube_r38", ModelPartBuilder.create().uv(6, 17).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone35 = tentacle5.addChild("bone35", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r39 = bone35.addChild("cube_r39", ModelPartBuilder.create().uv(16, 14).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone36 = bone35.addChild("bone36", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r40 = bone36.addChild("cube_r40", ModelPartBuilder.create().uv(14, 16).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone37 = bone36.addChild("bone37", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r41 = bone37.addChild("cube_r41", ModelPartBuilder.create().uv(4, 17).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone38 = bone37.addChild("bone38", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r42 = bone38.addChild("cube_r42", ModelPartBuilder.create().uv(2, 17).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone39 = bone38.addChild("bone39", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r43 = bone39.addChild("cube_r43", ModelPartBuilder.create().uv(0, 17).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone40 = bone39.addChild("bone40", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r44 = bone40.addChild("cube_r44", ModelPartBuilder.create().uv(16, 16).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone41 = bone40.addChild("bone41", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r45 = bone41.addChild("cube_r45", ModelPartBuilder.create().uv(16, 15).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone42 = bone41.addChild("bone42", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r46 = bone42.addChild("cube_r46", ModelPartBuilder.create().uv(12, 16).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone43 = bone42.addChild("bone43", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r47 = bone43.addChild("cube_r47", ModelPartBuilder.create().uv(10, 16).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle6 = main.addChild("tentacle6", ModelPartBuilder.create(), ModelTransform.of(-7.0F, 0.0F, 8.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r48 = tentacle6.addChild("cube_r48", ModelPartBuilder.create().uv(8, 16).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone44 = tentacle6.addChild("bone44", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r49 = bone44.addChild("cube_r49", ModelPartBuilder.create().uv(12, 15).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone45 = bone44.addChild("bone45", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r50 = bone45.addChild("cube_r50", ModelPartBuilder.create().uv(10, 15).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone46 = bone45.addChild("bone46", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r51 = bone46.addChild("cube_r51", ModelPartBuilder.create().uv(6, 16).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone47 = bone46.addChild("bone47", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r52 = bone47.addChild("cube_r52", ModelPartBuilder.create().uv(4, 16).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone48 = bone47.addChild("bone48", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r53 = bone48.addChild("cube_r53", ModelPartBuilder.create().uv(2, 16).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone49 = bone48.addChild("bone49", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r54 = bone49.addChild("cube_r54", ModelPartBuilder.create().uv(0, 16).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone50 = bone49.addChild("bone50", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r55 = bone50.addChild("cube_r55", ModelPartBuilder.create().uv(14, 15).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone51 = bone50.addChild("bone51", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r56 = bone51.addChild("cube_r56", ModelPartBuilder.create().uv(8, 15).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone52 = bone51.addChild("bone52", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r57 = bone52.addChild("cube_r57", ModelPartBuilder.create().uv(6, 15).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle7 = main.addChild("tentacle7", ModelPartBuilder.create(), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r58 = tentacle7.addChild("cube_r58", ModelPartBuilder.create().uv(4, 15).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone53 = tentacle7.addChild("bone53", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r59 = bone53.addChild("cube_r59", ModelPartBuilder.create().uv(8, 14).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone54 = bone53.addChild("bone54", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r60 = bone54.addChild("cube_r60", ModelPartBuilder.create().uv(6, 14).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone55 = bone54.addChild("bone55", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r61 = bone55.addChild("cube_r61", ModelPartBuilder.create().uv(2, 15).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone56 = bone55.addChild("bone56", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r62 = bone56.addChild("cube_r62", ModelPartBuilder.create().uv(0, 15).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone57 = bone56.addChild("bone57", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r63 = bone57.addChild("cube_r63", ModelPartBuilder.create().uv(14, 14).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone58 = bone57.addChild("bone58", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r64 = bone58.addChild("cube_r64", ModelPartBuilder.create().uv(12, 14).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone59 = bone58.addChild("bone59", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r65 = bone59.addChild("cube_r65", ModelPartBuilder.create().uv(10, 14).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone60 = bone59.addChild("bone60", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r66 = bone60.addChild("cube_r66", ModelPartBuilder.create().uv(4, 14).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone61 = bone60.addChild("bone61", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r67 = bone61.addChild("cube_r67", ModelPartBuilder.create().uv(2, 14).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone62 = bone61.addChild("bone62", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r68 = bone62.addChild("cube_r68", ModelPartBuilder.create().uv(0, 14).cuboid(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle8 = main.addChild("tentacle8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 7.0F));

		ModelPartData cube_r69 = tentacle8.addChild("cube_r69", ModelPartBuilder.create().uv(6, 7).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone63 = tentacle8.addChild("bone63", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r70 = bone63.addChild("cube_r70", ModelPartBuilder.create().uv(6, 4).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone64 = bone63.addChild("bone64", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r71 = bone64.addChild("cube_r71", ModelPartBuilder.create().uv(4, 6).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone65 = bone64.addChild("bone65", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r72 = bone65.addChild("cube_r72", ModelPartBuilder.create().uv(4, 7).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone66 = bone65.addChild("bone66", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r73 = bone66.addChild("cube_r73", ModelPartBuilder.create().uv(2, 7).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone67 = bone66.addChild("bone67", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r74 = bone67.addChild("cube_r74", ModelPartBuilder.create().uv(0, 7).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone68 = bone67.addChild("bone68", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r75 = bone68.addChild("cube_r75", ModelPartBuilder.create().uv(6, 6).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone69 = bone68.addChild("bone69", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r76 = bone69.addChild("cube_r76", ModelPartBuilder.create().uv(6, 5).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone70 = bone69.addChild("bone70", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r77 = bone70.addChild("cube_r77", ModelPartBuilder.create().uv(6, 3).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle9 = main.addChild("tentacle9", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 4.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r78 = tentacle9.addChild("cube_r78", ModelPartBuilder.create().uv(6, 2).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone71 = tentacle9.addChild("bone71", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r79 = bone71.addChild("cube_r79", ModelPartBuilder.create().uv(2, 5).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone72 = bone71.addChild("bone72", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r80 = bone72.addChild("cube_r80", ModelPartBuilder.create().uv(0, 5).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone73 = bone72.addChild("bone73", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r81 = bone73.addChild("cube_r81", ModelPartBuilder.create().uv(2, 6).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone74 = bone73.addChild("bone74", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r82 = bone74.addChild("cube_r82", ModelPartBuilder.create().uv(6, 1).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone75 = bone74.addChild("bone75", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r83 = bone75.addChild("cube_r83", ModelPartBuilder.create().uv(6, 0).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone76 = bone75.addChild("bone76", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r84 = bone76.addChild("cube_r84", ModelPartBuilder.create().uv(0, 6).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone77 = bone76.addChild("bone77", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r85 = bone77.addChild("cube_r85", ModelPartBuilder.create().uv(4, 5).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone78 = bone77.addChild("bone78", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r86 = bone78.addChild("cube_r86", ModelPartBuilder.create().uv(4, 4).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone79 = bone78.addChild("bone79", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r87 = bone79.addChild("cube_r87", ModelPartBuilder.create().uv(4, 3).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData tentacle10 = main.addChild("tentacle10", ModelPartBuilder.create(), ModelTransform.of(-1.0F, 0.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r88 = tentacle10.addChild("cube_r88", ModelPartBuilder.create().uv(4, 2).cuboid(1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone80 = tentacle10.addChild("bone80", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r89 = bone80.addChild("cube_r89", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone81 = bone80.addChild("bone81", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r90 = bone81.addChild("cube_r90", ModelPartBuilder.create().uv(2, 2).cuboid(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone82 = bone81.addChild("bone82", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r91 = bone82.addChild("cube_r91", ModelPartBuilder.create().uv(2, 4).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone83 = bone82.addChild("bone83", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r92 = bone83.addChild("cube_r92", ModelPartBuilder.create().uv(4, 1).cuboid(1.0F, -7.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone84 = bone83.addChild("bone84", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r93 = bone84.addChild("cube_r93", ModelPartBuilder.create().uv(4, 0).cuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone85 = bone84.addChild("bone85", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r94 = bone85.addChild("cube_r94", ModelPartBuilder.create().uv(0, 4).cuboid(1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone86 = bone85.addChild("bone86", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r95 = bone86.addChild("cube_r95", ModelPartBuilder.create().uv(2, 3).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone87 = bone86.addChild("bone87", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r96 = bone87.addChild("cube_r96", ModelPartBuilder.create().uv(2, 1).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone88 = bone87.addChild("bone88", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r97 = bone88.addChild("cube_r97", ModelPartBuilder.create().uv(2, 0).cuboid(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone89 = bone88.addChild("bone89", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r98 = bone89.addChild("cube_r98", ModelPartBuilder.create().uv(0, 2).cuboid(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(JellyfishEntity entity, float limbSwing, float limbSwingAmount,
						  float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.animateMovement(ModAnimations.IDLE, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, ageInTicks, 1f);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return main;
	}
}