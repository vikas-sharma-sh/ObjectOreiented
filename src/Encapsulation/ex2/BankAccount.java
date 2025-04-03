package Encapsulation.ex2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
       if(initialBalance >= 0.0){
           this.balance = initialBalance;
       }else{
           System.out.println("Invalid initial balance. Setting balance to 0");
           this.balance = 0.0;
       }
    }

    public void Deposit(double amount){
        if(amount>=0.0){
            balance += amount;
            System.out.println("Deposited : ₹ "+ amount);
        }else{
            System.out.println("invalid Deposit amount!!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: ₹" + getBalance());
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
