package cmm03.flow;

import java.util.Scanner;

/*

��
�١�
�١١�
�١١١�
�١١١١�
 */

public class No06_Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
//		do{
//			System.out.println("����⸦ �մϴ� 3���� ū���� �Է��ϼ���");
//			a=scanner.nextInt();
//		}while(a<3);
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
