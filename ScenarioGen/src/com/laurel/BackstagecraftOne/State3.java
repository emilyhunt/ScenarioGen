package com.laurel.BackstagecraftOne;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import com.laurel.Actions.set;
import com.laurel.Listeners.OnJoinGameMode;
import com.laurel.ScenarioGen.ScenarioState;


public class State3 extends ScenarioState {
	// Preparation state where players have to prepare for the raid.
	
	@Override
	public void enable(Player player, Listeners listeners) {
		player.sendMessage("Enabling state 3.");
		
		// Current gamemodes
		set.allOnlineGameModes(GameMode.SURVIVAL);
		
		// Join gamemode rules
		OnJoinGameMode joinListener = listeners.getOnJoinGameMode();
		joinListener.setMode(GameMode.SURVIVAL);
		GameMode[] modesToAvoid = {GameMode.SPECTATOR};
		joinListener.setAvoidModes(modesToAvoid);
		joinListener.enable();
		
		// Death spectator!
		listeners.getOnDeathSpectator().enable();
		
	}
	
	@Override
	public void disable(Player player, Listeners listeners) {
		player.sendMessage("Disabling state 3.");
		
	}

}
