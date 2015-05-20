package oop02.syntax;


public class AverageA {
	String name;
	int kor,eng;
	public static void main(String[] args) {
		//tot,avg 이름의 지역변수를 선언 하고 아래와 같이 출력.
		System.out.println("===헐크의 성적표===");
		System.out.println("국어 : 100점");
		System.out.println("영어 : 70점");
		System.out.println("총점 : 170점");
		System.out.println("평균 : 85점");
		//아이언
		// 토르
		
		AverageA hulpoint = new AverageA();
		hulpoint.name="헐크";
		hulpoint.kor=100;
		hulpoint.eng=100;
		int total = hulpoint.kor+hulpoint.eng;
		double avg= total/2;
		
		System.out.println(hulpoint.name+"의 성적표");
		System.out.println("국어 -> "+hulpoint.kor);
		System.out.println("영어 -> "+hulpoint.eng);
		System.out.println("총점 -> "+total);
		System.out.println("평균 -> "+avg);
		
		AverageA ironpoint = new AverageA();
		ironpoint.name ="아이언맨";
		ironpoint.kor=30;
		ironpoint.eng=90;
		total= ironpoint.eng+ironpoint.kor;
		avg=total/2;
		System.out.println(ironpoint.name+"의 성적표");
		System.out.println("국어 -> "+ironpoint.kor);
		System.out.println("영어 -> "+ironpoint.eng);
		System.out.println("총점 -> "+total);
		System.out.println("평균 -> "+avg);
		
		AverageA thor = new AverageA();
		thor.name="토르";
		thor.kor=90;
		thor.eng=95;
		total= thor.eng+thor.kor;
		avg=total/2d;
		System.out.println(thor.name+"의 성적표");
		System.out.println("국어 -> "+thor.kor);
		System.out.println("영어 -> "+ thor.eng );
		System.out.println("총점 -> "+ total);
		System.out.println("평균 -> "+avg);
		
	}
}
