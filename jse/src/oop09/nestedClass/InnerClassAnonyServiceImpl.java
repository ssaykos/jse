package oop09.nestedClass;


public class InnerClassAnonyServiceImpl  {
	
	String data= "Hello Anonymous !!";
	public void print() {
		new InnerClassAnonyService() {
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("�͸��� Ŭ�������:"+data);
				
			}
		}.printData();;
	}
	
}
