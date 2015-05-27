package oop01.syntax;


public class AverageC {
	
	public static void main(String[] args) {
		AverageVO hulk = new AverageVO();
		AverageVO ironman = new AverageVO();
		AverageVO thor = new AverageVO();
		
		hulk.setEng(95);
		hulk.setKor(80);
		hulk.setName("헐크짜응");
		
		ironman.setEng(100);
		ironman.setKor(33);
		ironman.setName("아이언맨");
		
		thor.setName("토르짜응");
		thor.setEng(99);
		thor.setKor(80);
		
		System.out.println(hulk.getName()+"의 성적표");
		System.out.println("국어 -> "+hulk.getKor()+"점");
		System.out.println("영어 -> "+ hulk.getEng()+"점" );
		System.out.println("총점 -> "+ hulk.pointSum()+"점");
		System.out.println("평균 -> "+hulk.pointAvg()+"점");
		
		System.out.println(ironman.getName()+"의 성적표");
		System.out.println("국어 -> "+ironman.getKor()+"점");
		System.out.println("영어 -> "+ ironman.getEng()+"점" );
		System.out.println("총점 -> "+ ironman.pointSum()+"점");
		System.out.println("평균 -> "+ironman.pointAvg()+"점");
		
		System.out.println(thor.getName()+"의 성적표");
		System.out.println("국어 -> "+thor.getKor()+"점");
		System.out.println("영어 -> "+ thor.getEng()+"점" );
		System.out.println("총점 -> "+ thor.pointSum()+"점");
		System.out.println("평균 -> "+thor.pointAvg()+"점");
	}
}
