package Reflection;

import java.util.Scanner;

import static GeoPoliticalZone.GeoZone.goToMainMenu;

public class Zones {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        goToMainMenu();
    }
    public static void goToMainMenu() {
        String menu = """
                1-> Enter the name of the state:-
                2->Exit the program.
                """;
        print(menu);
        char choice = input("Menu").charAt(0);

        switch (choice) {
            case '1':
                stateZone();
            case '2':
                exit();
        }
    }

    public static void stateZone() {
        GeoPoliticalZones Zones;
        print("Enter the states: ");
        String states = input.nextLine();
    }
    public static void exit() {
        System.exit(0);
    }

    private static void print(String prompt) {
        System.out.print(prompt);
    }

    private static CharSequence input(String input) {
        System.out.print(input);
        return new Scanner(System.in).nextLine();
    }
}
