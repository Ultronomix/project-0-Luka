package com.revature.project0.common.screens;

import java.io.BufferedReader;
import java.io.IOException;

public class WelcomeScreen extends AbstractScreen {

    public WelcomeScreen(BufferedReader consoleReader) {
        super("WelcomeScreen", consoleReader);
    }

    @Override
    public void render() throws IOException {

        System.out.println("+--------------------------------------------------------+");

        String welcomeMenu = "Welcome to BudgetMe!\n" +
                "Please make a selection from the options below:\n" +
                "1) Paycheck\n" +
                "2) Bills\n" +
                "3) Daily Allowance\n" +
                "> ";

        System.out.print(welcomeMenu);

        String userSelection = consoleReader.readLine();

        switch (userSelection) {
            case "1":
                new PaycheckScreen(consoleReader).render();
                break;
            case "2":
                new BillsScreen(consoleReader).render();
                break;
            case "3":
//                new DailyAllowanceScreen(consoleReader).render();
                System.out.println("Case 3");
                break;
            default:
        }
    }

}
