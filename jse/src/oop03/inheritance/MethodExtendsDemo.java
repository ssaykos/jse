package oop03.inheritance;
/*
	Date :
	Auther :
	Desc : �޼ҵ� ���
 */
/*
 	Car
 	�� 
 	 |  ���
 	Hcar <��  new (instantlate)
 	
 */
class Car2{
	String name = "�ڵ���";
	public String gear(){
		return "���� ���";
	}
	
}
class Hcar extends Car2{
	String brand = "������";
	public String autoGear(){
		return "���� ���";
	}
}
public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar hc = new Hcar();
		System.out.println(hc.gear());
		System.out.println(hc.autoGear());
		
		Car2 car= new Car2();
		System.out.println(car.gear());
//		System.out.println(car.autoGear());
//		����Ͽ� ������ �ִ� ������ �ڽĸ������ϴ�. //<���� ����> ���(�޼ҵ�)�� �������°͸� �����ϰ� �÷��� ���� �� ����.
	}
}
