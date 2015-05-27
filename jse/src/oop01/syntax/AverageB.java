package oop01.syntax;

public class AverageB {

	String name;
	int kor;
	int eng;
	
	/*메소드를 여기에 정의해서 메소드의 객체화 해주세요.*/
	
	public int total(int kor, int eng){
		return kor+eng;
	}
	public double avg(int kor , int eng){
		return (kor+eng)/2d;
	}
	public static void main(String[] args) {

		AverageB hulk = new AverageB();
		AverageB ironman = new AverageB();
		AverageB thor = new AverageB();
		
		hulk.name="헐크";
		hulk.kor=100;
		hulk.eng=100;
		
		ironman.name ="아이언맨";
		ironman.kor=30;
		ironman.eng=90;
		
		thor.name="토르";
		thor.kor=90;
		thor.eng=95;
		
		System.out.println(hulk.name+"의 성적표");
		System.out.println("국어 -> "+hulk.kor);
		System.out.println("영어 -> "+ hulk.eng );
		System.out.println("총점 -> "+ hulk.total(hulk.kor,hulk.eng));
		System.out.println("평균 -> "+hulk.avg(hulk.kor,hulk.eng));
		
		System.out.println(ironman.name+"의 성적표");
		System.out.println("국어 -> "+ironman.kor);
		System.out.println("영어 -> "+ ironman.eng );
		System.out.println("총점 -> "+ thor.total(ironman.kor,ironman.eng));
		System.out.println("평균 -> "+thor.avg(ironman.kor,ironman.eng));
		
		System.out.println(thor.name+"의 성적표");
		System.out.println("국어 -> "+thor.kor);
		System.out.println("영어 -> "+ thor.eng );
		System.out.println("총점 -> "+ thor.total(thor.kor,thor.eng));
		System.out.println("평균 -> "+thor.avg(thor.kor,thor.eng));
	}
}
