package oop01.encapsule;

import java.util.Random;

/*
	Date:2015.05.15
	Auther : ������
	
*/
public class GameRpsService {

	/*
	 	����� �� �Է°��� ��Ʈ�ѷ����� ������ üũ��
	 	���ڰ��� ���� ���� ���� �� ���� ����
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
