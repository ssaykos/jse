package oop01.syntax;
/*
	GarbageCollecting ������ �÷���
	- �ڹ� ������ (jvm) �ڵ����� ������
	- �ɹ��޼ҵ� �ȿ��� ������ ��ü�� �޼ҵ� ���ᶧ ���� �޸𸮰� ȸ����.
	- �ɺ��� �޸� ȸ�� ������ ���� ������ ��.
	- ������ ���� �ʴ� �޸� ����, system.gc()
	- �켱������ ���� ������� ����.
		�Ϲ����� ��� ��� �����尡 ������� ����.
	- gc() �� �����ϸ� ������ �޸� ȸ�� �۾��� �ϰ� �Ǿ�
		finalize() �� ȣ��ȴ�. �׷��� gc() ��ü��
		���� ���ϸ� �����ϹǷ� JVM �̽����ϵ��� ��.
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
		System.out.println("Garbage Class"+ objNo + "�� �������...");
	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage Class"+ objNo + "���� ���̴� �޸𸮰� ȸ����..");
		super.finalize();
		
	}
}