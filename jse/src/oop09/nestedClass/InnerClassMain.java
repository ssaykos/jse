package oop09.nestedClass;
/*
 	안드로이드 코딩과 유사.. 
 	웹코딩이 안드로이드도 겸용으로 바뀌어 가는 추세.
 */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m =new InnerClassMain();
//		m.getInnerClassInstance();
//		m.getInnerClassLocal();
//		m.getInnerClassStatic();	//잘안씀 // 시스템아웃프린트 ,시스템인
//		m.getInnerClassAnonyServiceImpl();  // 안드로이드 의 가장 장점인 기법// 클래스의 메소드화
	}
	//ALT +SHIFT +m 메소드 독립 단축키  // 리펙토링  => 클래스의 메소드화를 하고 스태틱을 빼라.(이유->메모리 점유율 낮추기 위해서.)
												// 인스턴스의 메소드화
	
	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl  inn=new InnerClassAnonyServiceImpl();// 익명클래스 잠깐 쓰고 바로 버리는 클래스
		inn.print();
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();//스태틱내부 클래스는 외부 클래스를 통해 내부 클래스의 생성자 접근
		inn.printData();
	}
	public void getInnerClassLocal() {//일체형=이지만 메소드의 로컬 변수가 비밀보장이 필수인경우 사용된다.
		InnerClassLocal outer = new InnerClassLocal();
		outer.innreTest(1000);
	}
	public void getInnerClassInstance() {//일체형
		InnerClassInstance.Inner inn=new InnerClassInstance().new Inner();//외부 클래스의 생성자를 통해 내부 생성자 접근
		//Outer(바깥 클래스).내부  ㅁㅁ= new 바깥클래스 생성자 . 내부 생성자.
		inn.printData(); // 시스템. 아웃. 프린트 와 비슷한거라고 생각 해랑..
	}
}
