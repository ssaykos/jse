package oop02.syntax;

class Coffee{
	public Coffee() {
		System.out.println("���� �ִ´�");
	}
	public Coffee(int money){
		System.out.println(money+"won");
	}
	public Coffee(int money, boolean exist){
		System.out.println("���� ���ɿ��� : "+(exist == true ? "Ŀ�� ���� ���� ": "Ŀ�� ����"));
	}
}
public class CoffeeA {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee(500);
		Coffee c3 = new Coffee(500, true);
	}
}
