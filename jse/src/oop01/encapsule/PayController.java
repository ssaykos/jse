package oop01.encapsule;

import java.util.Scanner;


public class PayController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PayService payService = new PayService();
		System.out.println("�޿������� ���� ����� �����մϴ�");
		System.out.print("�̸� -> ");
		String name = scanner.nextLine();
		System.out.print("���� -> ");
		int salary=scanner.nextInt();
		payService.input(name, salary);
		
		/*
		 	����..
		 	income = salay - tax;
		 	
		 	PayVO : get.set
		 	PayService: ������
		 	PayController = Paymain: �����
		 	
		 	�� ���� ���� �ϰ�
		 	�̸��� �޿�(������)
		 	������ �� �ҵ��� ���ϴ� ����.
		 */
		System.out.println(" ===== �޿����� ===== ");
		System.out.println(" ���� -> "+name);
		System.out.println(" ���� -> "+salary+" ����");
		System.out.println(" ���� -> "+payService.tax()+"%");
		System.out.println(" �Ǽ��ɾ� -> "+ payService.calcPay()+" ����");//���������.
		
		//�������� ����
		System.out.println(" ===== �޿����� ===== ");
		System.out.println(" ���� -> "+name);
		System.out.println(" ���� -> "+salary+" ����");
		System.out.println(" ���� -> "+payService.showTax());
		/*
		 * �Ʒ� Ŭ���ӿ�
		 */
		System.out.println(" ���� -> "+payService.tax()+"%");//�̰� ���� �����;
		/*
		 * �� Ŭ���ӿ�
		 */
		System.out.println(" �Ǽ��ɾ� -> "+ payService.calculateIncom(name, salary)+" ����");
	}
}
