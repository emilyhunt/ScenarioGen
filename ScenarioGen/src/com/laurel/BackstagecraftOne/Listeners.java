package com.laurel.BackstagecraftOne;

import com.laurel.Listeners.OnDeathSpectator;
import com.laurel.Listeners.OnJoinGameMode;
import com.laurel.Listeners.TestListener1;
import com.laurel.Listeners.TestListener2;
import com.laurel.ScenarioGen.ScenarioGenPlugin;

public class Listeners {
	/* This class exists as a registry of all listeners the plugin can use! They all get made once. This class gets
	 * passed around like a hot potato to all of the states. Yay!
	 */
	
	// All accessible listeners should be here and should have a corresponding getter.
	private static OnDeathSpectator onDeathSpectator;
	private static OnJoinGameMode onJoinGameMode;
	private static TestListener1 testListener1;
	private static TestListener2 testListener2;
	
	public Listeners(ScenarioGenPlugin plugin) {
		onDeathSpectator = new OnDeathSpectator(plugin); 
		onJoinGameMode= new OnJoinGameMode(plugin);
		testListener1 = new TestListener1(plugin);
		testListener2 = new TestListener2(plugin);
		
	}
	
	public OnDeathSpectator getOnDeathSpectator() {
		return onDeathSpectator;
	}
	
	public OnJoinGameMode getOnJoinGameMode() {
		return onJoinGameMode;
	}
	
	public TestListener1 getTestListener1() {
		return testListener1;
	}
	
	public TestListener2 getTestListener2() {
		return testListener2;
	}

}
