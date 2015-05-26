package oop09.nestedClass;
/*
 	내부 클래스(Inner Class)
 	첫번째 형태 - 인스턴스 내부 클래스
 	- 맴버 메소드를 클래스 내부에 선언함.//잘 안씀
 */
public class InnerClassInstance {
	int a= 10;
	private int b= 100;
	static int c = 200;

	public class Inner{//안드로이드에서 자주쓰는 디자인패턴
		 public void printData(){//부모가 클래스이므로 해당 클래스 맴변이다
			System.out.println("맴버변수 a: "+a);
			System.out.println("프라이빗 변수 b :"+b);
			System.out.println("스태틱변수 c:"+c);
		}
	}
}
