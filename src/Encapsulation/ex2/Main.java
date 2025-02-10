package Encapsulation.ex2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000);

        // Display initial account details
        account.displayAccountDetails();

        // Deposit money
        account.Deposit(500);

        // Withdraw money
        account.withdraw(200);

        // Display updated account details
        account.displayAccountDetails();
    }
}
