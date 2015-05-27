package oop02.encapsule;

import java.util.Scanner;


public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println(" 1. 가위 / 2. 바위 / 3. 보자기 를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int playerVal= 0;
		try {
			playerVal = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			// TODO: handle exception
			System.out.println("1~3까지값쓰랑께 나랑 장난함?");
			System.out.println("왜 문자나 실수를 쳐넣슴? 1-3까지 정수값만쓰셈");
		}finally{
			System.out.println("플레이어는 "+service.showRpsVal(playerVal)+"를 냇습니다.");
			int comVal = service.displayComVal();
			System.out.println("컴퓨터는 "+service.showRpsVal(comVal)+"를 냇습니다.");
			service.showWinner(playerVal,comVal);
			System.out.println();
			System.out.println();
			String msg= service.reShowWinner(playerVal, comVal);
			System.out.println(msg);
		}
	}
}
