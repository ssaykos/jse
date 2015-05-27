package oop07.trycatch;
/*
 	���ܴ� ���α׷� ���߽� �߻��ϴ� ������ �ٸ� ����
 	���α׷� ���߽� �߻��ϴ� ������ ���� ��ó�� �ʼ�
 	���������� ������ �� ��߿� �߻��ϴ� ������ ��κ��� ����..
 	���ܴ� �ڵ�� �߻��� �����ʹ� �ٸ��� �����Ͻ� ������ �߻����� ����
 */
/*
 	try{
 	���ܰ� �߻��� ������ �ִ� �ڵ带 �����ڰ� �����Ͽ� ����,
 	IO,DBMS,Network���� �ڵ尡 �ַ� ��ġ
 	}catch(Exception e){
 	e.printStackTrack();
 	}
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		int a=5, b=0;
		int mok = 0, nmg=0;
		
		try {
			mok=a/b;
			nmg=a%b;
		} catch (java.lang.ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("���� �߻�");
		}finally{
			System.out.println(a+"/"+b+"="+mok);
			System.out.println(a+"%"+b+"="+nmg);
		}
		
	}
}
