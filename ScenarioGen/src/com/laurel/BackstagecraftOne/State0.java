package com.laurel.BackstagecraftOne;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import com.laurel.Actions.set;
import com.laurel.Listeners.OnJoinGameMode;
import com.laurel.ScenarioGen.ScenarioState;


public class State0 extends ScenarioState {
	// Introductory state where nothing happens!
	
	@Override
	public void enable(Player player, Listeners listeners) {
		player.sendMessage("Enabling state 0.");
		
		// Current gamemodes
		set.allOnlineGameModes(GameMode.SURVIVAL);
		
		// Join gamemode rules
		OnJoinGameMode joinListener = listeners.getOnJoinGameMode();
		joinListener.setMode(GameMode.SURVIVAL);
		joinListener.enable();
		
		
	}
	
	@Override
	public void disable(Player player, Listeners listeners) {
		player.sendMessage("Disabling state 0.");
		
		
	}

}
