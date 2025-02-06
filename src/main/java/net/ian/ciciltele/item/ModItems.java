package net.ian.ciciltele.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ian.ciciltele.CicilTele;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Tele = registerItem( "tele", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(CicilTele.MOD_ID, name),item);
    }

    public static void registerModItems(){
        CicilTele.LOGGER.info("Registering Mod items for" + CicilTele.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Tele);
        });
    }
}
