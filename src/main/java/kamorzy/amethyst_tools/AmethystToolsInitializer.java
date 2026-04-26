package kamorzy.amethyst_tools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import java.util.function.Function;

public class AmethystToolsInitializer implements ModInitializer {
    public static final String MOD_ID = "amethyst_tools";

    public static final Item AMETHYST_AXE = register(
            "amethyst_axe",
            Item::new,
            new Item.Properties().axe(AmethystToolsMaterial.INSTANCE, 5.0F, -3.0F)
    );

    public static final Item AMETHYST_HOE = register(
            "amethyst_hoe",
            Item::new,
            new Item.Properties().hoe(AmethystToolsMaterial.INSTANCE, -3.0F, 0.0F)
    );

    public static final Item AMETHYST_PICKAXE = register(
            "amethyst_pickaxe",
            Item::new,
            new Item.Properties().pickaxe(AmethystToolsMaterial.INSTANCE, 1.0F, -2.8F)
    );

    public static final Item AMETHYST_SHOVEL = register(
            "amethyst_shovel",
            Item::new,
            new Item.Properties().shovel(AmethystToolsMaterial.INSTANCE, 1.5F, -3.0F)
    );

    public static final Item AMETHYST_SWORD = register(
            "amethyst_sword",
            Item::new,
            new Item.Properties().sword(AmethystToolsMaterial.INSTANCE, 3.0F, -2.4F)
    );

    private static <T extends Item> T register(
            String name,
            Function<Item.Properties, T> itemFactory,
            Item.Properties properties
    ) {
        ResourceKey<Item> itemKey = ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(MOD_ID, name)
        );

        T item = itemFactory.apply(properties.setId(itemKey));
        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    @Override
    public void onInitialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
            entries.accept(AMETHYST_PICKAXE);
            entries.accept(AMETHYST_AXE);
            entries.accept(AMETHYST_SHOVEL);
            entries.accept(AMETHYST_HOE);
            entries.accept(AMETHYST_SWORD);
        });
    }
}