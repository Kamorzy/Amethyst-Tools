package kamorzy.amethysttools.publictoolitems;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

// Necessary only bc minecraft's AxeItem class's constructor is protected.
public class PublicAxeItem extends AxeItem {
    public PublicAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
