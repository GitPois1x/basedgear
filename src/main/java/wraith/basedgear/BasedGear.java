package wraith.basedgear;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.basedgear.registry.ItemRegistry;

public class BasedGear implements ModInitializer {

    public static final String MOD_ID = "basedgear";
    public static final String MOD_NAME = "Based Gear";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        LOGGER.info("[" + MOD_NAME + "] has been initiated.");
    }

}
