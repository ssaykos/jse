package oop09.nestedClass;
/*
 	
 */
public class InnerClassStatic {
	int a = 10;
	private int b= 100;
	static int c = 200;
	public static class Inner{
		static int d = 1000;
		public void printData() {
			//System.out.println("�ɺ� a :"+a);
			//System.out.println("�����̺� b:"+b);
			/*
			 	a�� b�� ���� ������ ���� ������..
			 	static ���� Ŭ������ ��� �� �̻��� ���� Ŭ������ �ƴϴ�.
			 	���� �ܺ� Ŭ������ ��ġ�� �ʰ� ���� �� �� �ִ�.
			 	���� top level class��� �ϸ� �ֻ��� Ŭ������ �Ѵ�.
			 	��¿�� ���� ���� Ŭ������ static ���� �����ؾ� �ϴ� ��찡 �ִ�.
			 	�װ� �ٷ� ���� Ŭ������ �ɹ��� �ϳ��� static �ɹ��� ���� ����̴�.
			 */
			System.out.println("����ƽ c:"+c);
			System.out.println("����ƽ d:"+d);
			
		}
	}
}
