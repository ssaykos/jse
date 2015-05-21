package oop03.inheritance;


public class BankController {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccount("123456", "1234", "헐크", 1000000);
		bankAccount.printAccount();
		bankAccount.deposit(10000);
		bankAccount.printAccount();
		bankAccount.defrayment(30000);
		bankAccount.printAccount();
		
		MinusAccount minusAccount = new MinusAccount();
		minusAccount.setAccount("2212111", "2345", "아이언맨", 2000000, 10000000);
		minusAccount.printAccount();
		minusAccount.deposit(1000000);
		minusAccount.printAccount();
		minusAccount.defrayment(5000000);
		minusAccount.printAccount();
	}
}
