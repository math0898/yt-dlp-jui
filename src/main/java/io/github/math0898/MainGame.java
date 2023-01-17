package io.github.math0898;

import io.github.math0898.scenes.TargetMenu;
import suga.engine.game.BasicGame;

/**
 * The MainGame is the game that hosts the yt-dlp-jui program.
 *
 * @author Sugaku
 */
public class MainGame extends BasicGame {

    /**
     * Creates a new game.
     */
    public MainGame () {
        scenes.put("Main", new TargetMenu());
    }

    /**
     * Attempts to load the starting scene for this game. If successful will return true, if un-found or loading fails,
     * will return false.
     *
     * @return True on a successful first scene load.
     */
    @Override
    public boolean loadStartScene () {
        return loadScene("Main");
    }
}
