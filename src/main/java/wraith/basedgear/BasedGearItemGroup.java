package wraith.basedgear;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import wraith.basedgear.registry.ItemRegistry;

public class BasedGearItemGroup {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(Utils.ID("based_gear")).icon(() -> new ItemStack(ItemRegistry.get("template_pickaxe"))).build();

}
