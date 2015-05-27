package oop01.syntax;
/*
	생성자는 인스턴스가 생성될때의 호출되는 " 인스턴스 초기화 메서드" 이다.
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
		System.out.println("돈을 넣는다");
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money+"won");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		System.out.println("구매 가능여부 : "+(exist == true ? "커피 종류 선택 ": "커피 없음"));
	}
}
public class CoffeeB {
	/*
		돈을 넣는다 
		500원
		구매가능여부 : 커피 종류 선택.
	 */
	public static void main(String[] args) {
		MilkCoffee mc = new MilkCoffee(500,true);
		//mc 로컬변수, 참조변수, 인스턴스(?)
		//인스턴스 = 변하지 않는 주소값을 가진 참조 (레퍼런스).
		//인스턴스 변수 = 인스턴스가 가진 데이터타입.
	}
}
