package oop04.abstraction;
/*
 Date:
 Author:
 Desc: �߻�Ŭ���� ����
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
	//�ʼ������� �������� �ִ� �޼ҵ�
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