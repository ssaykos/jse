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
			System.out.print("국어의 점수->");
			kor=scanner.nextInt();	
			System.out.println("잘못 입력하셨습니다 0~100이 점수의 허용범위입니다");
		} while (kor>100&&kor<0);
		vo.setKor(kor);
		
		int eng;
		do{
			System.out.print("영어의 점수->");
			eng= scanner.nextInt();
			System.out.println("잘못 입력하셨습니다 0~100이 점수의 허용범위입니다");
		}while(eng>100&&eng<0);
		vo.setEng(eng);
		
		int math;
		do{
			System.out.print("수학의 점수->");
			math=scanner.nextInt();
			System.out.println("잘못 입력하셨습니다 0~100이 점수의 허용범위입니다");
		}while(math>100&&eng<0);
		vo.setMath(math);
		
		int skill;
		do{
		System.out.print("기술의 점수->");
		skill=scanner.nextInt();
		System.out.println("잘못 입력하셨습니다 0~100이 점수의 허용범위입니다");
		}while(skill>100&&skill<0);
		vo.setSkill(skill);
		
		int scien;
		do{
		System.out.print("과학의 점수->");
		scien=scanner.nextInt();
		System.out.println("잘못 입력하셨습니다 0~100이 점수의 허용범위입니다");
		}while(scien>100&&skill<0);
		vo.setScien(scien);
		
		vo.reset();
		vo.calc();
		vo.output1();
	}
}
