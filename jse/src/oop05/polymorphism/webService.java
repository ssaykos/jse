package oop05.polymorphism;

public interface webService extends WebDao {// 인터페이스도 상속이 된다.. 
	public String getAge();
	public String setAge();
	public String updateAge();
	public String deleteAge();
	
}
