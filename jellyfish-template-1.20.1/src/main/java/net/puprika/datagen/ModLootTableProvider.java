package net.puprika.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.util.Identifier;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    private static final Identifier JELLYFISH_ID
            = new Identifier("jellyfish", "entities/jellyfish");
    @Override
    public void generate() {

    }
}
