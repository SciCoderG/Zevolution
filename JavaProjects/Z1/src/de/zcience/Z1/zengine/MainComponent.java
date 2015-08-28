package de.zcience.Z1.zengine;

import java.util.HashMap;

import com.badlogic.ashley.core.PooledEngine;

import de.zcience.Z1.zengine.state.IState;

/**
 * Singleton class - MainComponent of ZEngine. Manages Gamestates. 
 * 
 * @author David_000
 *
 */
public class MainComponent {
	
	private MainComponent(){
	}
	
	
	private static HashMap<String, IState> gamestates = new HashMap<String, IState>();
	
	
}
