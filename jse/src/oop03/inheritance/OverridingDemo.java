package oop03.inheritance;
/*
 	Method Overriding
 	 - ��Ӱ��迡�� Parent �� ������ �޼ҵ带 Child ���� �ٽ� ������ ���
 	 - �̷� ��� Parent �� �޼ҵ�� ���õ�
 	 - ���� �޼ҵ尡 Parent �� Child ���� ��� ���� �������� ������ �ٸ�
 	 - Ŭ������ �������� ������ �� ����.
 	 - Parent �� Child���� �޼ҵ��� ���� ( �޼ҵ�� , �Ķ���� ����, �Ķ���� ������ Ÿ���� ���ƾ���)
 	 - Parent �� �޼ҵ��� ������ֳ�Child �� �ڽ��� ������ �޼ҵ带 �켱���
 	 - Parent �� �޼ҵ��� ����� �����ϸ鼭 ��Ȳ�� ���� Child �� ������ Parent�� �޼ҵ带 ĸ��ȭ �Ѵٰ� �� �� �ִ�.
 	 - ����� ����ϰ� ���� ��쿡 ����Ͽ� �������� ������ �ٽɿ���.
 	 - Parent �� �޼ҵ带 ĸ��ȭ �Ѵٰ� �� �� �ִ�.
 	 - Parent �� ������� ���ִ� ���� �ƴ϶� �����ϸ鼭 ���ο� ������� ��ü �Ϸ��� �������� ���.
 */

public class OverridingDemo {
	/*
	 	Parent �� show() �� Child�� show() �� ������ �����Ƿ� �������̵��̴�.
	 */
	public static void main(String[] args) {
		ParentB b = new ParentB();
		b.show();
		b.run();
		
		ChildB c = new ChildB();
		c.show();
		
	}
}

class ParentB{
	void show(){
		System.out.println("Parent show() using");
	}
	
	void run() {
		// TODO Auto-generated method stub
		System.out.println("�θ�� �޸���.");
	}
}
class ChildB extends ParentB{
	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("ChildB show() using");
	}
}