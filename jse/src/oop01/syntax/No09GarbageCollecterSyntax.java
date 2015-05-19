package oop01.syntax;
/*
	GarbageCollecting 가비지 컬랙팅
	- 자바 가상기계 (jvm) 자동으로 수정함
	- 맴버메소드 안에서 생성된 객체는 메소드 종료때 전부 메모리가 회수함.
	- 맴변은 메모리 회수 과정을 따로 가지게 됨.
	- 참조를 하지 않는 메모리 수집, system.gc()
	- 우선순위가 낮은 스레드로 수행.
		일반적인 경우 모든 스레드가 종료된후 수행.
	- gc() 를 실행하면 강제로 메모리 회수 작업을 하게 되어
		finalize() 가 호출된다. 그러나 gc() 자체는
		많은 부하를 동반하므로 JVM 이실행하도록 함.
 */

public class No09GarbageCollecterSyntax {
	public static void main(String[] args) {
		Garbage[] ga = new Garbage[10];
		for (int i = 0; i < ga.length; i++) {
			ga[i]= new Garbage(10);
		}
		for (int i = 0; i < ga.length; i++) {
			ga[i]=null;
		}
		System.gc();
	}
}
class Garbage{
	int objNo;
	Garbage (int n) {
		objNo = n;
		System.out.println("Garbage Class"+ objNo + "이 만들어짐...");
	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage Class"+ objNo + "에서 쓰이던 메모리가 회수됨..");
		super.finalize();
		
	}
}