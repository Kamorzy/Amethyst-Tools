package kamorzy.amethysttools;

import kamorzy.amethysttools.publictoolitems.PublicHoeItem;
import kamorzy.amethysttools.publictoolitems.PublicPickaxeItem;
import net.fabricmc.api.ModInitializer;
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
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class AmethystToolsInitializer implements ModInitializer {

    public static final ToolItem AMETHYST_AXE = new PublicAxeItem(AmethystToolsMaterial.INSTANCE, 5.0f, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_HOE = new PublicHoeItem(AmethystToolsMaterial.INSTANCE, -3, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_PICKAXE = new PublicPickaxeItem(AmethystToolsMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_SHOVEL = new ShovelItem(AmethystToolsMaterial.INSTANCE, 1.5f, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_SWORD = new SwordItem(AmethystToolsMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_axe"), AMETHYST_AXE);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_hoe"), AMETHYST_HOE);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_pickaxe"), AMETHYST_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_shovel"), AMETHYST_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_sword"), AMETHYST_SWORD);
    }
}
