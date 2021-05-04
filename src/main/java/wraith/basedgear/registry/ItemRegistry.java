package wraith.basedgear.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import wraith.basedgear.BasedGearItemGroup;
import wraith.basedgear.Utils;
import wraith.basedgear.item.*;
import wraith.basedgear.item.CustomToolMaterials;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private ItemRegistry() {}

    private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>() {{
        put("template_pickaxe", new BasePickaxeItem(CustomToolMaterials.TEMPLATE_MATERIAL, 1, -2.8F, new FabricItemSettings().group(BasedGearItemGroup.ITEM_GROUP)));
        put("template_axe", new BaseAxeItem(CustomToolMaterials.TEMPLATE_MATERIAL, 6, -3.0F, new FabricItemSettings().group(BasedGearItemGroup.ITEM_GROUP)));
        put("template_hoe", new BaseHoeItem(CustomToolMaterials.TEMPLATE_MATERIAL, -2, 0F, new FabricItemSettings().group(BasedGearItemGroup.ITEM_GROUP)));
        put("template_shovel", new BaseShovelItem(CustomToolMaterials.TEMPLATE_MATERIAL, -2, 0F, new FabricItemSettings().group(BasedGearItemGroup.ITEM_GROUP)));
        put("template_sword", new BaseSwordItem(CustomToolMaterials.TEMPLATE_MATERIAL, 3, -2.4F, new FabricItemSettings().group(BasedGearItemGroup.ITEM_GROUP)));
    }};

    public static void register() {
        for (Map.Entry<String, Item> block : ITEMS.entrySet()) {
            Registry.register(Registry.ITEM, Utils.ID(block.getKey()), block.getValue());
        }
    }

    public static Item get(String id) {
        return ITEMS.get(id);
    }

}
