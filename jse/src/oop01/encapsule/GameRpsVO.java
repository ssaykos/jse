package oop01.encapsule;


public class GameRpsVO {
	/*
	 	����(1)����(2)��(3)�̶�� ���� ������ �����صΰ�.
	 	��Ʈ�� �������� ���õ� ��Ʈ������ ���ؼ� ���� ���� �� ���� �Էµǰ� ��µǵ���.
		�Ѵ�.
	 */
	private int rock,paper,scissors;
	
	public int getRock() {
		return rock;
	}
	
	public void setRock( int rock) {
		this.rock = 2;
	}
	
	public int getPaper() {
		return paper;
	}
	
	public void setPaper( int paper) {
		this.paper = 3;
	}
	
	public int getScissors() {
		return scissors;
	}
	
	public void setScissors( int scissors) {
		this.scissors = 1;
	}
	
}
