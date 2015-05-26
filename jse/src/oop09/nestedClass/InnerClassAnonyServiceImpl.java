package oop09.nestedClass;


public class InnerClassAnonyServiceImpl  {
	
	String data= "Hello Anonymous !!";
	public void print() {
		new InnerClassAnonyService() {
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("익명내부 클래스출력:"+data);
				
			}
		}.printData();;
	}
	
}
