package com.revature.project0.common.screens;

import java.io.BufferedReader;
import java.io.IOException;


public class PaycheckScreen extends AbstractScreen {
    public PaycheckScreen(BufferedReader consoleReader) {
        super("PaycheckScreen", consoleReader);
    }
    @Override
    public void render() throws IOException {
        System.out.println("Paycheck screen works!");
    }
}
