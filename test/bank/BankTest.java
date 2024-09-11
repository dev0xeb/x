package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {
    Bank bank;

    @BeforeEach
    public void startAllTestWithThis() {
        bank = new Bank();
    }

    @Test
    public void create_AccountNumber_OfAccountsIsOne_Test() {
        bank.createAccount("Ayoade", "Clinton", "correctPin");
        assertEquals(1, bank.countAccount());
    }
}
