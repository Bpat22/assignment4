package com.meritamerica.assignment4;

import java.util.Date;

public abstract class Transaction {

	BankAccount sourceAccount;
	BankAccount targetAccount;
	double amount;
	Date TransactionDate;
	String reason;
	boolean isProcessed;


	public BankAccount getSourceAccount() {
		return sourceAccount;
	}
	public void setSourceAccount(BankAccount sourceAccount) {
		this.sourceAccount = sourceAccount;
	}
	public BankAccount getTargetAccount() {
		return targetAccount;
	}
	public void setTargetAccount(BankAccount targetAccount) {
		this.targetAccount = targetAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(Date date) {
		TransactionDate = date;
	}

	public String writeToString() {
		return null;
	}

	public static Transaction readFromString(String transactionDataString) {

		//String[] values = transactionDataString.split(",");
		return null;
	}

	public abstract void processTransaction() throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException;	


	public boolean isProcessedByFraudTeam() {
		return isProcessed;
	}

	public void setProcessedByFraudTeam(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public String getRejectionReason() {
		return null;
	}

	public void setRejectionReason(String reason) {

	}


}
