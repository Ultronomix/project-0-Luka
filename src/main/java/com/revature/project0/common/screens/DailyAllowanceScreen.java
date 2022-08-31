package com.revature.project0.common.screens;

import java.io.BufferedReader;
import java.io.IOException;


public class DailyAllowanceScreen extends AbstractScreen {
    public DailyAllowanceScreen(BufferedReader consoleReader) {
        super("DailyAllowanceScreen", consoleReader);
    }
    @Override
    public void render() throws IOException {
        System.out.println("DailyAllowance screen works!");
    }
}
