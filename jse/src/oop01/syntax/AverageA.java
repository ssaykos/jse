package oop01.syntax;


public class AverageA {
	String name;
	int kor,eng;
	public static void main(String[] args) {
		//tot,avg �̸��� ���������� ���� �ϰ� �Ʒ��� ���� ���.
		System.out.println("===��ũ�� ����ǥ===");
		System.out.println("���� : 100��");
		System.out.println("���� : 70��");
		System.out.println("���� : 170��");
		System.out.println("��� : 85��");
		//���̾�
		// �丣
		
		AverageA hulpoint = new AverageA();
		hulpoint.name="��ũ";
		hulpoint.kor=100;
		hulpoint.eng=100;
		int total = hulpoint.kor+hulpoint.eng;
		double avg= total/2;
		
		System.out.println(hulpoint.name+"�� ����ǥ");
		System.out.println("���� -> "+hulpoint.kor);
		System.out.println("���� -> "+hulpoint.eng);
		System.out.println("���� -> "+total);
		System.out.println("��� -> "+avg);
		
		AverageA ironpoint = new AverageA();
		ironpoint.name ="���̾��";
		ironpoint.kor=30;
		ironpoint.eng=90;
		total= ironpoint.eng+ironpoint.kor;
		avg=total/2;
		System.out.println(ironpoint.name+"�� ����ǥ");
		System.out.println("���� -> "+ironpoint.kor);
		System.out.println("���� -> "+ironpoint.eng);
		System.out.println("���� -> "+total);
		System.out.println("��� -> "+avg);
		
		AverageA thor = new AverageA();
		thor.name="�丣";
		thor.kor=90;
		thor.eng=95;
		total= thor.eng+thor.kor;
		avg=total/2d;
		System.out.println(thor.name+"�� ����ǥ");
		System.out.println("���� -> "+thor.kor);
		System.out.println("���� -> "+ thor.eng );
		System.out.println("���� -> "+ total);
		System.out.println("��� -> "+avg);
		
	}
}
