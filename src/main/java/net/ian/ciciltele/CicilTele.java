package net.ian.ciciltele;

import net.fabricmc.api.ModInitializer;

import net.ian.ciciltele.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//hi
public class CicilTele implements ModInitializer {
	public static final String MOD_ID = "ciciltele";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}