package oop07.trycatch;
/*
 	finally
 	���� �߻����ο� ������� �ݵ�� ����Ǵ� ����..
 */

public class trycatchfinally {
	public static void main(String[] args) {
		int a = 5,b = 2,c=0,d=0;
		try {
			System.out.println(" �޼ҵ� ������ ....");
			c = a/b;
			d = a%b;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			System.out.println("finally ����");
			System.out.println(""+c+""+d);
		}
	}
}
