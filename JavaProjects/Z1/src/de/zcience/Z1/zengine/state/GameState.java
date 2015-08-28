package de.zcience.Z1.zengine.state;

import java.util.ArrayList;

import com.badlogic.ashley.core.EntitySystem;

public interface GameState {	
	public void enter();
	public void render(float deltaTime);
	public void leave();
}
