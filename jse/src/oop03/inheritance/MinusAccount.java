package oop03.inheritance;


public class MinusAccount extends BankAccount{
	private int minusLimit;
	
	public void setAccount(String accountNum,String accountPass, String ownerName,int pay,int minusLimit) {
		this.accountNum= accountNum;
		this.accountPass=accountPass;
		this.balance = pay;
		this.ownerName = ownerName;
		this.minusLimit= minusLimit;
		System.out.println(this.accountNum+"�� �����Ǿ����ϴ�.");
	}
	public void defrayment(int pay) {
		//�ܾ�+���̳ʽ��ѵ��ױ��� ����� ��������
		if (this.balance+this.minusLimit>=pay) {
			this.balance = this.balance-pay;
			System.out.println(pay+"���� ����߽��ϴ�.");
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	public void printAccount() {
		System.out.println("���̳ʽ������� ���¹�ȣ:"+this.accountNum);
		System.out.println("������:"+this.ownerName);
		System.out.println("�ܾ�:"+this.balance);
	}
}
