package com.laurel.Listeners;

import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

import com.laurel.ScenarioGen.ScenarioGenPlugin;

public class DefaultListener implements Listener {
	/* Stub for handling the enable() and disable() methods of all listeners.
	 * Child listeners need only overwrite the registerListener() and unregisterListener() methods.
	 */

	public boolean isEnabled = false;
	private ScenarioGenPlugin plugin;
	
	
	public DefaultListener(ScenarioGenPlugin pluginToSet) {
		plugin = pluginToSet;
	}
	
	public void enable() {
		
		if (!isEnabled) {
			registerListener(plugin);
			isEnabled = true;
		}		
		
	}
	
	public void disable() {
		
		if (isEnabled) {
			unregisterListener();
			isEnabled = false;
		}
		
	}
	
	public void registerListener(ScenarioGenPlugin plugin) {
		
		plugin.getServer().getPluginManager().registerEvents(this,  plugin);
		
	}
	
	public void unregisterListener() {
		
		HandlerList.unregisterAll(this);
		
	}
	
//	public void registerListener(ScenarioGenPlugin plugin) {
//		
//	}
//	
//	public void unregisterListener() {
//		
//	}

}
