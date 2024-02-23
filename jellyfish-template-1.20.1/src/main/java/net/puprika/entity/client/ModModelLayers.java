package net.puprika.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.puprika.Jellyfish;

public class ModModelLayers {
    public static final EntityModelLayer JELLYFISH =
            new EntityModelLayer(new Identifier(Jellyfish.MOD_ID, "jellyfish"), "main");
}