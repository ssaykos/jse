package oop01.encapsule;

import java.util.Random;

/*
	Date:2015.05.15
	Auther : 김진선
	
*/
public class GameRpsService {

	/*
	 	사용자 의 입력값을 컨트롤러에서 가져와 체크후
	 	숫자값에 따른 가위 바위 보 결정 로직
	 */
	public boolean playerValueCheck(int playerValue) {
		boolean playerValueCheck= true;
		GameRpsCheck playerCheck = new GameRpsCheck();
		playerValueCheck=playerCheck.check(playerValue);
		
		return playerValueCheck;
	}

	public void gameProcess(int playerValue) {
		GameRpsVO vo = new GameRpsVO();
		Random random = new Random();
		int comValue = random.nextInt(3);
		
		
	}

}
