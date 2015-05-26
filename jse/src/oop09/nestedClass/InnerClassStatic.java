package oop09.nestedClass;
/*
 	
 */
public class InnerClassStatic {
	int a = 10;
	private int b= 100;
	static int c = 200;
	public static class Inner{
		static int d = 1000;
		public void printData() {
			//System.out.println("맴변 a :"+a);
			//System.out.println("프라이빗 b:"+b);
			/*
			 	a와 b의 값이 에러가 나는 이유는..
			 	static 내부 클래스는 사실 더 이상의 내부 클래스가 아니다.
			 	또한 외부 클래스를 거치지 않고도 접근 할 수 있다.
			 	따라서 top level class라고 하며 최상위 클래스라 한다.
			 	어쩔수 없이 내부 클래스를 static 으로 선언해야 하는 경우가 있다.
			 	그건 바로 내부 클래스의 맴버중 하나로 static 맴버가 있을 경우이다.
			 */
			System.out.println("스태틱 c:"+c);
			System.out.println("스태틱 d:"+d);
			
		}
	}
}
