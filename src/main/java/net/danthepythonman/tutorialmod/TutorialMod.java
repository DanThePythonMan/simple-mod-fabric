package net.danthepythonman.tutorialmod;

import net.danthepythonman.tutorialmod.item.ModItemGroups;
import net.danthepythonman.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world! Tutorial Mod Loaded!");
		LOGGER.info("Am looking forward to modding!");
		ModItems.registerModItems();
	}
}