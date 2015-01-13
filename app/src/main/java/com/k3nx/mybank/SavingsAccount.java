package com.k3nx.mybank;

import android.util.Log;

/**
 * Created by Ken Wilcox on 1/13/2015 3:42 PM.
 * Savings Account Class
 */
public class SavingsAccount extends BankAccount {
    private static final String TAG = "SavingsAccount";

    @Override
    public void withdraw(double amount) {
        Log.d(TAG, "Withdrawing from savings.");
        if (super.numberOfWithdrawals() >= 3) {
            return;
        }
        super.withdraw(amount);
    }
}
