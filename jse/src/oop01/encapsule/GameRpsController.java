package oop01.encapsule;

/*
 	Date:2015.05.15
 	Auther : 김진선
 	
 */
import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다.");
		Scanner scanner= new Scanner(System.in);
		GameRpsService service = new GameRpsService();
		boolean flag = true;
		while(flag){
			System.out.print("가위:1 바위:2 보:3 를 입력->");
			int playerValue= scanner.nextInt();
			boolean checkCondition=true;
			//사용자가 입력한 값이 1-3까지의 값인지 확인(아닐경우 맞게 입력할때까지 틀렷다는 문구와 함께 재입력하도록
			while(checkCondition){
				checkCondition= service.playerValueCheck(playerValue);
				if(checkCondition==true){
					System.out.println("잘못입력하셧습니다 다시 입력하세요.");
					System.out.print("가위:1 바위:2 보:3 를 입력->");
					playerValue= scanner.nextInt();
				}
			}
			service.gameProcess(playerValue);
			service.viewWinningRate();
			System.out.print("계속 하시겠습니까?(1)예(2)아니오->");
			int qustionContinue = scanner.nextInt();
			boolean checkQustionContinue=true;
			while(checkQustionContinue){
				checkQustionContinue= service.playerQustionContinueCheck(qustionContinue);
				if(checkQustionContinue==true){
					System.out.println("잘못입력하셧습니다 다시 입력하세요.");
					System.out.print("계속 하시겠습니까?(1)예(2)아니오->");
					qustionContinue= scanner.nextInt();
				}
			}
			flag=service.qustionContinue(qustionContinue);
		}
		System.out.println("종료되었습니다.");
	}
}
