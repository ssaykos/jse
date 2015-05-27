package oop01.syntax;
/*
	상수 선언
	상수는 프로그램이 실행되는 동안 (선언과 동시에 값을 설정했다면) 
	값이 변하지 않는것. 
	(선언과 동시에 값은 설정하지 않았다면) 값은 한번만 설정이 가능한것.
	명령어로는 C++에서는 const  문 Java에서는 final 이있다.
	상수는 literal 상수와 symbolic 상수로 나뉘어 있다.
*/
/*
	C언어에서는 상수를 종류에 따라 다음과 같이 정의 함.
		1.리터럴 (literal) : 이름 없는 상수
		2.심볼릭(symbolic) : 이름 있는 상수
			심볼릭은 const 키워드를 사용해서 선언.
			자바는 final 키워드를 사용해서 선언한다는 점만 다를 뿐이다.
 */
public class No07ConstantSyntax {
	static final float PI = 3.14f;
	/*
		심볼릭 상수의 관례 
			1. 명사
			2. 대문자
			3. 여러단어의 조합이면 COMPANY_ADDRESS 이런식의 언더스코어의 이름
	 */
	public static void main(String[] args) {
		System.out.println("반지름 3인 원의 넓이->" + (3*3*PI));
	}
}
