package bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;
    private final String correctPin = "pin";

    @BeforeEach
    public void startAllTestWithThis() {
        account = new Account(1, "", "", correctPin);
        Account account2 = new Account(2, "Ayoade", "Clinton", correctPin);
    }

    @Test
    public void newAccount_isZeroTest(){
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_deposit2k(){
        assertEquals(0, account.getBalance(correctPin));
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
    }

    @Test
    public void newAccount_balance2kDepositMinus5kBalance2k(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance( correctPin));
        account.deposit(-5_000);
        assertEquals(2_000, account.getBalance(correctPin));
    }

    @Test
    public void balanceIsZero_Deposit2k_BalanceIs2k(){
        assertEquals(0, account.getBalance(correctPin));
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
    }

    @Test
    public void balanceIs2k_Withdraw5k_BalanceIs2k(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
        account.withdraw(-5_000, correctPin);
        assertEquals(2_000, account.getBalance(correctPin));
    }

    @Test
    public void balanceIs2k_Withdraw1k_BalanceIs1k(){
        assertEquals(0, account.getBalance(correctPin));
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
        account.withdraw(1_000, correctPin);
        assertEquals(1_000, account.getBalance(correctPin));
    }

    @Test
    public void AmountDepositedCanAddToBalance(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
        account.deposit(5_000);
        assertEquals(7_000, account.getBalance(correctPin));
    }

    @Test
    public void Balance2k_Deposit2k_Withdraw4k_BalanceIs0(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
        account.deposit(2_000);
        assertEquals(4_000, account.getBalance(correctPin));
        account.withdraw(4_000, correctPin);
        assertEquals(0, account.getBalance(correctPin));
    }

    @Test
    public void WithdrawMoreThanTheBalance(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
        account.withdraw(2_500, correctPin);
        assertEquals(2_000, account.getBalance(correctPin));
    }

    @Test
    public void TestForNegativeDeposit(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(correctPin));
        account.withdraw(-5_000, correctPin);
        assertEquals(2_000, account.getBalance(correctPin));
    }
}

