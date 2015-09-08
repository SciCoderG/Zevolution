package de.zcience.Z1.zengine;

import java.util.Stack;

import de.zcience.Z1.zengine.scene.Scene;

/**
 * This class ist the main class of the Zengine. From here everything else is started.
 * 
 * @author David_000
 *
 */
public class Zengine {

	// Use a stack of Scenes for stuff like menus and the game. Makes it easier to design
	// a pause menu that still allows to let the game run in the background
	
	private Stack<Scene> scenes = new Stack<>();
	
}
