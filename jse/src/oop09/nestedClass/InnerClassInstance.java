package oop09.nestedClass;
/*
 	���� Ŭ����(Inner Class)
 	ù��° ���� - �ν��Ͻ� ���� Ŭ����
 	- �ɹ� �޼ҵ带 Ŭ���� ���ο� ������.//�� �Ⱦ�
 */
public class InnerClassInstance {
	int a= 10;
	private int b= 100;
	static int c = 200;

	public class Inner{//�ȵ���̵忡�� ���־��� ����������
		 public void printData(){//�θ� Ŭ�����̹Ƿ� �ش� Ŭ���� �ɺ��̴�
			System.out.println("�ɹ����� a: "+a);
			System.out.println("�����̺� ���� b :"+b);
			System.out.println("����ƽ���� c:"+c);
		}
	}
}
