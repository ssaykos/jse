
package oop06.lotto;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("������ �ζ� ���ۢ����� ");
		LottoService service = new LottoServiceImpl();
		System.out.println("��ġ�� �����մϱ�? ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		service.extractLottos(money);
		System.out.println("�ζǹ�ȣ ���");
		service.printLotto();
		scanner.close();

	}
}