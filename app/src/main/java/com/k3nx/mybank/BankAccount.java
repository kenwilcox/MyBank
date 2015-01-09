package com.k3nx.mybank;

import android.util.Log;

/**
 * Created by Ken Wilcox on 1/9/2015 2:55 PM.
 *
 */
public class BankAccount {

    private static final String TAG = "BankAccount";

    private double mBalance;
    public final static double OVERDRAFT_FEE = 30;

    public void withdraw(double amount) {
        mBalance -= amount;
        Log.d(TAG, "Withdraw: " + amount);
    }

    public void deposit(double amount) {
        mBalance += amount;
        Log.d(TAG, "Deposit: " + amount);
    }

    public double getBalance() {
        return mBalance;
    }
}
