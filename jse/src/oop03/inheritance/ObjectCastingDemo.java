package oop03.inheritance;

import java.util.ArrayList;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		//�Ϲ����� ��ü ����
		Aclass a= new Aclass();
		Bclass b = new Bclass();
		
//		Object  o = new Object();
//		o = new ArrayList< >();
		
//		�θ�Ÿ�� = new �ڽ�Ÿ��
		Aclass a2 = new Bclass();//�� ���� Bclass()�� �޼ҵ� �̴�.
		
//		�������̵��� �ڽ� Ŭ���� �޼ҵ� �켱 ���
		a2.over(1);
//		�������̵� ���� ������ �θ�Ŭ���� �켱 ȣ��
		a2.noOver(1);
//		�θ� Ŭ���� Ÿ���� �ڽ�Ŭ������ ���� �� ��ȯ
		
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
//		super.noOver("3");// ���� 15��°�� ���� ���� �ҽ�
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
