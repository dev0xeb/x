package bank;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber;
    private String firstName;
    private String lastName;
    

    public Account(int accountNumber, String firstName, String lastName, String pin) {
        this.pin = pin;
        this.accountNumber = accountNumber;
    }
    public String getPin() {
        return pin;
    }
    public int getBalance(String pin) {
        if (pin.equals(this.pin)) {
            return balance;
        } else {
            return 0;
        }
    }


    public void deposit(int amount) {
        if (amount > 0)  balance +=amount;
    }

    public void withdraw(int amount, String pin) {
       if(amount > 0 && amount <= balance && pin.equals(this.pin))
        balance -=amount;
    }

    private boolean isCorrectPin(String pin) {
        return pin.equals(this.pin);
    }

    public void updatePin(String oldPin, String newPin) {
        if(isCorrectPin(oldPin)) {
            this.pin = newPin;
        }
    }
}
