package com.k3nx.mybank;

/**
 * Created by Ken Wilcox on 1/9/2015 2:55 PM.
 *
 */
public class BankAccount {

    private double mBalance;
    public final static double OVERDRAFT_FEE = 30;

    public void withdraw(double amount) {
        mBalance -= amount;
    }

    public void deposit(double amount) {
        mBalance += amount;
    }

    public double getBalance() {
        return mBalance;
    }
}
