package cmm03.flow;

import java.util.Scanner;

public class No04_SwitchCaseDemo {

	public static void main(String[] args) {
		System.out.println("��� ������ �Է��ϼ���");
		Scanner scanner= new Scanner(System.in);
		int avg;
		do{
			System.out.println("��� ������ ���� 0~100���̾�� �մϴ� /n �ٽ� �Է��ϼ���");
			avg= scanner.nextInt();
		}while(avg>100||avg<0);

//		avg= scanner.nextInt();
//		while(avg>100||avg<0){
//			avg= scanner.nextInt();
//		}

//		while(true){			
//			if(avg>100||avg<0){
//				System.out.println("��� ������ ���� 0~100���̾�� �մϴ� /n �ٽ� �Է��ϼ���");
//				avg= scanner.nextInt();
//			}else{
//				break;
//			}
//		}

		String result = "";
//		if(avg>=70){
//			result = "�� to the ��";
//		}
		if(avg >=70){
			result = "�� to the ��";
		}else {
			result ="�����";
		}
		//��� ������ ���� �� �������ϱ�
		char grade = 'F';
//		if(avg>=90){grade = 'A';}
//		else if(avg >= 80){grade ='B';}
//		else if(avg>=70){grade ='C';}
//		else if(avg>=60){grade ='D';}
//		else {grade ='F';}
//		//���� ���������� ����ġ�� �ٲٽÿ�
//		System.out.println("���ϴ�"+result+"�̸�,"+grade+"�Դϴ�.");
		
		int condition=avg/10;
		switch(condition){
		case 10:	{	grade='A';	break;	}
		case 9:	{	grade='A';	break;	}
		case 8:	{	grade='B';	break;	}
		case 7:	{	grade='C';	break;	}
		case 6:	{	grade='D';	break;	}
		default:	{	grade='F';	break;	}
		}
		System.out.println("���ϴ�"+result+"�̸�,"+grade+"�Դϴ�.");
	}
}
