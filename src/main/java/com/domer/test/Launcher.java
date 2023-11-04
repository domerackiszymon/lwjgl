package com.domer.test;

import com.domer.core.EngineManager;
import com.domer.core.WindowManager;
import com.domer.core.utils.Constants;

public class Launcher {

    private static WindowManager window;
    private static TestGame game;

    public static void main(String[] args) {
        window = new WindowManager(Constants.TITLE, 800, 600, false);
        game = new TestGame();
        EngineManager engine = new EngineManager();

        try {
            engine.start();
        } catch(Exception e){
            e.printStackTrace();
        }

        window.cleanup();
    }

    public static WindowManager getWindow() {
        return window;
    }

    public static TestGame getGame() {
        return game;
    }
}
