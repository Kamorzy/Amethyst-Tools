package kamorzy.amethysttools;

import kamorzy.amethysttools.publictoolitems.PublicHoeItem;
import kamorzy.amethysttools.publictoolitems.PublicPickaxeItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.item.ToolItem;
import kamorzy.amethysttools.publictoolitems.PublicAxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class AmethystToolsInitializer implements ModInitializer {

    public static final ToolItem AMETHYST_AXE = new PublicAxeItem(AmethystToolsMaterial.INSTANCE, 5.0f, -3.0F, new Item.Settings());
    public static final ToolItem AMETHYST_HOE = new PublicHoeItem(AmethystToolsMaterial.INSTANCE, -3, 0.0F, new Item.Settings());
    public static final ToolItem AMETHYST_PICKAXE = new PublicPickaxeItem(AmethystToolsMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static final ToolItem AMETHYST_SHOVEL = new ShovelItem(AmethystToolsMaterial.INSTANCE, 1.5f, -3.0F, new Item.Settings());
    public static final ToolItem AMETHYST_SWORD = new SwordItem(AmethystToolsMaterial.INSTANCE, 3, -2.4F, new Item.Settings());

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(AMETHYST_PICKAXE);
            content.add(AMETHYST_SWORD);
            content.add(AMETHYST_AXE);
            content.add(AMETHYST_SHOVEL);
            content.add(AMETHYST_HOE);
        });
        Registry.register(Registries.ITEM, new Identifier("amethysttools", "amethyst_axe"), AMETHYST_AXE);
        Registry.register(Registries.ITEM, new Identifier("amethysttools", "amethyst_hoe"), AMETHYST_HOE);
        Registry.register(Registries.ITEM, new Identifier("amethysttools", "amethyst_pickaxe"), AMETHYST_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("amethysttools", "amethyst_shovel"), AMETHYST_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("amethysttools", "amethyst_sword"), AMETHYST_SWORD);
    }
}
