package kamorzy.amethyst_tools;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class AmethystToolsMaterial {
    public static final TagKey<Item> REPAIRS_AMETHYST_TOOLS = TagKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(AmethystToolsInitializer.MOD_ID, "repairs_amethyst_tools")
    );

    public static final ToolMaterial INSTANCE = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1062,
            7.0F,
            2.5F,
            19,
            REPAIRS_AMETHYST_TOOLS
    );

    private AmethystToolsMaterial() {
    }
}