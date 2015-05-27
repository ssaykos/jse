package oop02.encapsule;

import java.util.Scanner;


public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println(" 1. ���� / 2. ���� / 3. ���ڱ� �� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int playerVal= 0;
		try {
			playerVal = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			// TODO: handle exception
			System.out.println("1~3������������ ���� �峭��?");
			System.out.println("�� ���ڳ� �Ǽ��� �ĳֽ�? 1-3���� ������������");
		}finally{
			System.out.println("�÷��̾�� "+service.showRpsVal(playerVal)+"�� �����ϴ�.");
			int comVal = service.displayComVal();
			System.out.println("��ǻ�ʹ� "+service.showRpsVal(comVal)+"�� �����ϴ�.");
			service.showWinner(playerVal,comVal);
			System.out.println();
			System.out.println();
			String msg= service.reShowWinner(playerVal, comVal);
			System.out.println(msg);
		}
	}
}
