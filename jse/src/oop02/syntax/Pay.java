package oop02.syntax;

public class Pay {

	String name;
	int salary;
	public static final double TAX=0.1;
	
	public static void main(String[] args) {
		
		System.out.println("===헐크의 5월달 실급여는 300만원 입니다.");
		System.out.println("===아이언의 5월달 실급여는 500만원 입니다.");
		System.out.println("===토르의 5월달 실급여는 100만원 입니다.");
		
		Pay hulpay = new Pay();
		hulpay.name="헐크";
		hulpay.salary=3333334;
		System.out.println(hulpay.name+"의 5월달 실 급여는 "
		+(int)(hulpay.salary*(1-/*Pay.*//*같은클래스는 생략가능.*/TAX))+"입니다.");
		
		Pay ironpay = new Pay();
		ironpay.name="아이언맨";
		ironpay.salary=5555556;
		System.out.println(ironpay.name+"의 5월달 실 급여는 "+(int)(ironpay.salary*(1-Pay.TAX))+"입니다.");
		
		Pay thorpay = new Pay();
		thorpay.name="토르";
		thorpay.salary=1111112;
		System.out.println(thorpay.name+"의 5월달 실 급여는 "+(int)(thorpay.salary*(1-Pay.TAX))+"입니다.");
	}
}
