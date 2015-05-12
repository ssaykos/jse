package cmm03.flow;

import java.util.Scanner;

/*

☆
☆☆
☆☆☆
☆☆☆☆
☆☆☆☆☆
 */

public class No06_Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
//		do{
//			System.out.println("별찍기를 합니다 3보다 큰수를 입력하세요");
//			a=scanner.nextInt();
//		}while(a<3);
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
