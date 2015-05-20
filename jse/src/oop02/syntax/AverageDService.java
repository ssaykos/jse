package oop02.syntax;

public class AverageDService {

	AverageDVO thor = new AverageDVO();
	AverageDVO ironman = new AverageDVO();
	AverageDVO hulk = new AverageDVO();
	
	public void allInput(){
		hulk.setEng(95);
		hulk.setKor(80);
		hulk.setName("��ũ¥��");
		
		ironman.setEng(100);
		ironman.setKor(33);
		ironman.setName("���̾��");
		
		thor.setName("�丣¥��");
		thor.setEng(99);
		thor.setKor(80);
	}
	public void allOutput(){
		System.out.println(hulk.getName()+"�� ����ǥ");
		System.out.println("���� -> "+hulk.getKor()+"��");
		System.out.println("���� -> "+ hulk.getEng()+"��" );
		System.out.println("���� -> "+ pointSum(hulk.getEng(),hulk.getKor())+"��");
		System.out.println("��� -> "+pointAvg(hulk.getEng(),hulk.getKor())+"��");
		
		System.out.println(ironman.getName()+"�� ����ǥ");
		System.out.println("���� -> "+ironman.getKor()+"��");
		System.out.println("���� -> "+ ironman.getEng()+"��" );
		System.out.println("���� -> "+ pointSum(ironman.getEng(),ironman.getKor())+"��");
		System.out.println("��� -> "+pointAvg(ironman.getEng(), ironman.getKor())+"��");
		
		System.out.println(thor.getName()+"�� ����ǥ");
		System.out.println("���� -> "+thor.getKor()+"��");
		System.out.println("���� -> "+ thor.getEng()+"��" );
		System.out.println("���� -> "+ pointSum(thor.getEng(),thor.getKor())+"��");
		System.out.println("��� -> "+pointAvg(thor.getEng(), thor.getKor())+"��");
	}
	public int pointSum(int kor, int eng){
		return kor+eng;
	}
	public double pointAvg(int kor, int eng){
		return (kor+eng)/2d;
	}
}
