package com.k3nx.mybank;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Ken Wilcox on 1/9/2015 2:55 PM.
 * Simple class for a Bank Account
 */
public abstract class BankAccount {

    private static final String TAG = "BankAccount";
    private ArrayList<Double> mTransactions;
    public final static double OVERDRAFT_FEE = 30;

    BankAccount() {
        mTransactions = new ArrayList<>();
    }

    public void withdraw(double amount) {
        mTransactions.add(-amount);
        Log.d(TAG, "Withdraw: " + amount);

        if (getBalance() < 0) {
            Log.d(TAG, "Overdraft Charge");
            mTransactions.add(-OVERDRAFT_FEE);
        }
    }

    private int numberOfWithdrawals() {
        int count = 0;
        for (int i = 0; i < mTransactions.size(); i++) {
            if (mTransactions.get(i) < 0) {
                count++;
            }
        }
        return count;
    }

    public void deposit(double amount) {
        mTransactions.add(amount);
        Log.d(TAG, "Deposit: " + amount);
    }

    public double getBalance() {
        double total = 0;
        for(int i = 0; i < mTransactions.size(); i++) {
            total += mTransactions.get(i);
        }
        return total;
    }
}
