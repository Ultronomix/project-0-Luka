package com.revature.project0.common.util;

import com.revature.project0.common.screens.Screen;
import com.revature.project0.common.screens.WelcomeScreen;
import com.revature.project0.common.screens.Screen;
import com.revature.project0.common.screens.WelcomeScreen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppContext {

    private static boolean appRunning;
    private BufferedReader consoleReader;

    public AppContext() {
        appRunning = true;
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void startApp() {
        while (appRunning) {
            try {
                Screen currentScreen = new WelcomeScreen(consoleReader);
                currentScreen.render();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void shutdown() {
        appRunning = false;
    }


}
