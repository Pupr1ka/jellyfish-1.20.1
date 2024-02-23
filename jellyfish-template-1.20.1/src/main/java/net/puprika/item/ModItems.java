package net.puprika.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.puprika.Jellyfish;
import net.puprika.entity.ModEntities;
import net.puprika.item.custom.ModArmorItem;

public class ModItems {
    public static final Item MESOGLEA =  registerItem("mesoglea", new Item(new FabricItemSettings()));
    public static final Item WASHED_MESOGLEA =  registerItem("washed_mesoglea", new Item(new FabricItemSettings()));

    public static final Item JELLYFISH_SPAWN_EGG = registerItem("jellyfish_spawn_egg",
            new SpawnEggItem(ModEntities.JELLYFISH, 0xa88df7, 0x4438cf, new FabricItemSettings()));

    public static final Item JELLY_BLOUSE = registerItem("jelly_blouse",
            new ModArmorItem(ModArmorMaterials.JELLY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(MESOGLEA);
        entries.add(WASHED_MESOGLEA);
    }
    private static void addItemsToSpawnEggsItemGroup(FabricItemGroupEntries entries){
        entries.add(JELLYFISH_SPAWN_EGG);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(JELLY_BLOUSE);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Jellyfish.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Jellyfish.LOGGER.info("Registering Mod Items for " + Jellyfish.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggsItemGroup);

    }
}
