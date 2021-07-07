package mthree.training.practice;

public interface BankingSystem {
	void deposit(); 
	// Basically it helps in deposit the money 
	void withdraw(); 
	// Withdraws the money
	void ministatment();
	// It gives the statement of last 5 transactions
	void checkBalance();
	// It gives the current balance of the account
	void getAccountType();
	// It gives the information about the account type (Current/Savings)
	void TransferCash();
	// Basically transfers the cash from one account to another account
	void changePin(); 
	// changes the current pin of the ATM card registered with the ac number
	void BlockCard();
	// Blocks the ATM card registered with that particular account number
	void printRecipt();
	// Print the last withdrawn receipt of the transaction
	void AccountInfo();
	// Gives  the whole information of the Account holder

}
class Main{
	public static void main(String args[])
	{
		
	}
}
