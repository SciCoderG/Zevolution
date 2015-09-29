package de.zcience.Z1.game;

import java.util.Map;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;

public class Game implements ApplicationListener{

	// Ashley engine
	public PooledEngine engine;
	
	// Screens and their names
	public Map<String, Screen> screens;
	
	// manages the InputProcessors
	private InputMultiplexer multiplexer;
	
	@Override
	public void create() {
		// create ashley engine
		engine = new PooledEngine();
		
		// create multiplexer
		multiplexer = new InputMultiplexer();
		Gdx.input.setInputProcessor(multiplexer);
		
		//create main menu
		Menu menu = new Menu();
		screens.put("Menu", menu);
		multiplexer.addProcessor(menu);
		fillMenu();
		
	}

	private void fillMenu() {
		// TODO actually add methods to the menu class to add buttons. 
		// determine, how they should be drawn.
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
