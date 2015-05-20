package oop02.syntax;


public class AverageEVO {

	//������ ��Ƽ�� -> ����Ʈ �����ڷ� ������ش�.
	private String name ;
	private int kor;
	private int eng;
	//���� ���͸� ��� ���ϰ� �����ڷ� ó��
	//��, avg()tot()�� �ۼ�.
	
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
		System.out.println(this.name+"�� ����ǥ");
		System.out.println("�������� -> "+this.kor+"��");
		System.out.println("�������� -> "+this.eng+"��");
		System.out.println("�հ����� -> "+(this.kor+this.eng)+"��");
		System.out.println("������� -> "+((this.kor+this.eng)/2d)+"��");
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
		return this.name+"�� ����ǥ\n�����->"+this.kor+"��\n�����->"+this.eng+"��\n�ջ�����"+(this.eng+this.kor)+"\n�������"+((this.eng+this.kor)/2d);
	}
}
