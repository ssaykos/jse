package oop02.syntax;


public class AverageC {
	
	public static void main(String[] args) {
		AverageVO hulk = new AverageVO();
		AverageVO ironman = new AverageVO();
		AverageVO thor = new AverageVO();
		
		hulk.setEng(95);
		hulk.setKor(80);
		hulk.setName("��ũ¥��");
		
		ironman.setEng(100);
		ironman.setKor(33);
		ironman.setName("���̾��");
		
		thor.setName("�丣¥��");
		thor.setEng(99);
		thor.setKor(80);
		
		System.out.println(hulk.getName()+"�� ����ǥ");
		System.out.println("���� -> "+hulk.getKor()+"��");
		System.out.println("���� -> "+ hulk.getEng()+"��" );
		System.out.println("���� -> "+ hulk.pointSum()+"��");
		System.out.println("��� -> "+hulk.pointAvg()+"��");
		
		System.out.println(ironman.getName()+"�� ����ǥ");
		System.out.println("���� -> "+ironman.getKor()+"��");
		System.out.println("���� -> "+ ironman.getEng()+"��" );
		System.out.println("���� -> "+ ironman.pointSum()+"��");
		System.out.println("��� -> "+ironman.pointAvg()+"��");
		
		System.out.println(thor.getName()+"�� ����ǥ");
		System.out.println("���� -> "+thor.getKor()+"��");
		System.out.println("���� -> "+ thor.getEng()+"��" );
		System.out.println("���� -> "+ thor.pointSum()+"��");
		System.out.println("��� -> "+thor.pointAvg()+"��");
	}
}
