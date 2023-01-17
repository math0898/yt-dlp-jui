package io.github.math0898;

import suga.engine.GameEngine;
import suga.engine.game.BasicGame;
import suga.engine.game.Game;
import suga.engine.graphics.Graphics2d;
import suga.engine.graphics.GraphicsPanel;
import suga.engine.input.keyboard.StackGameKeyListener;
import suga.engine.input.mouse.BasicMouseListener;
import suga.engine.logger.Level;

import java.awt.*;

public class Main {

    /**
     * Reference to the GameEngine.
     */
    private static GameEngine engine = GameEngine.getInstance();

    /**
     * Main execution point of the whole program.
     *
     * @param args Arguments which were passed at runtime.
     */
    public static void main (String[] args) {
        engine.getLogger().setLevel(Level.DEBUG);
        Game game = new MainGame();
        GraphicsPanel panel = new Graphics2d();
        engine.launchGameWindow(GameEngine.Window.WINDOWED,
                "yt-dlp-jui", panel, Color.BLACK,
                30, 30,
                new StackGameKeyListener(), new BasicMouseListener(),
                game);
        game.loadStartScene();
    }
}
