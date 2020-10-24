package com.laurel.BackstagecraftOne;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import com.laurel.Actions.set;
import com.laurel.Listeners.OnJoinGameMode;
import com.laurel.ScenarioGen.ScenarioState;


public class State1 extends ScenarioState {
	// Join state for players in the lobby room.
	
	@Override
	public void enable(Player player, Listeners listeners) {
		player.sendMessage("Enabling state 1.");
		
		// Current gamemodes
		set.allOnlineGameModes(GameMode.ADVENTURE);
		
		// Join gamemode rules
		OnJoinGameMode joinListener = listeners.getOnJoinGameMode();
		joinListener.setMode(GameMode.ADVENTURE);
		joinListener.enable();
		
	}
	
	@Override
	public void disable(Player player, Listeners listeners) {
		player.sendMessage("Disabling state 1.");
		
	}

}
