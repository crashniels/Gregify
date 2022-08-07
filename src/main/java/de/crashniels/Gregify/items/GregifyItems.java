package de.crashniels.Gregify.items;

import aztech.modern_industrialization.MIItem;
import aztech.modern_industrialization.definition.ItemDefinition;
import aztech.modern_industrialization.items.SortOrder;
import net.minecraft.world.item.Item;

public class GregifyItems {
    // SMDs
    public static final ItemDefinition<Item> SMD_CAPACITOR = MIItem.item("SMD Capacitor", "smd_capacitor", SortOrder.ITEMS_OTHER);
    public static final ItemDefinition<Item> SMD_DIODE = MIItem.item("SMD Diode", "smd_diode", SortOrder.ITEMS_OTHER);
    public static final ItemDefinition<Item> SMD_INDUCTOR = MIItem.item("SMD Inductor", "smd_inductor", SortOrder.ITEMS_OTHER);
    public static final ItemDefinition<Item> SMD_RESISTOR = MIItem.item("SMD Resistor", "smd_resistor", SortOrder.ITEMS_OTHER);
    public static final ItemDefinition<Item> SMD_TRANSISTOR = MIItem.item("SMD Transistor", "smd_transistor", SortOrder.ITEMS_OTHER);

    public static void init() {

    }
}
