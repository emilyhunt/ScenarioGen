package com.laurel.BackstagecraftOne;
import org.bukkit.entity.Player;
import com.laurel.ScenarioGen.ScenarioState;


public class State3 extends ScenarioState {
	
	@Override
	public void enable(Player player) {
		player.sendMessage("Enabling state 3.");
		
	}
	
	@Override
	public void disable(Player player) {
		player.sendMessage("Disabling state 3.");
		
	}

}
