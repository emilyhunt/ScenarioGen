package com.laurel.Actions;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class set {
	
	// Set all game modes
	public static void allOnlineGameModes(GameMode modeToSet) {
		for (Player player : Bukkit.getOnlinePlayers()) {
			player.setGameMode(modeToSet);
		}
	}
	
	// Teleport all players
//	public static void allOnlinePlayerLocations() {
//		for (Player player : Bukkit.getOnlinePlayers()) {
//			player.setGameMode(modeToSet);
//		}
//	}
	
}
