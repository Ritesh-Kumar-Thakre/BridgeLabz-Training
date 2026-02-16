package com.jdbc.bank;

import java.math.BigDecimal;

public class Account {

    private int accountId;
    private String accountName;
    private BigDecimal balance;

    public Account(int accountId, String accountName, BigDecimal balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountId() { return accountId; }
    public String getAccountName() { return accountName; }
    public BigDecimal getBalance() { return balance; }
}
