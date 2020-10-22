package com.meritamerica.assignment4;

public class TransferTransaction extends Transaction{


	TransferTransaction(BankAccount targetAccount, double amount){
		this.targetAccount = targetAccount;
		this.amount = amount;
	}

	public void processTransaction()

			throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException{

		if (amount < 0) {
			throw new NegativeAmountException("cant procc neg amount");
		}else if (amount > 1000) {
			throw new ExceedsFraudSuspicionLimitException("cant deposite more than 1000");
		}else if (targetAccount.getBalance() > 250000) {
			throw new ExceedsFraudSuspicionLimitException("cant deposit this amt");
		}else{
			targetAccount.withdraw(amount);

		}


	}

}


