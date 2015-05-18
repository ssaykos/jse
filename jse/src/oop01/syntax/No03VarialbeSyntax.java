package oop01.syntax;
/*
	맴버변수에 관한 자바 듀토리얼 내용
	
	There are several kinds of variables.
	
	Member variable in a class-three are caller fields.
	Variable in a method or block of code-theme are called local variables.
	Variable in method declarations-these are called parameter. 
 */
/*
	변수의 종류
	- 클래스 변수(클래스 영역, 클래스가 메모리영역 올라갈 때  가장 먼저 생성)
	- 인스턴스 변수(클래스 영역, 인스턴스 생성시 생성)
	- 로컬 변수(지역변수, 메소드 영역, 변수 선언문 수행시 생성)
 */
/*
	인스턴스 변수
	- 1. 각 인스턴스의 개별적인 저장공간.
	- 2. 인스턴스 생성 후 , " 창조변수. 인스턴스 변수명" 으로 접근.
	- 3. 인스턴스의 생성할때 생성되고, 참조 변수가 없을 때 가비지 컬렉터에 의해 자동 제거됨.
 */
/*
	클래스 변수 (class variable = static variable)?
 	- 같은 클래스의 모든 인스턴스들이 값은 값으로 공유하는 변수
 	- 인스턴스 생성 없이 "클래스명,클래스변수명" 으로 접근
 	- 클래스가 로딩 될 때 생성되고, 프로그램이 종료될때 소멸
 */
/*
	지역변수 (local variable)
	- 메소드 내에 선언되며, 메소드 종료와 함께 소멸
	- 조건문, 반복문의 블록(=바디){} 내에 선언 지역변수는 블록을 벗어나면 소멸
	- 반드시 초기화를 해줘야 함.
 */
/*
	 인변, 클변, 지변 차이점.
	 - 인변 -> 할당된 값이 가변적.
	 - 클변 -> 항상 고정된 값.
	 - 지변 -> 매개값 또는 초기값 할당 후 사용 가능.
 */
public class No03VarialbeSyntax {
	
}
