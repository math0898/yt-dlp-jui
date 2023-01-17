package io.github.math0898.scenes;

import io.github.math0898.PythonFacade;
import suga.engine.GameEngine;
import suga.engine.game.BasicScene;
import suga.engine.input.keyboard.KeyValue;

import java.awt.*;
import java.io.IOException;

/**
 * The main menu where download targets can be assigned.
 */
public class TargetMenu extends BasicScene {

    /**
     * Passes a keyboard input into the scene.
     *
     * @param key     The value of the key pressed.
     * @param pressed True if the key was pressed, false if it was released.
     */
    @Override
    public void keyboardInput (KeyValue key, boolean pressed) {

    }

    /**
     * Passes a mouse input into the scene.
     *
     * @param pos     The position of the mouse when it was clicked.
     * @param pressed True if the button was pressed, false if it was released.
     */
    @Override
    public void mouseInput (Point pos, boolean pressed) {
        GameEngine.getInstance().getLogger().log("TargetMenu: Mouse Clicked!");
        try {
            PythonFacade.runPython();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
