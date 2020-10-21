package com.laurel.BackstagecraftOne;
import org.bukkit.entity.Player;
import com.laurel.ScenarioGen.ScenarioState;


public class State0 extends ScenarioState {
	
	@Override
	public void enable(Player player) {
		player.sendMessage("Enabling state 0.");
		
	}
	
	@Override
	public void disable(Player player) {
		player.sendMessage("Disabling state 0.");
		
	}

}
