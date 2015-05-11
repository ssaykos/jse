package cmm02.op;

public class No02_DanHangDemo2 {
	public static void main(String[] args) {
		//후위형은 변수 값을 읽어온후 연산한다.
		int i=5 ;
		int j=0;
		j=i++;
		System.out.println("j=i++의 결과");
		System.out.println("=========");
		System.out.println("i의 값:"+i);
		System.out.println("j의 값:"+j);
		System.out.println();
		//전위형은 1을 먼저 증가 시키고 연산한다.
		int x =5;
		int y =0;
		y=++x;
		System.out.println("j=i++의 결과");
		System.out.println("=========");
		System.out.println("x의 값:"+x);
		System.out.println("y의 값:"+y);
		System.out.println();
	}
}
