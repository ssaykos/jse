package oop02.syntax;


public class AverageEVO {

	//개발자 에티켓 -> 디폴트 생성자로 만들어준다.
	private String name ;
	private int kor;
	private int eng;
	//겟터 셋터를 사용 안하고 생성자로 처리
	//단, avg()tot()은 작성.
	
	public AverageEVO() {
		// TODO Auto-generated constructor stub
	}
	
	AverageEVO(String name, int kor, int eng){
		this.name= name;
		this.kor= kor;
		this.eng=eng;
		outputPoint();
	}
	private void outputPoint(){
		System.out.println(this.name+"의 성적표");
		System.out.println("국어점수 -> "+this.kor+"점");
		System.out.println("영어점수 -> "+this.eng+"점");
		System.out.println("합계점수 -> "+(this.kor+this.eng)+"점");
		System.out.println("평균점수 -> "+((this.kor+this.eng)/2d)+"점");
	}
	
	public int sum(){
		return this.eng+this.kor;
	}
	public double avg(){
		return (this.eng+this.kor)/2d;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	@Override
	public String toString() {
		return this.name+"의 성적표\n국어성적->"+this.kor+"점\n영어성적->"+this.eng+"점\n합산점수"+(this.eng+this.kor)+"\n평균점수"+((this.eng+this.kor)/2d);
	}
}
