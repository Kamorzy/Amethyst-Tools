package kamorzy.amethysttools.publictoolitems;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

// Necessary only bc minecraft's HoeItem class's constructor is protected.
public class PublicHoeItem extends HoeItem {
    public PublicHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
