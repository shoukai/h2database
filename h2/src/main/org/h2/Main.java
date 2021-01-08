package org.h2;

import org.h2.tools.Console;
import org.h2.tools.GUIConsole;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Console console = new GUIConsole();
        console.runTool(args);
    }
}
