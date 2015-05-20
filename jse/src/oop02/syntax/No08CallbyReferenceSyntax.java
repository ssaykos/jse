package oop02.syntax;
/*
	메소드의 값을 전달하는 방법
	- Call by Value
	- 메소드로 한 문자, 상수 문자열, 숫자를 전달하면 전부 값에 의 한 전달이라고 한다.
	- C언어의 경우에는 숫자 , 문자 계열인 Call by value 이고,
		문자열은 char* 형 이므로 Call by Address 가 된다.
	- C언어 처럼 주소(포인터) 를 전달하는 Call by Address는 자바에서는 없다.
	- Call by Value 의 경우 값을 전달하면 값은 전송한 원본 변수는 변형이 안된다.
	단지 stack 간의 값이 복사된다.
	- Call by Reference 의 경우 참조값 (Hash Code) 을 전달한 객체는 자신의 참조값이 전달됨으로써 값이 변화가 발생할수 있다.
*/
/*
	Call by Reference 참조값에 의한 전달
	- 원본 객체의 데이터가 변경된다.
		 변경을 목적으로 하는 경우 이용된다.
 */
/*
	String 객체의 데이터 전달 유형
	- String 객체는 객체이므로 내부적으로 Call by Reference 를 사용하나
	- 문자열 할당 등의 조직 때 무조건 Call by Value 기능으로 적용한다.
	- 문자열이 같으면 맴변이나 지변은 같은 Hash Code 를 가지고 있다가
	- 영역 구분이 없어진다. 그러나 새로운 문자열이 지변에 대입하면 
	- 또 다른 Hach Code 가 발생되면서 맴버변수와 구분되게 된다.
 */
public class No08CallbyReferenceSyntax {
	public static void main(String[] args) {
		No08CallbyReferenceSyntax callbyReferenceSyntax = new No08CallbyReferenceSyntax();
		
		int a = callbyReferenceSyntax.name(3,3);
	}
	public int name(int a, int b) {
		return a+b;
	}
}
