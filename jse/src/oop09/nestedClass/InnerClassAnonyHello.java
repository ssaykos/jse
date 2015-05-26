package oop09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void sayhello() {
		/*
		 	내부 클래스 인터페이스 구현 방법 1
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
		 	내부클래스 인터페이스 구현방법 2
		 */
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("안녕하세요 "+name);
			}
		};
		GreetingService jap = new GreetingService() {
			
			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("곤니찌와 "+name);
			}
		};
		eng.greet("Tome");
		kor.greet("을");
		jap.greet("영이");
		
	}
	public static void main(String[] args){
		InnerClassAnonyHello greet= new InnerClassAnonyHello();
		greet.sayhello();
	}
}
