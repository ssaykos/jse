package oop03.inheritance;
/*
 	Method Overriding
 	 - 상속관계에서 Parent 에 선언은 메소드를 Child 에서 다시 선언한 경우
 	 - 이런 경우 Parent 의 메소드는 무시됨
 	 - 같은 메소드가 Parent 와 Child 에게 모두 선언 되있으나 내용은 다름
 	 - 클래스의 다형성을 구현할 수 있음.
 	 - Parent 의 Child간에 메소드의 원형 ( 메소드명 , 파라미터 갯수, 파라미터 데이터 타입이 같아야함)
 	 - Parent 가 메소드의 상속해주나Child 는 자신이 구현한 메소드를 우선사용
 	 - Parent 가 메소드의 기능을 유지하면서 상황에 따라 Child 의 변형된 Parent의 메소드를 캡슐화 한다고 볼 수 있다.
 	 - 기능을 사용하고 싶은 경우에 사용하여 다형성의 구현의 핵심원리.
 	 - Parent 의 메소드를 캡슐화 한다고 볼 수 있다.
 	 - Parent 의 구기능을 없애는 것이 아니라 유지하면서 새로운 기능으로 교체 하려는 목적으로 사용.
 */

public class OverridingDemo {
	/*
	 	Parent 의 show() 와 Child의 show() 의 원형이 같으므로 오버라이드이다.
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
		System.out.println("부모는 달린다.");
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