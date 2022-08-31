package com.revature.project0.common.screens;

import com.revature.project0.common.util.AppContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BillsScreen extends AbstractScreen {

    public BillsScreen(BufferedReader consoleReader) {
        super("WelcomeScreen", consoleReader);
    }

    @Override
    public void render() throws IOException {

        System.out.println("+--------------------------------------------------------+");

    }

}
