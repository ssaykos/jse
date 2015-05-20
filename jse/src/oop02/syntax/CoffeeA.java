package oop02.syntax;

class Coffee{
	public Coffee() {
		System.out.println("돈을 넣는다");
	}
	public Coffee(int money){
		System.out.println(money+"won");
	}
	public Coffee(int money, boolean exist){
		System.out.println("구매 가능여부 : "+(exist == true ? "커피 종류 선택 ": "커피 없음"));
	}
}
public class CoffeeA {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee(500);
		Coffee c3 = new Coffee(500, true);
	}
}
