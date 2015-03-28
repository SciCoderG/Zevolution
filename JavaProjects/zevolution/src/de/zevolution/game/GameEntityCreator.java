package de.zevolution.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.FixtureDef;

import de.zevolution.EntityCreator;
import de.zevolution.input.InputComponent;
import de.zevolution.movement.MovementComponent;
import de.zevolution.physics.components.PhysicsBodyComponent;
import de.zevolution.physics.utils.PhysicsBodyDef;
import de.zevolution.physics.utils.PhysicsFixtureDef;

public class GameEntityCreator extends EntityCreator {

	public static List<Entity> loadLevel() {
		List<Entity> toReturn = new ArrayList<Entity>();
		Entity player = createPlayer(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight() - 100.0f);
		toReturn.add(player);

		return toReturn;
	}

	public static Entity createPlayer(float x, float y) {
		Entity entity = engine.createEntity();
		
		// Creating the PhysicsBodyComponent
		float width = 100.0f;
		float height = 100.0f;

		PhysicsBodyComponent physicsBody = engine
				.createComponent(PhysicsBodyComponent.class);
		PhysicsBodyDef bodyDef = new PhysicsBodyDef(BodyType.DynamicBody,
				physicsSystem).fixedRotation(true).position(x, y);
		physicsBody.init(bodyDef, physicsSystem, entity);
		
		PhysicsFixtureDef fixtureDef = new PhysicsFixtureDef(physicsSystem).shapeBox(width, height);
		
		physicsBody.createFixture(fixtureDef);
		
		entity.add(physicsBody);
		
		//Creating the InputComponent
		InputComponent input = engine.createComponent(InputComponent.class);
		entity.add(input);
		
		// Creating the MovementComponent
		MovementComponent movement = engine.createComponent(MovementComponent.class);
		movement.speed = 2.0f;
		entity.add(movement);
		
		engine.addEntity(entity);
		return entity;
	}
}
