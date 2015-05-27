package oop09.nestedClass;
/*
 	���� Ŭ���� �� �ι�° ����
 	- Local ���� Ŭ���� ������ �ܺ� Ŭ���� �� �ɹ��� �����ϴµ� �־ ������ ������.
 	- �켱 �ܺ� Ŭ������ �ɹ������� �����Ҽ� �ִ�.
 	- ������ �޼��� ������ ���������� ���� �� �� ����.
 */
public class InnerClassLocal {
	int a= 100;
	
	public void innreTest(int k) {
		int b= 200;
		final int c = k;
		
		class Inner{//�θ� �޼ҵ��̹Ƿ� �ش� Ŭ������ ���������̴�.
			public void getData() {
				System.out.println("�ɹ����� a:"+a);
				System.out.println("��� c:"+c);
				//System.out.println("�������� b��"+b);
			}
		}
		Inner inn = new Inner();
		inn.getData();
		
	}
}
