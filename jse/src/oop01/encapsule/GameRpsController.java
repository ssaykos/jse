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
		boolean flag = true;
		while(flag){
			GameRpsService service = new GameRpsService();
			System.out.print("가위:1 바위:2 보:3 를 입력->");
			boolean checkCondition=true;
			//사용자가 입력한 값이 1-3까지의 값인지 확인(아닐경우 맞게 입력할때까지 틀렷다는 문구와 함께 재입력하도록
			while(checkCondition){
				int playerValue= scanner.nextInt();
				checkCondition= service.playerValueCheck(playerValue);
				if(checkCondition==true){
					System.out.println("잘못입력하셧습니다 다시 입력하세요.");
					System.out.print("가위:1 바위:2 보:3 를 입력->");
				}
				service.gameProcess(playerValue);
				
			}
		
			
			
			
//			System.out.println("당신은 "+playerValue + "를 냇습니다.");
//			service.showComValue();
		}
	}
}
