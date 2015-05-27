package oop02.encapsule;

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
		GameRpsValueController vc = new GameRpsValueController();
		Random random = new Random();
		int comValue = random.nextInt(3)+1;
		
		int result = playerValue - comValue+3;
		
		// 가위(1) 바위(2) 보(3) 해서 결과는 이기고 지고 비기는 3가지 경우이다.
		// 내가 1 이고 컴퓨터가 1 2 3 일경우
		//       2 			1 2 3 
		//       3			1 2 3 일경우 총 9가지의 경우이고..
		// 결과는 이기고 지고 비기는 3가지 의 경우.. 이를 위해..
		// 9가지의 경우의 수를 또한 결과에 맞춰서 3가지 경우로 줄인다면..
		// if문일경우 나와 컴이 낸수가 같을경우 와.. (비김)
		// 내가 낸 수가 컴이 낸수를 3으로 나머지연산하고 +1 한경우와 같은경우..(내가이김)
		// 내가 낸 수를 3으로 나머지 연산을 하고 +1 한경우가 컴이 낸수와 같은경우..(내가짐)
		// 이렇게 연산 하던것이 과거이다..(아래의 소스는 몰빵 이프문으로 만들었던 소스
		//참조주소->(https://github.com/ssaykos/MyStudySource/blob/master/MySource/src/c%EB%A1%9C%EB%A7%8C%EB%93%A4%EC%96%B4%EB%B4%A3%EB%8D%98%EC%98%88%EC%A0%9C%EB%93%A4/%EA%B0%80%EC%9C%84%EB%B0%94%EC%9C%84%EB%B3%B4.java))
		/*
		int UserSel = 0;
		int ComSel=0;
		int UserScore=0;
		int ComScore=0;
		
		Random rand= new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("가위바위보 게임을 시작합니다.");
			while(true){
				System.out.print("고르세요 ->가위(1) / 바위(2) / 보(3) / 종료(0): ");
				UserSel=scan.nextInt();
				ComSel= rand.nextInt(3);
				if(UserSel==0){
					System.out.println("종료되었습니다.");
					return;
				}else if(UserSel==ComSel){
					System.out.println("비겼습니다.");
				}else if(UserSel==(ComSel%3)+1){
					ComScore++;
					System.out.println("졌습니다.	\t 현재 스코어 User->"+UserScore+" 점\t VS \t Com->"+ComScore+"점");
				}else if((UserSel%3)+1==ComSel){
					UserScore++;
					System.out.println("이겼습니다. \t 현재 스코어 User->"+UserScore+" 점\t VS \t Com->"+ComScore+"점");
				}
			}
		}
		 */
		//하지만..위의 것은 이프문을 써야만 한다..
		// 선생님의 요청은 케이스 문을 쓰자는 것이었다..
		// 그래서 생각 하기를 내가 낸 수를 컴이 낸수를 빼서 3의 보수를 주자는 것이었다.
		// 그럼 5가지의 경우의 수로 나온다.
		// 1 ->내가 이긴경우.(내가 가위일때 컴이 보자기를 낸경우)
		// 2-> 내가 진경우.(내가 보자기 일때 컴이 보자기를 낸 경우)
		// 3-> 비긴경우.
		// 4-> 내가 이긴경우.(내가 바위일때 컴이 가위를 내고 내가 보자기 일때 컴이 바위를 낸경우)
		// 5-> 내가 진경우.(내가 가위일때 컴이 바위를 내고 내가 바위일때 컴이 보자기 낸 경우)
		switch (result) {
		case 1:
		case 4:
			vo.setGameCount(vo.getGameCount()+1);
			vo.setVictoryCount(vo.getVictoryCount()+1);
			System.out.println("유저->"+vc.rpsChangeNumber(playerValue)+"vs"+vc.rpsChangeNumber(comValue)+"<-컴퓨터");
			System.out.println("당신이 이겼습니다.");
			break;
		case 2:
		case 5:
			vo.setGameCount(vo.getGameCount()+1);
			vo.setLoseCount(vo.getLoseCount()+1);
			System.out.println("유저->"+vc.rpsChangeNumber(playerValue)+"vs"+vc.rpsChangeNumber(comValue)+"<-컴퓨터");
			System.out.println("당신이 졌습니다.");
			break;
		case 3:
			vo.setGameCount(vo.getGameCount()+1);
			vo.setDrawCount(vo.getDrawCount()+1);
			System.out.println("비기셨습니다.");
			System.out.println("유저->"+vc.rpsChangeNumber(playerValue)+"vs"+vc.rpsChangeNumber(comValue)+"<-컴퓨터");
			break;
		}
	}

	public void viewWinningRate() {
		GameRpsVO vo = new GameRpsVO();
		System.out.println("총 게임 실행 횟수->"+vo.getGameCount());
		System.out.println("게임 중 이긴 횟수-> "+vo.getVictoryCount());
		System.out.println("게임 중 진 횟수-> "+vo.getLoseCount());
		System.out.println("게임 중 비긴 횟수->"+vo.getDrawCount());
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
