package oop02.syntax;
/*
	�����ڴ� �ν��Ͻ��� �����ɶ��� ȣ��Ǵ� " �ν��Ͻ� �ʱ�ȭ �޼���" �̴�.
 */
class MilkCoffee{
	int money;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public MilkCoffee() {
		System.out.println("���� �ִ´�");
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money+"won");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		System.out.println("���� ���ɿ��� : "+(exist == true ? "Ŀ�� ���� ���� ": "Ŀ�� ����"));
	}
}
public class CoffeeB {
	/*
		���� �ִ´� 
		500��
		���Ű��ɿ��� : Ŀ�� ���� ����.
	 */
	public static void main(String[] args) {
		MilkCoffee mc = new MilkCoffee(500,true);
		//mc ���ú���, ��������, �ν��Ͻ�(?)
		//�ν��Ͻ� = ������ �ʴ� �ּҰ��� ���� ���� (���۷���).
		//�ν��Ͻ� ���� = �ν��Ͻ��� ���� ������Ÿ��.
	}
}
