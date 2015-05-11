package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo {
	int big;
	public void getBig(int a, int b, int c){
		if(a > b && a > c){
			System.out.println("가장 큰 수는 A 값인 "+a+"입니다.");
		}else if(b>c&&b>a){
			System.out.println("가장 큰 수는 B 값인 "+b+"입니다.");
		}else{
			System.out.println("가장 큰 수는 C 값인 "+c+"입니다.");
		}
	}
	
	public static void main(String[] args) {
		No02_IfElseDemo instance = new No02_IfElseDemo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A값을 입력하세요.");
		int a = scan.nextInt();
		System.out.println("B값을 입력하세요.");
		int b = scan.nextInt();
		System.out.println("C값을 입력하세요.");
		int c = scan.nextInt();
		
		instance.getBig(a, b, c);
		
	}
}
