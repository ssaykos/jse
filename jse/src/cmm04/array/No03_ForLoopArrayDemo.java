package cmm04.array;

import java.util.Scanner;


public class No03_ForLoopArrayDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		No03_ForLoopArrayVo vo = new No03_ForLoopArrayVo();
		vo.output();

//		int a1= scanner.nextInt();
//		int a2= scanner.nextInt();
//		int a3= scanner.nextInt();
//		int a4= scanner.nextInt();
//		int a5= scanner.nextInt();
//				
//		vo.add(a1, a2, a3, a4, a5);
//		vo.output();
		
		int kor;
		do {
			System.out.print("������ ����->");
			kor=scanner.nextInt();	
			System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100�� ������ �������Դϴ�");
		} while (kor>100&&kor<0);
		vo.setKor(kor);
		
		int eng;
		do{
			System.out.print("������ ����->");
			eng= scanner.nextInt();
			System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100�� ������ �������Դϴ�");
		}while(eng>100&&eng<0);
		vo.setEng(eng);
		
		int math;
		do{
			System.out.print("������ ����->");
			math=scanner.nextInt();
			System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100�� ������ �������Դϴ�");
		}while(math>100&&eng<0);
		vo.setMath(math);
		
		int skill;
		do{
		System.out.print("����� ����->");
		skill=scanner.nextInt();
		System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100�� ������ �������Դϴ�");
		}while(skill>100&&skill<0);
		vo.setSkill(skill);
		
		int scien;
		do{
		System.out.print("������ ����->");
		scien=scanner.nextInt();
		System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100�� ������ �������Դϴ�");
		}while(scien>100&&skill<0);
		vo.setScien(scien);
		
		vo.reset();
		vo.calc();
		vo.output1();
	}
}
