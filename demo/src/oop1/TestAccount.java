package oop1;

public class TestAccount {

	public static void main(String[] args) {
		SavingsAccount ac = new SavingsAccount(1, "James", 10000);
		
		ac.deposit(1000);
		ac.withdraw(2500);
		System.out.println(ac.getBalance());
		
		System.out.println(SavingsAccount.getMinBalance());
		
		ac.withdraw(100000);
		
	}

}
