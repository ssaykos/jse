package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	
	public static void main(String[] args) {
			
		NumberMatchService service = new NumberMatchService();
		Scanner scanner= new Scanner(System.in);
		System.out.println("�� 3ȸ �õ� ����");
		int a= 0;
		for (int i = 0; i < 3; i++) {
			if(a==1){
				break;
			}else{
				int input= scanner.nextInt();
				service.setInput(input);
				a=service.GameControl();
			}
		}
	}
}
