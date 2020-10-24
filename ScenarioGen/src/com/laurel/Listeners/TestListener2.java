package com.laurel.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

import com.laurel.ScenarioGen.ScenarioGenPlugin;

public class TestListener2 extends DefaultListener {

	public TestListener2(ScenarioGenPlugin pluginToSet) {
		super(pluginToSet);
	}

	@EventHandler
	private void onPlayerDeath(PlayerMoveEvent event) {
		
		Player player = (Player) event.getPlayer();
		player.sendMessage("TestListener2 is active");
		
	}

}
