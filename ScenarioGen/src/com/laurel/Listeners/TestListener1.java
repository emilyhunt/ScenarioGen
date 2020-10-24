package com.laurel.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

import com.laurel.ScenarioGen.ScenarioGenPlugin;

public class TestListener1 extends DefaultListener {

	public TestListener1(ScenarioGenPlugin pluginToSet) {
		super(pluginToSet);
	}

	@EventHandler
	private void onPlayerDeath(PlayerMoveEvent event) {
		
		Player player = (Player) event.getPlayer();
		player.sendMessage("TestListener1 is active");
		
	}

}
