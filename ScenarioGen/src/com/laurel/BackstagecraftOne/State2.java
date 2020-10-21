package com.laurel.BackstagecraftOne;
import org.bukkit.entity.Player;
import com.laurel.ScenarioGen.ScenarioState;


public class State2 extends ScenarioState {
	
	@Override
	public void enable(Player player) {
		player.sendMessage("Enabling state 2.");
		
	}
	
	@Override
	public void disable(Player player) {
		player.sendMessage("Disabling state 2.");
		
	}

}
