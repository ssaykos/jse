package oop01.game;

import java.util.Scanner;

public class NumberMatchController {
	
	public static void main(String[] args) {
			
		NumberMatchService sevice = new NumberMatchService();
		Scanner scanner= new Scanner(System.in);
		System.out.println("총 3회 시도 가능");
		int a= 0;
		for (int i = 0; i < 3; i++) {
			if(a==1){
				break;
			}else{
				int input= scanner.nextInt();
				sevice.setInput(input);
				a=sevice.GameControl();
			}
		}
		
		
	}
}
