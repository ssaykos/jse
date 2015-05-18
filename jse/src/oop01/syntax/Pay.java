package oop01.syntax;

public class Pay {

	String name;
	int salary;
	public static final double TAX=0.1;
	
	public static void main(String[] args) {
		
		System.out.println("===��ũ�� 5���� �Ǳ޿��� 300���� �Դϴ�.");
		System.out.println("===���̾��� 5���� �Ǳ޿��� 500���� �Դϴ�.");
		System.out.println("===�丣�� 5���� �Ǳ޿��� 100���� �Դϴ�.");
		
		Pay hulpay = new Pay();
		hulpay.name="��ũ";
		hulpay.salary=3333334;
		System.out.println(hulpay.name+"�� 5���� �� �޿��� "
		+(int)(hulpay.salary*(1-/*Pay.*//*����Ŭ������ ��������.*/TAX))+"�Դϴ�.");
		
		Pay ironpay = new Pay();
		ironpay.name="���̾��";
		ironpay.salary=5555556;
		System.out.println(ironpay.name+"�� 5���� �� �޿��� "+(int)(ironpay.salary*(1-Pay.TAX))+"�Դϴ�.");
		
		Pay thorpay = new Pay();
		thorpay.name="�丣";
		thorpay.salary=1111112;
		System.out.println(thorpay.name+"�� 5���� �� �޿��� "+(int)(thorpay.salary*(1-Pay.TAX))+"�Դϴ�.");
	}
}
