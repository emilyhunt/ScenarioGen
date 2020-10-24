package com.laurel.Listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import com.laurel.ScenarioGen.ScenarioGenPlugin;

public class OnJoinGameMode extends DefaultListener {
	
	public OnJoinGameMode(ScenarioGenPlugin pluginToSet) {
		super(pluginToSet);
	}

	private GameMode mode = GameMode.SURVIVAL;
	private GameMode[] avoid = {};
	
	// This class has a special function! We can dynamically change which modes it does and doesn't set.
	// setMode sets the mode the class will set
	public void setMode(GameMode modeToSet) {
		mode = modeToSet;
	}
	
	// Avoid modes sets any modes you don't want to overwrite (such as spectator mode, typically)
	public void setAvoidModes(GameMode[] modesToAvoid) {
		avoid = modesToAvoid;
	}

	@EventHandler
	private void onPlayerJoin(PlayerJoinEvent event) {
		
		Player player = (Player) event.getPlayer();
		
		// See if we have been asked to change this type of game mode
		GameMode playerGameMode = player.getGameMode();
		boolean changeGameMode = true;
		
		// Loop over the avoid modes seeing if the player's gamemode is one of them
		for (GameMode anAvoidMode: avoid) {
			if (playerGameMode == anAvoidMode) {
				changeGameMode = false;
			}
		}
		
		// Finally, set the player's gamemode if needed
		if (playerGameMode != mode && changeGameMode) {
			player.setGameMode(mode);
		}
		
	}
	
}
