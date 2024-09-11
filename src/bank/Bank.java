package bank;

import java.util.ArrayList;

public class Bank {
    static ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String pin) {
        Account newAccount = new Account(accounts.size()+1, firstName, lastName, pin);
        accounts.add(newAccount);
        return newAccount;
    }
    public int countAccount() {
        return accounts.size();
    }

    public void deposit(int accountNumber, int amount) {
        validateAccount(accountNumber);
        accounts.get(accountNumber-1).deposit(amount);
    }

    public int getBalance(int accountNumber, String pin) {
        validateAccount(accountNumber);
        return accounts.get(accountNumber - 1).getBalance(pin);
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        accounts.get(accountNumber-1).withdraw(amount, pin);
    }

    public void transfer(int senderAccountNumber, int receiverAccountNumber, int amount, String pin) {
        accounts.get(senderAccountNumber-1).withdraw(amount, pin);
        accounts.get(receiverAccountNumber-1).deposit(amount);
    }

    public void checkBalance(int accountNumber, String pin) {
        Account account = accounts.get(accountNumber-1);
    }

    public void validateAccount(int accountNumber) {
        if (accountNumber < 1 || accountNumber > accounts.size()) {
            System.out.println("Invalid account number");
        }
    }
}
