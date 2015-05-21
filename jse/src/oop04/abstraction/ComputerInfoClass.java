package oop04.abstraction;


public class ComputerInfoClass extends ProductInfoClass{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo() {
		//구현
		super.displayInfo();
		System.out.println("CPU :"+this.cpu);
		System.out.println("RAM:"+this.ram);
		System.out.println("hdd:"+this.hdd);
		/*
		 	ProductInfoClass에 있는 맴변이 private 이므로 접근이 불가능.
		 	예전 추상 클래스는 protected 여서 접근 가능햇는데 이제는 private으로 막혀있다.
		 	그래서 맴변에 대한 접근자체도 부모에 있는 displayInfo() 를 호출해서 처리한다.
		 */
	}
	public void setInfo(String company, String name, String sid, String cpu, String ram, String hdd) {
		//구현하세요
		super.setInfo(company, name, sid);
		this.cpu= cpu;
		this.ram=ram;
		this.hdd=hdd;
		/*
		 	파라미터로 넘어온 값들도 바로 super를 통해 부모 메소드의 파라미터로 던져서 바로 set한다.
		 	맴변의 공유가 부모자식 관계에서 성립하므로, 부모의 맴변에 대한 접근 역시 가능해진다.
		 */
	}
}
