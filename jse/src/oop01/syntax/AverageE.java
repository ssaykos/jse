package oop01.syntax;

public class AverageE {

	public static void main(String[] args) {
		
		AverageEVO hulk = new AverageEVO("��ũ", 100, 100);
		AverageEVO ironman = new AverageEVO("���̾��", 90, 99);
		AverageEVO thor = new AverageEVO("�丣", 99, 100);
		
		System.out.println(hulk.getName()+"�� ����ǥ");
		System.out.println("�������� -> "+hulk.getKor()+"��");
		System.out.println("�������� -> "+hulk.getEng()+"��");
		System.out.println("�հ����� -> "+hulk.sum()+"��");
		System.out.println("������� -> "+hulk.avg()+"��");
		System.out.println(hulk.toString());
		
		System.out.println(ironman.getName()+"�� ����ǥ");
		System.out.println("�������� -> "+ironman.getKor()+"��");
		System.out.println("�������� -> "+ironman.getEng()+"��");
		System.out.println("�հ����� -> "+ironman.sum()+"��");
		System.out.println("������� -> "+ironman.avg()+"��");
		System.out.println(ironman.toString());
		
		System.out.println(thor.getName()+"�� ����ǥ");
		System.out.println("�������� -> "+thor.getKor()+"��");
		System.out.println("�������� -> "+thor.getEng()+"��");
		System.out.println("�հ����� -> "+thor.sum()+"��");
		System.out.println("������� -> "+thor.avg()+"��");
		System.out.println(thor.toString());
	}
}
