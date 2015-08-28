package de.zcience.Z1.game;

import org.lwjgl.opengl.GL11;

import box2dLight.ConeLight;
import box2dLight.RayHandler;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;

import de.zcience.Z1.game.contactlistener.MyContactListener;
import de.zcience.Z1.game.system.DeathSystem;
import de.zcience.Z1.game.system.JumpSystem;
import de.zcience.Z1.game.system.ShootingSystem;
import de.zcience.Z1.tiled.MapLoader;
import de.zcience.Z1.tiled.TiledMapRenderingSystem;
import de.zcience.Z1.zengine.assetloading.AssetLoader;
import de.zcience.Z1.zengine.audio.MusicManager;
import de.zcience.Z1.zengine.audio.SoundManager;
import de.zcience.Z1.zengine.camera.CameraSystem;
import de.zcience.Z1.zengine.input.InputManager;
import de.zcience.Z1.zengine.physics.MovementSystem;
import de.zcience.Z1.zengine.physics.PhysicsSystem;
import de.zcience.Z1.zengine.physics.UpdatePositionSystem;
import de.zcience.Z1.zengine.rendering.LightSystem;
import de.zcience.Z1.zengine.rendering.TextureRenderer;
import de.zcience.Z1.zengine.util.DrawUtil;
import de.zcience.Z1.zengine.util.GameConstants;
import de.zcience.Z1.zengine.util.profiling.ProfilerGlobal;

public class Game implements ApplicationListener {
	
	@Override
	public void create() {
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		
	}
}
