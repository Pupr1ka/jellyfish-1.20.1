package net.puprika.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.puprika.Jellyfish;
import net.puprika.entity.custom.JellyfishEntity;

public class ModEntities {
    public static final EntityType<JellyfishEntity> JELLYFISH = Registry.
            register(Registries.ENTITY_TYPE,
            new Identifier(Jellyfish.MOD_ID, "jellyfish"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, JellyfishEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1f)).build());

}

