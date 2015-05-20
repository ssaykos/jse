package oop02.syntax;

public class AverageE {

	public static void main(String[] args) {
		
		AverageEVO hulk = new AverageEVO("헐크", 100, 100);
		AverageEVO ironman = new AverageEVO("아이언맨", 90, 99);
		AverageEVO thor = new AverageEVO("토르", 99, 100);
		
		System.out.println(hulk.getName()+"의 성적표");
		System.out.println("국어점수 -> "+hulk.getKor()+"점");
		System.out.println("영어점수 -> "+hulk.getEng()+"점");
		System.out.println("합계점수 -> "+hulk.sum()+"점");
		System.out.println("평균점수 -> "+hulk.avg()+"점");
		System.out.println(hulk.toString());
		
		System.out.println(ironman.getName()+"의 성적표");
		System.out.println("국어점수 -> "+ironman.getKor()+"점");
		System.out.println("영어점수 -> "+ironman.getEng()+"점");
		System.out.println("합계점수 -> "+ironman.sum()+"점");
		System.out.println("평균점수 -> "+ironman.avg()+"점");
		System.out.println(ironman.toString());
		
		System.out.println(thor.getName()+"의 성적표");
		System.out.println("국어점수 -> "+thor.getKor()+"점");
		System.out.println("영어점수 -> "+thor.getEng()+"점");
		System.out.println("합계점수 -> "+thor.sum()+"점");
		System.out.println("평균점수 -> "+thor.avg()+"점");
		System.out.println(thor.toString());
	}
}
