package org.ultramine.mods.umcommands;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = UMCommands.MOD_ID, name = UMCommands.NAME, version = UMCommands.VERSION, acceptableRemoteVersions = "*")
public class UMCommands
{
	public static final String MOD_ID = "UMCommands";
	public static final String NAME = "UMCommands";
	public static final String VERSION = "1.0";

	@Mod.EventHandler
	public void onServerStarting(FMLServerStartingEvent event)
	{
		if(event.getSide().isServer())
			new ButtonCommand(event.getServer()).load(event);
		event.registerCommands(BasicCommands.class);
		event.registerCommands(OpenInvCommands.class);
	}
}
