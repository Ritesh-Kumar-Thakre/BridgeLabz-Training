package com.jdbc.bank;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Transaction {

	private int txnId;
	private int fromAccount;
	private int toAccount;
	private BigDecimal amount;
	private String txnType;
	private Timestamp txnDate;

	public Transaction(int txnId, int fromAccount, int toAccount, BigDecimal amount, String txnType,
			Timestamp txnDate) {
		this.txnId = txnId;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.txnType = txnType;
		this.txnDate = txnDate;
	}
}
