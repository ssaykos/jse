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
//	데이터 베이스에는 가위바위보에 대한 값이 아닌 
//	접속한 유저의 게임 카운트와 게임 승수 패수 승률 등이 입력되야 맞는것 같다.
	private static int GameCount=0,victoryCount=0,loseCount=0,drawCount=0;
//이곳값을 스태틱으로 하지 않으면 카운트 들이 모두 초기화 되서..어쩔수 없이 스태틱으로 둿다...= ㅅ =;;망한소스다..ㅠ_ ㅠ흐거덩 ㅠㅠ;;
	
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
