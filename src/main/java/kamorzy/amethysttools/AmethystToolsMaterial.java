package kamorzy.amethysttools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.recipe.Ingredient;

public class AmethystToolsMaterial implements ToolMaterial {

    public static final ToolMaterial INSTANCE = new AmethystToolsMaterial();

    private AmethystToolsMaterial() {}

    @Override
    public int getDurability() {
        return 1062;
    };

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.5f;
    };

    @Override
    public float getAttackDamage() {
        return 3.0f;
    };

    @Override
    public int getMiningLevel() {
        return MiningLevels.IRON;
    };

    @Override
    public int getEnchantability() {
        return 19;
    };

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AMETHYST_CLUSTER);
    };
}
