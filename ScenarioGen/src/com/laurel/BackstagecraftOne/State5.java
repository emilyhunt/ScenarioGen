package com.laurel.BackstagecraftOne;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import com.laurel.Actions.set;
import com.laurel.Listeners.OnJoinGameMode;
import com.laurel.ScenarioGen.ScenarioState;


public class State5 extends ScenarioState {
	// The victory state!
	
	@Override
	public void enable(Player player, Listeners listeners) {
		player.sendMessage("Enabling state 5.");
		
		// Current gamemodes
		set.allOnlineGameModes(GameMode.SURVIVAL);
		
		// Join gamemode rules
		OnJoinGameMode joinListener = listeners.getOnJoinGameMode();
		joinListener.setMode(GameMode.SURVIVAL);
		GameMode[] modesToAvoid = {};
		joinListener.setAvoidModes(modesToAvoid);
		joinListener.enable();
		
		// Death spectator!
		listeners.getOnDeathSpectator().disable();
		
	}
	
	@Override
	public void disable(Player player, Listeners listeners) {
		player.sendMessage("Disabling state 5.");
		
	}

}
