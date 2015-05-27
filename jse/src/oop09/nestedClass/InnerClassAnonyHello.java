package oop09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void sayhello() {
		/*
		 	���� Ŭ���� �������̽� ���� ��� 1
		 */
		class EnglishGreetingServiceImpl implements GreetingService{

			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("hello "+name);
			}
		}
		GreetingService eng = new EnglishGreetingServiceImpl();
		/*
		 	����Ŭ���� �������̽� ������� 2
		 */
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("�ȳ��ϼ��� "+name);
			}
		};
		GreetingService jap = new GreetingService() {
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("������ "+name);
			}
		};
		eng.greet("Tome");
		kor.greet("��");
		jap.greet("����");
		
	}
	public static void main(String[] args){
		InnerClassAnonyHello greet= new InnerClassAnonyHello();
		greet.sayhello();
	}
}
