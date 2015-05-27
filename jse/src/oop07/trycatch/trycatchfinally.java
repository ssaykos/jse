package oop07.trycatch;
/*
 	finally
 	예외 발생여부와 상관없이 반드시 실행되는 구분..
 */

public class trycatchfinally {
	public static void main(String[] args) {
		int a = 5,b = 2,c=0,d=0;
		try {
			System.out.println(" 메소드 실행중 ....");
			c = a/b;
			d = a%b;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			System.out.println("finally 실행");
			System.out.println(""+c+""+d);
		}
	}
}
