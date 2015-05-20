package oop03.inheritance;

import java.util.ArrayList;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		//일반적인 객체 생성
		Aclass a= new Aclass();
		Bclass b = new Bclass();
		
//		Object  o = new Object();
//		o = new ArrayList< >();
		
//		부모타입 = new 자식타입
		Aclass a2 = new Bclass();//이 줄의 Bclass()는 메소드 이다.
		
//		오버라이딩시 자식 클래스 메소드 우선 출력
		a2.over(1);
//		오버라이딩 하지 않으면 부모클래스 우선 호출
		a2.noOver(1);
//		부모 클래스 타입을 자식클래스로 강제 형 변환
		
//		a2.noOver("a");
		
		Bclass b2 = (Bclass) a2;
		b2.over(1);
		b2.noOver("AAA");

		b.over(1);
		b.noOver(1);
		b.over(1);
		b.noOver("AAA");
		
	}
}
class Aclass{
	void over(int i){
		System.out.println("Aclass - over() : "+ (i*10));
	}
	void noOver(int i){
		System.out.println("Aclass-noOver() : "+i);
	}
}

class Bclass extends Aclass{
	
	public Bclass() {
		// TODO Auto-generated constructor stub
//		super.noOver("3");// 위의 15번째에 대한 이해 소스
	}
	@Override
	void over(int i) {
		// TODO Auto-generated method stub
		//super.over(i);
		System.out.println("Bclass - over() : "+ (i*10000));
	}
	void noOver(String string){
		System.out.println(" Bclass - noOver() :" + string);
	}
	void onlyB(){
		System.out.println("onlyB()");
	}
}
