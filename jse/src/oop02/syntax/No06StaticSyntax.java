package oop02.syntax;
/*
	static 변수
	- 정리변수
	- 클래스가 JVM 상으로 로딩시에 메모리 발달을 한다.
	- 해시코드 (HeshCode) 의 출력
	- 객체의 해시코드는 JVM 의 해시 알고리즘에 의 해 패키지명과 클래스 명의 조합되어 해시코드가 선별된다.
	- String 은 객체 변수의 값이 같을 경우 즉 같은 문자열을 가지고 있으며.. 해시 코드를 공유한다.
	String str1 = "헐크";
	String str2 = "헐크";
	str1.HashCode() = str2.HashCode();
*/
/*
	static 사용을 고려해야 할 상황
	 - 맴변 중 모든 인스턴스에 공통적으로 사용해야 하는 것에 붙여 사용.
	 - 인스턴스 변수를 사용하지 않고 클래스에서 바로 접근하려할 시.
*/
public class No06StaticSyntax {
	public static void main(String[] args) {
		String hulk="헐크";
		String hulk1 = new String("헐크");
		String hulk2 = new String("헐크");
		boolean aa =(hulk1.hashCode()==hulk2.hashCode());
		boolean bb =(hulk.hashCode()==hulk2.hashCode());
		System.out.println(aa);
		System.out.println(bb);
	}
}
