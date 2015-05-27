package oop02.encapsule;

/*
 	Date:2015.05.15
 	Auther : ������
 	
 */
import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("���������� ������ �����մϴ�.");
		Scanner scanner= new Scanner(System.in);
		GameRpsService service = new GameRpsService();
		boolean flag = true;
		while(flag){
			System.out.print("����:1 ����:2 ��:3 �� �Է�->");
			int playerValue= scanner.nextInt();
			boolean checkCondition=true;
			//����ڰ� �Է��� ���� 1-3������ ������ Ȯ��(�ƴҰ�� �°� �Է��Ҷ����� Ʋ�Ǵٴ� ������ �Բ� ���Է��ϵ���
			while(checkCondition){
				checkCondition= service.playerValueCheck(playerValue);
				if(checkCondition==true){
					System.out.println("�߸��Է��ϼ˽��ϴ� �ٽ� �Է��ϼ���.");
					System.out.print("����:1 ����:2 ��:3 �� �Է�->");
					playerValue= scanner.nextInt();
				}
			}
			service.gameProcess(playerValue);
			service.viewWinningRate();
			System.out.print("��� �Ͻðڽ��ϱ�?(1)��(2)�ƴϿ�->");
			int qustionContinue = scanner.nextInt();
			boolean checkQustionContinue=true;
			while(checkQustionContinue){
				checkQustionContinue= service.playerQustionContinueCheck(qustionContinue);
				if(checkQustionContinue==true){
					System.out.println("�߸��Է��ϼ˽��ϴ� �ٽ� �Է��ϼ���.");
					System.out.print("��� �Ͻðڽ��ϱ�?(1)��(2)�ƴϿ�->");
					qustionContinue= scanner.nextInt();
				}
			}
			flag=service.qustionContinue(qustionContinue);
		}
		System.out.println("����Ǿ����ϴ�.");
	}
}
