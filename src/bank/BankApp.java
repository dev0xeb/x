package bank;

import java.util.Scanner;

public class BankApp {
    static Bank bank = new Bank();
    public static void main(String[] args) {
        goToMainMenu();
    }
    public static void goToMainMenu() {
        String menu = """
                1 -> Open Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Check Balance
                5 -> Update Pin
                6 -> Transfer Money
                7 -> Exit
                """;
        print(menu);
        char userInput = input("homeMenu").charAt(0);

        switch (userInput) {
            case '1':
                openAccount();
            case '2':
                deposit();
            case '3':
                withdraw();
            case '4':
                checkBalance();
//            case '5':
//                updatePin();
            case '6':
                transferMoney();
        }
    }
    public static void openAccount() {
        String firstName = (String) input("Enter your First Name: ");
        String lastName = (String) input("Enter your Last Name: ");
        String pin = (String) input("Enter your PIN: ");
        bank.createAccount(firstName, lastName, pin);
        goToMainMenu();
    }

    public static void deposit() {
        int accountNumber = input("Enter your Account Number: ").length();
        int amount = input("Enter your Amount to deposit: ").length();
        bank.deposit(accountNumber, amount);
        goToMainMenu();
    }

    public static void withdraw() {
        int accountNumber = input("Enter your Account Number: ").length();
        int amount = input("Enter your Amount to withdraw: ").length();
        String pin = (String) input("Enter your PIN: ");
        bank.withdraw(accountNumber, amount, pin);
    }

    public static void checkBalance() {
        int accountNumber = input("Enter your Account Number: ").length();
        String pin = (String) input("Enter your PIN: ");
        bank.checkBalance(accountNumber, pin);
    }

//    public static void updatePin() {
//
//    }

    public static void transferMoney() {
        int accountNumber = input("Enter your Account Number: ").length();
        int amount = input("Enter your Amount to transfer: ").length();
        String pin = (String) input("Enter your PIN: ");
        int receiveraccountNumber = input("Enter your Account Number you sidh to send to to: ").length();
        bank.withdraw(accountNumber, amount, pin);
        bank.deposit(receiveraccountNumber, amount);
    }

    private static CharSequence input(String input) {
        Scanner in = new Scanner(input);
        return new Scanner(System.in).nextLine();
    }

    private static void print(String prompt) {
        System.out.print(prompt);
    }
}
