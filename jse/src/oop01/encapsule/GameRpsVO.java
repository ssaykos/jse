package oop01.encapsule;


public class GameRpsVO {
	/*
	 	����(1)����(2)��(3)�̶�� ���� ������ �����صΰ�.
	 	��Ʈ�� �������� ���õ� ��Ʈ������ ���ؼ� ���� ���� �� ���� �Էµǰ� ��µǵ���.
		�Ѵ�.
	 */
//	private int rock,paper,scissors;
//	
//	public int getRock() {
//		return rock;
//	}
//	
//	public void setRock( int rock) {
//		this.rock = 2;
//	}
//	
//	public int getPaper() {
//		return paper;
//	}
//	
//	public void setPaper( int paper) {
//		this.paper = 3;
//	}
//	
//	public int getScissors() {
//		return scissors;
//	}
//	
//	public void setScissors( int scissors) {
//		this.scissors = 1;
//	}
//	������ ���̽����� ������������ ���� ���� �ƴ� 
//	������ ������ ���� ī��Ʈ�� ���� �¼� �м� �·� ���� �ԷµǾ� �´°� ����.
	private static int GameCount=0,victoryCount=0,loseCount=0,drawCount=0;
//�̰����� ����ƽ���� ���� ������ ī��Ʈ ���� ��� �ʱ�ȭ �Ǽ�..��¿�� ���� ����ƽ���� �x��...= �� =;;���Ѽҽ���..��_ ����ŵ� �Ф�;;
	
	public int getGameCount() {
		return GameCount;
	}
	
	public void setGameCount(int gameCount) {
		this.GameCount = gameCount;
	}
	
	public int getVictoryCount() {
		return victoryCount;
	}
	
	public void setVictoryCount(int victoryCount) {
		this.victoryCount = victoryCount;
	}
	
	public int getLoseCount() {
		return loseCount;
	}
	
	public void setLoseCount(int loseCount) {
		this.loseCount = loseCount;
	}
	
	public int getDrawCount() {
		return drawCount;
	}
	
	public void setDrawCount(int drawCount) {
		this.drawCount = drawCount;
	}
	
}
