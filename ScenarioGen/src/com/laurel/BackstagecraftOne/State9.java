package com.laurel.BackstagecraftOne;
import org.bukkit.entity.Player;
import com.laurel.ScenarioGen.ScenarioState;


public class State9 extends ScenarioState {
	
	@Override
	public void enable(Player player) {
		player.sendMessage("Enabling state 9.");
		
	}
	
	@Override
	public void disable(Player player) {
		player.sendMessage("Disabling state 9.");
		
	}

}
