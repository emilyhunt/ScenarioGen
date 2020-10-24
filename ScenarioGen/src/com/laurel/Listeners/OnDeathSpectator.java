package com.laurel.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.laurel.ScenarioGen.ScenarioGenPlugin;


public class OnDeathSpectator extends DefaultListener {
	
//	// Enable listener that on death turns dead players into spectators
//	@Override
//	public void registerListener(ScenarioGenPlugin plugin) {
//		
//		plugin.getServer().getPluginManager().registerEvents(this,  plugin);
//		
//	}
//	
//	// Disable!
//	@Override
//	public void unregisterListener() {
//		
//		PlayerDeathEvent.getHandlerList().unregister(this);
//		
//	}
	
	public OnDeathSpectator(ScenarioGenPlugin pluginToSet) {
		super(pluginToSet);
	}

	// The actual listener class
	@EventHandler
	private void onPlayerDeath(PlayerDeathEvent event) {
		
		Player player = (Player) event.getEntity();
		player.setGameMode(org.bukkit.GameMode.SPECTATOR);
		
	}

}
