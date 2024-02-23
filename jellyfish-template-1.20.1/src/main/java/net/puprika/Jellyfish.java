package net.puprika;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.puprika.datagen.ModEntityGeneration;
import net.puprika.entity.ModEntities;
import net.puprika.entity.custom.JellyfishEntity;
import net.puprika.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jellyfish implements ModInitializer {
	public  static final String MOD_ID = "jellyfish";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		FabricDefaultAttributeRegistry.register(ModEntities.JELLYFISH,
				JellyfishEntity.createJellyfishAttributes());

		ModEntityGeneration.addSpawns();
	}
}