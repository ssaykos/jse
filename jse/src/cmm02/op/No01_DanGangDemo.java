package cmm02.op;

public class No01_DanGangDemo {
	/*
	 산술 연산자 +,-,*,/,%
	 단항 연산자 +, -, ++, --,! ,
	 등호 연산자 -- , != , >, >=,<,<=
	 조건 연산자 && , || , ?:
	 객체 비교 연산자 instanceof
	 */
	public static void main(String[] args) {

		int i=5;
		i= i+1;
		System.out.println("i = i+1의 결과 값:"+i);
		int j = 5;
		j++;
		System.out.println("j++의 결과 값:" +j);
		int k=5;
		++k;
		System.out.println("++k 의 결과 값:"+k);

	}
}
