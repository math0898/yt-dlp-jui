package io.github.math0898;

import suga.engine.GameEngine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The PythonFacade is used to manage, run, and interact with python.
 *
 * @author Sugaku
 */
public class PythonFacade {

    /**
     * The path to the Python interpreter on the system.
     */
    private static final String PYTHON_PATH = "/bin/yt-dlp";

    /**
     * todo
     */
    public static void runPython () throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder(PYTHON_PATH, "--version");
        builder.redirectErrorStream(true);
        Process exec = builder.start();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getInputStream()))) {
            String line = reader.readLine();
            while (line != null) {
                GameEngine.getInstance().getLogger().log(line);
                line = reader.readLine();
            }
            exec.waitFor();
        }
    }
}
