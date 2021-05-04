package wraith.basedgear;

import net.minecraft.util.Identifier;

public class Utils {

    public static Identifier ID(String path) {
        return new Identifier(BasedGear.MOD_ID, path);
    }

}
