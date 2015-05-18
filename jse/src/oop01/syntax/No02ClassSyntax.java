package oop01.syntax;
/*
	Data:
	Author:
	Desc: 클래스 선언 Syntax
	
	클래스 선언 
	- 하나의 클래스는 하나의 파일로 생성된되.
	- 자바 파일 하나 안에는 여러개의 클래스를 넣을수 있는데.
		이런경우 컴파일을 하면 소스는 하나이나 컴파일의 결과로 만들어지는 클래스는 2개 이상이 된다.
	- 하나의 파일 안에는 클래스가 2개이상있게되면 반드시 public 키워드로 진입하는 클래스를 명시 해야 한다.
	- 클래스가 2개이상 있는 경우의 파일명은 public 이 명시된 클래스 명으로 지정된다.
 */

public class No02ClassSyntax {
	// field, constructor..
	// method declarations
}
class MySuperClass{}
interface yourInterface{}
class MyClass extends MySuperClass implements yourInterface{}

