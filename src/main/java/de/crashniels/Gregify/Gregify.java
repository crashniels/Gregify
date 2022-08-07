package de.crashniels.Gregify;

import de.crashniels.Gregify.items.GregifyItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gregify implements ModInitializer {
	public static final String MOD_ID = "gregify";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GregifyItems.init();

		LOGGER.debug("Gregify has loaded!");
	}
}
