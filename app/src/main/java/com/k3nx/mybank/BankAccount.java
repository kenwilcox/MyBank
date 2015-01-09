package com.k3nx.mybank;

/**
 * Created by Ken Wilcox on 1/9/2015 2:55 PM.
 *
 */
public class BankAccount {

    private double balance;

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
