package oop01.syntax;

public class AverageB {

	String name;
	int kor;
	int eng;
	
	/*�޼ҵ带 ���⿡ �����ؼ� �޼ҵ��� ��üȭ ���ּ���.*/
	
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
		
		hulk.name="��ũ";
		hulk.kor=100;
		hulk.eng=100;
		
		ironman.name ="���̾��";
		ironman.kor=30;
		ironman.eng=90;
		
		thor.name="�丣";
		thor.kor=90;
		thor.eng=95;
		
		System.out.println(hulk.name+"�� ����ǥ");
		System.out.println("���� -> "+hulk.kor);
		System.out.println("���� -> "+ hulk.eng );
		System.out.println("���� -> "+ hulk.total(hulk.kor,hulk.eng));
		System.out.println("��� -> "+hulk.avg(hulk.kor,hulk.eng));
		
		System.out.println(ironman.name+"�� ����ǥ");
		System.out.println("���� -> "+ironman.kor);
		System.out.println("���� -> "+ ironman.eng );
		System.out.println("���� -> "+ thor.total(ironman.kor,ironman.eng));
		System.out.println("��� -> "+thor.avg(ironman.kor,ironman.eng));
		
		System.out.println(thor.name+"�� ����ǥ");
		System.out.println("���� -> "+thor.kor);
		System.out.println("���� -> "+ thor.eng );
		System.out.println("���� -> "+ thor.total(thor.kor,thor.eng));
		System.out.println("��� -> "+thor.avg(thor.kor,thor.eng));
	}
}
