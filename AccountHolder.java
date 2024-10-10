// Lab 5

import java.text.DecimalFormat;
import java.util.Scanner;

class AccountHolder
{
    public static double annualInterestRate;
    public double balance;
    public static final double MINIMUM_BALANCE = 50.00;

    public AccountHolder(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied. Your balance cannot go below $" + MINIMUM_BALANCE);
        }
    }

    public void applyInterest() {
        double monthlyInterest = (balance * annualInterestRate) / 12;
        balance += monthlyInterest;
    }
}
