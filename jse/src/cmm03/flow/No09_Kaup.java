package cmm03.flow;

import java.util.Scanner;


public class No09_Kaup {
	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
		
	No09_Kaup() {
		this(0,0);
	}
	
	No09_Kaup(double i, double j) {
		//this.height = i;
		//this.weight = j;
//		this.idx = (int)((weight/(height*height))*10000);
		setHeight(height);
		setWeight(weight);
		calcIdx();
		outPut();
	}
	
	private void calcIdx() {
		this.idx = (int)((getWeight()/(getHeight()*getHeight()))*10000);
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		System.out.print("Ű->");
		this.height = scanner.nextDouble();
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		System.out.println("����->");
		this.weight = scanner.nextDouble();
	}
	
	String getMsg(){
		String msg;
		if(idx>30) { msg="��"; }
		else if(idx>24){ msg="��ü��"; }
		else if(idx>20){ msg="����"; }
		else if(idx>15){ msg="��ü��"; }
		else if(idx>13){ msg="����"; }
		else if(idx>10){ msg="�������"; }
		else{msg="�Ҹ���";}
		return msg;
	}

	@Override
	public String toString() {
		return "ī�������� [Ű=" + getHeight() + "cm, ������=" + getWeight()
				+ "kg, ī��������=" + idx + "%, �������="+getMsg()+"]";
	}
	
	private void outPut() {
		System.out.println(toString());
	}
	public static void main(String[] args) {
		No09_Kaup kaupre = new No09_Kaup();
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Ű�� �Է��ϼ���");
//		double height =scanner.nextDouble();
//		
//		System.out.println("�����Ը� �Է��ϼ���");
//		double weight =scanner.nextDouble();
//		
//		No09_Kaup kaup =new No09_Kaup(height, weight);
//		System.out.println(kaup.toString());
		
		System.out.println("�Ϸ�");
	}
	
}
