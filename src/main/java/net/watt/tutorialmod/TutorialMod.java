package net.watt.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.watt.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String mod_id = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(mod_id);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}