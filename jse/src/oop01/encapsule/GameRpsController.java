package oop01.encapsule;

/*
 	Date:2015.05.15
 	Auther : ������
 	
 */
import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("���������� ������ �����մϴ�.");
		Scanner scanner= new Scanner(System.in);
		boolean flag = true;
		while(flag){
			GameRpsService service = new GameRpsService();
			System.out.print("����:1 ����:2 ��:3 �� �Է�->");
			boolean checkCondition=true;
			//����ڰ� �Է��� ���� 1-3������ ������ Ȯ��(�ƴҰ�� �°� �Է��Ҷ����� Ʋ�Ǵٴ� ������ �Բ� ���Է��ϵ���
			while(checkCondition){
				int playerValue= scanner.nextInt();
				checkCondition= service.playerValueCheck(playerValue);
				if(checkCondition==true){
					System.out.println("�߸��Է��ϼ˽��ϴ� �ٽ� �Է��ϼ���.");
					System.out.print("����:1 ����:2 ��:3 �� �Է�->");
				}
				service.gameProcess(playerValue);
				
			}
		
			
			
			
//			System.out.println("����� "+playerValue + "�� �����ϴ�.");
//			service.showComValue();
		}
	}
}
