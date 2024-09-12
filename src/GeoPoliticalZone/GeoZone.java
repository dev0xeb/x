package GeoPoliticalZone;

import java.util.Scanner;

import static bank.BankApp.goToMainMenu;

public class GeoZone {
    static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
       goToMainMenu();
   }
   public static void goToMainMenu() {
       String menu = """
                1 -> Explore Nigeria's GeoPolitical Zone
                2 -> Exit
                """;
       print(menu);
       char choice = input("Menu").charAt(0);


       switch (choice) {
           case '1':
               explore();
            case '2':
                exit();
       }

   }

   public static void explore() {
       GeoPoliticalZones zones;
       print("Enter the GeoPolitical Zone you wish to explore: ");
       String userInput = input.nextLine().toUpperCase().replaceAll("[-_,@ ']", "_");
       zones = GeoPoliticalZones.valueOf(userInput);
       System.out.println("the " + userInput + " GeoPoliticalZone choosen to be explored has the following states");
       System.out.println(zones.getStates());
       goToMainMenu();

   }
   public static void exit() {
   }

    private static CharSequence input(String input) {
        Scanner in = new Scanner(input);
        return new Scanner(System.in).nextLine();
    }
    private static void print(String prompt) {
        System.out.print(prompt);
    }
}

