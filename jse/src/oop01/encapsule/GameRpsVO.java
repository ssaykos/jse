package oop01.encapsule;


public class GameRpsVO {
	/*
	 	가위(1)바위(2)보(3)이라는 값을 가지고 고정해두고.
	 	스트링 변수에는 선택된 인트변수에 대해서 가위 바위 보 값이 입력되고 출력되도록.
		한다.
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
