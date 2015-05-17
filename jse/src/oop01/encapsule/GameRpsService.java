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
		GameRpsValueController vc = new GameRpsValueController();
		Random random = new Random();
		int comValue = random.nextInt(3)+1;
		
		int result = playerValue - comValue+3;
		
		// ����(1) ����(2) ��(3) �ؼ� ����� �̱�� ���� ���� 3���� ����̴�.
		// ���� 1 �̰� ��ǻ�Ͱ� 1 2 3 �ϰ��
		//       2 			1 2 3 
		//       3			1 2 3 �ϰ�� �� 9������ ����̰�..
		// ����� �̱�� ���� ���� 3���� �� ���.. �̸� ����..
		// 9������ ����� ���� ���� ����� ���缭 3���� ���� ���δٸ�..
		// if���ϰ�� ���� ���� ������ ������� ��.. (���)
		// ���� �� ���� ���� ������ 3���� �����������ϰ� +1 �Ѱ��� �������..(�����̱�)
		// ���� �� ���� 3���� ������ ������ �ϰ� +1 �Ѱ�찡 ���� ������ �������..(������)
		// �̷��� ���� �ϴ����� �����̴�..(�Ʒ��� �ҽ��� ���� ���������� ������� �ҽ�
		//�����ּ�->(https://github.com/ssaykos/MyStudySource/blob/master/MySource/src/c%EB%A1%9C%EB%A7%8C%EB%93%A4%EC%96%B4%EB%B4%A3%EB%8D%98%EC%98%88%EC%A0%9C%EB%93%A4/%EA%B0%80%EC%9C%84%EB%B0%94%EC%9C%84%EB%B3%B4.java))
		/*
		int UserSel = 0;
		int ComSel=0;
		int UserScore=0;
		int ComScore=0;
		
		Random rand= new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("���������� ������ �����մϴ�.");
			while(true){
				System.out.print("������ ->����(1) / ����(2) / ��(3) / ����(0): ");
				UserSel=scan.nextInt();
				ComSel= rand.nextInt(3);
				if(UserSel==0){
					System.out.println("����Ǿ����ϴ�.");
					return;
				}else if(UserSel==ComSel){
					System.out.println("�����ϴ�.");
				}else if(UserSel==(ComSel%3)+1){
					ComScore++;
					System.out.println("�����ϴ�.	\t ���� ���ھ� User->"+UserScore+" ��\t VS \t Com->"+ComScore+"��");
				}else if((UserSel%3)+1==ComSel){
					UserScore++;
					System.out.println("�̰���ϴ�. \t ���� ���ھ� User->"+UserScore+" ��\t VS \t Com->"+ComScore+"��");
				}
			}
		}
		 */
		//������..���� ���� �������� ��߸� �Ѵ�..
		// �������� ��û�� ���̽� ���� ���ڴ� ���̾���..
		// �׷��� ���� �ϱ⸦ ���� �� ���� ���� ������ ���� 3�� ������ ���ڴ� ���̾���.
		// �׷� 5������ ����� ���� ���´�.
		// 1 ->���� �̱���.(���� �����϶� ���� ���ڱ⸦ �����)
		// 2-> ���� �����.(���� ���ڱ� �϶� ���� ���ڱ⸦ �� ���)
		// 3-> �����.
		// 4-> ���� �̱���.(���� �����϶� ���� ������ ���� ���� ���ڱ� �϶� ���� ������ �����)
		// 5-> ���� �����.(���� �����϶� ���� ������ ���� ���� �����϶� ���� ���ڱ� �� ���)
		switch (result) {
		case 1:
		case 4:
			vo.setGameCount(vo.getGameCount()+1);
			vo.setVictoryCount(vo.getVictoryCount()+1);
			System.out.println("����->"+vc.rpsChangeNumber(playerValue)+"vs"+vc.rpsChangeNumber(comValue)+"<-��ǻ��");
			System.out.println("����� �̰���ϴ�.");
			break;
		case 2:
		case 5:
			vo.setGameCount(vo.getGameCount()+1);
			vo.setLoseCount(vo.getLoseCount()+1);
			System.out.println("����->"+vc.rpsChangeNumber(playerValue)+"vs"+vc.rpsChangeNumber(comValue)+"<-��ǻ��");
			System.out.println("����� �����ϴ�.");
			break;
		case 3:
			vo.setGameCount(vo.getGameCount()+1);
			vo.setDrawCount(vo.getDrawCount()+1);
			System.out.println("���̽��ϴ�.");
			System.out.println("����->"+vc.rpsChangeNumber(playerValue)+"vs"+vc.rpsChangeNumber(comValue)+"<-��ǻ��");
			break;
		}
	}

	public void viewWinningRate() {
		GameRpsVO vo = new GameRpsVO();
		System.out.println("�� ���� ���� Ƚ��->"+vo.getGameCount());
		System.out.println("���� �� �̱� Ƚ��-> "+vo.getVictoryCount());
		System.out.println("���� �� �� Ƚ��-> "+vo.getLoseCount());
		System.out.println("���� �� ��� Ƚ��->"+vo.getDrawCount());
	}

	public boolean qustionContinue(int qustionContinue) {
		if(qustionContinue==1){
			return true;
		}else{
			return false;
		}
	}

	public boolean playerQustionContinueCheck(int qustionContinue) {
		boolean qustionContinueCheck= true;
		GameRpsCheck playerCheck = new GameRpsCheck();
		qustionContinueCheck=playerCheck.qustionCheck(qustionContinue);
		return qustionContinueCheck;
	}

}
