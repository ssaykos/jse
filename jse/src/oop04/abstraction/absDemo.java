package oop04.abstraction;
/*
 Date:
 Author:
 Desc: 추상클래스 예제
 */

public class absDemo {
	public static void main(String[] args) {
		Sum01 sum01= new Sum01();
		System.out.println(sum01.sum(10, 20));
		System.out.println(sum01.toString());
		
		Sum02 sum02 = new Sum02();
		System.out.println(sum02.sum(22, 22));
		System.out.println(sum02.toString());
	}
}
abstract class AbsSub{
	//필수적으로 강제성이 있는 메소드
	public abstract String toString();
	public String sum(int i, int k) {
		int sum=i+k;
		return ""+sum;
	}
}
class Sum01 extends AbsSub{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class sum01 extends Abssub";
	}
	
}
class Sum02 extends AbsSub{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class sum02 extends Abssub";
	}
	
}