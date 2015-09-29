package de.zcience.Z1.game;

import java.util.ArrayList;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.ApplicationListener;

public class Game implements ApplicationListener{

	private PooledEngine engine;
	private ArrayList<Screen> screens;
	
	@Override
	public void create() {
		engine = new PooledEngine();
		
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
