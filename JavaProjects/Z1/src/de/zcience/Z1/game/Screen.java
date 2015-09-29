package de.zcience.Z1.game;

public interface Screen {
	public void create();
	
	
	public void resize(int width, int height);
	public void update(float deltaTime);
	public void pause();
	public void resume();
	public void dispose();
	
}
