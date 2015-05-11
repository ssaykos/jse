package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		//int kor = 90; //  ->int kor;(선언 = Declartion) 와 kor =90;(할당 = Allocation) 를 합친것이다. 선언과 동시에 초기화 한것이다.
		// 초기화 = 변수에 대한 로드 되는순간//메모리생성과 동시에 들어있는값.
		// 할당 =하드에서 메모리로 값이 올라 가는 것.
		int kor =90, eng = 85 , sum = 0;
		sum = kor+eng;
		System.out.print("성적처리\n");
		System.out.println("국어\t영어\t합계");
		System.out.println(kor+"\t"+ eng+"\t"+sum);
		
	}
}
