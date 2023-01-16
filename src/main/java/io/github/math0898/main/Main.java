package io.github.math0898.main;

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
        Game game = new BasicGame();
        GraphicsPanel panel = new Graphics2d();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        engine.launchGameWindow(size.width / 2, size.height / 2,
                "yt-dlp-jui", true, panel, Color.BLACK,
                30, 30,
                new StackGameKeyListener(), new BasicMouseListener(),
                game);
        game.loadStartScene();
    }
}
