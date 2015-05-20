package oop03.inheritance;
/*
	Date :
	Auther :
	Desc : 메소드 상속
 */
/*
 	Car
 	△ 
 	 |  상속
 	Hcar <ㅡ  new (instantlate)
 	
 */
class Car2{
	String name = "자동차";
	public String gear(){
		return "수동 기어";
	}
	
}
class Hcar extends Car2{
	String brand = "현대차";
	public String autoGear(){
		return "오토 기어";
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
//		상속하여 받을수 있는 로직은 자식만가능하다. //<나의 이해> 기능(메소드)은 내려오는것만 가능하고 올려서 받을 수 없다.
	}
}
