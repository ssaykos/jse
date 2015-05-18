package oop01.syntax;

public class AverageDService {

	AverageDVO thor = new AverageDVO();
	AverageDVO ironman = new AverageDVO();
	AverageDVO hulk = new AverageDVO();
	
	public void allInput(){
		hulk.setEng(95);
		hulk.setKor(80);
		hulk.setName("헐크짜응");
		
		ironman.setEng(100);
		ironman.setKor(33);
		ironman.setName("아이언맨");
		
		thor.setName("토르짜응");
		thor.setEng(99);
		thor.setKor(80);
	}
	public void allOutput(){
		System.out.println(hulk.getName()+"의 성적표");
		System.out.println("국어 -> "+hulk.getKor()+"점");
		System.out.println("영어 -> "+ hulk.getEng()+"점" );
		System.out.println("총점 -> "+ pointSum(hulk.getEng(),hulk.getKor())+"점");
		System.out.println("평균 -> "+pointAvg(hulk.getEng(),hulk.getKor())+"점");
		
		System.out.println(ironman.getName()+"의 성적표");
		System.out.println("국어 -> "+ironman.getKor()+"점");
		System.out.println("영어 -> "+ ironman.getEng()+"점" );
		System.out.println("총점 -> "+ pointSum(ironman.getEng(),ironman.getKor())+"점");
		System.out.println("평균 -> "+pointAvg(ironman.getEng(), ironman.getKor())+"점");
		
		System.out.println(thor.getName()+"의 성적표");
		System.out.println("국어 -> "+thor.getKor()+"점");
		System.out.println("영어 -> "+ thor.getEng()+"점" );
		System.out.println("총점 -> "+ pointSum(thor.getEng(),thor.getKor())+"점");
		System.out.println("평균 -> "+pointAvg(thor.getEng(), thor.getKor())+"점");
	}
	public int pointSum(int kor, int eng){
		return kor+eng;
	}
	public double pointAvg(int kor, int eng){
		return (kor+eng)/2d;
	}
}
