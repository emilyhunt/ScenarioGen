package com.laurel.BackstagecraftOne;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import com.laurel.Actions.set;
import com.laurel.Listeners.OnJoinGameMode;
import com.laurel.ScenarioGen.ScenarioState;


public class State2 extends ScenarioState {
	// Intro state that reads the story to the players.
	
	@Override
	public void enable(Player player, Listeners listeners) {
		player.sendMessage("Enabling state 2.");
		
		// Current gamemodes
		set.allOnlineGameModes(GameMode.ADVENTURE);
		
		// Join gamemode rules
		OnJoinGameMode joinListener = listeners.getOnJoinGameMode();
		joinListener.setMode(GameMode.ADVENTURE);
		joinListener.enable();
		
	}
	
	@Override
	public void disable(Player player, Listeners listeners) {
		player.sendMessage("Disabling state 2.");
		
	}

}
