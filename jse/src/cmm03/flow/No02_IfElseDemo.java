package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo {
	int big;
	public void getBig(int a, int b, int c){
		if(a > b && a > c){
			System.out.println("���� ū ���� A ���� "+a+"�Դϴ�.");
		}else if(b>c&&b>a){
			System.out.println("���� ū ���� B ���� "+b+"�Դϴ�.");
		}else{
			System.out.println("���� ū ���� C ���� "+c+"�Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		No02_IfElseDemo instance = new No02_IfElseDemo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A���� �Է��ϼ���.");
		int a = scan.nextInt();
		System.out.println("B���� �Է��ϼ���.");
		int b = scan.nextInt();
		System.out.println("C���� �Է��ϼ���.");
		int c = scan.nextInt();
		
		instance.getBig(a, b, c);
		
	}
}
