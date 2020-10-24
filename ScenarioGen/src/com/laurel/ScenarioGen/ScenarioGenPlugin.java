package com.laurel.ScenarioGen;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.laurel.BackstagecraftOne.Listeners;
import com.laurel.BackstagecraftOne.State0;
import com.laurel.BackstagecraftOne.State1;
import com.laurel.BackstagecraftOne.State2;
import com.laurel.BackstagecraftOne.State3;
import com.laurel.BackstagecraftOne.State4;
import com.laurel.BackstagecraftOne.State5;
import com.laurel.BackstagecraftOne.State9;


public class ScenarioGenPlugin extends JavaPlugin {
	
	/* Plugin variables */
	static int scenarioLevel = 0;
	private ScenarioState currentScenario;
	private Listeners listeners = new Listeners(this);
	
	
	/* Boilerplate functions */
	@Override
	public void onEnable() {
		
		getLogger().info("ScenarioGen has been enabled.");
		currentScenario = new State0();
		
	}
	
	@Override
	public void onDisable() {
		
		getLogger().info("ScenarioGen has been disabled.");
		
	}
	
	
	/* Command listening for control of the package */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
		Player player = (Player) sender;
		
		// Only listen to the command sender if they have permission!
		if (player.hasPermission("scenariogen.scenariogen")) {
			
			String lowerCommand = cmd.getName().toLowerCase();
			
			switch (lowerCommand) {
			
			// Primary command for the package
			case "scenariogen":
				parseMainCommand(player, args);
				break;
			
			
			// Bad command, you get told you're bad
			default:
				player.sendMessage("Your command to scenariogen was not recognised!");
				
			}
			
		// We ignore the player if they aren't supposed to be doing this
		} else {
			
			player.sendMessage("You do not have permission to use this command!");
			
		}
		
		return true;
			
	}
	
	
	/* Function to parse the main command of the package */
	private boolean parseMainCommand(Player player, String[] args) {
		
		// Let's get the length of the args and test it
		int length = args.length;
		
		// We're only ever supposed to have one arg. If this isn't right, then they messed up...
		if (length == 1) {
			
			// Work out what the next scenario level should be
			// If the arg is "next" then we can just use scenario_level + 1 as the next scenario level
			int nextScenarioLevel;
			
			if (args[0].equalsIgnoreCase("next")) {
				
				nextScenarioLevel = scenarioLevel + 1;
				
			} else if (Util.isNumeric(args[0])) {
				
				nextScenarioLevel = Integer.parseInt(args[0]);
					
			} else {
				
				player.sendMessage(
						"Scenariogen command incorrectly formatted! There should just be one arg which can be 'next' or an integer.");
				return true;
				
			}
			
			// Given that worked, we'll need to cycle over all the scenarios and think a little
			switch (nextScenarioLevel) {
			
			case 0:
				currentScenario.disable(player, listeners);
				currentScenario = new State0();
				currentScenario.enable(player, listeners);
				scenarioLevel = 0;
				return true;
				
			case 1:
				currentScenario.disable(player, listeners);
				currentScenario = new State1();
				currentScenario.enable(player, listeners);
				scenarioLevel = 1;
				return true;
				
			case 2:
				currentScenario.disable(player, listeners);
				currentScenario = new State2();
				currentScenario.enable(player, listeners);
				scenarioLevel = 2;
				return true;
				
			case 3:
				currentScenario.disable(player, listeners);
				currentScenario = new State3();
				currentScenario.enable(player, listeners);
				scenarioLevel = 3;
				return true;
				
			case 4:
				currentScenario.disable(player, listeners);
				currentScenario = new State4();
				currentScenario.enable(player, listeners);
				scenarioLevel = 4;
				return true;
				
			case 5:
				currentScenario.disable(player, listeners);
				currentScenario = new State5();
				currentScenario.enable(player, listeners);
				scenarioLevel = 5;
				return true;
				
//			case 6:
//				currentScenario.disable(player, listeners);
//				currentScenario = new State6();
//				currentScenario.enable(player, listeners);
//				scenarioLevel = 6;
//				return true;
				
			case 9:
				currentScenario.disable(player, listeners);
				currentScenario = new State9();
				currentScenario.enable(player, listeners);
				scenarioLevel = 9;
				return true;
				
			// Otherwise, the next level isn't valid 
			default:
				player.sendMessage("Requested level of this scenario not found!");
			
			}
			
			return true;
			
		}
		
		// In this case, the player sucks
		player.sendMessage(
					"Scenariogen command incorrectly formatted! There should just be one arg which can be 'next' or an integer.");
		return true;
		
	}
	
	
}