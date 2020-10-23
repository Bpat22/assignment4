package com.meritamerica.assignment4;

public class TransferTransaction extends Transaction{
	public double amount;

	TransferTransaction(BankAccount sourceAccount, BankAccount targetAccount, double amount){
		//this.targetAccount = targetAccount;
		setTargetAccount(targetAccount);
		setSourceAccount(sourceAccount);
		//this.amount = amount;
		setAmount(amount);
	}
/*
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
*/

	public void process() throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
		if (getAmount() < 0) {
			setRejectionReason("You enter a negative amount " + getAmount());
			throw new NegativeAmountException("You enter a negative amount " + getAmount());
			
		} else if (getAmount() < targetAccount.getBalance()) {
			setRejectionReason("Not enough money in target amount"  + getAmount());
			throw new ExceedsAvailableBalanceException("Not enough money in target amount " + getAmount());
			
		} else if(getAmount() > 1000) {
			setRejectionReason("Amount is $1000 or more " + getAmount());
			setProcessedByFraudTeam(true);
			throw  new ExceedsFraudSuspicionLimitException("Amount is $1000 or more " + getAmount());
			
		} else {
			
		}
	}
}


