package kamorzy.amethysttools.publictoolitems;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

// Necessary only bc minecraft's PickaxeItem class's constructor is protected.
public class PublicPickaxeItem extends PickaxeItem {
    public PublicPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
