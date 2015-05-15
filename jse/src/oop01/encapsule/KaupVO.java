package oop01.encapsule;


public class KaupVO {
	private String name;
	private String msg;
	private double Height;
	private double Weight;
	private int idx;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return Height;
	}
	
	public void setHeight(double height) {
		this.Height = height;
	}
	
	public double getWeight() {
		return Weight;
	}
	
	public void setWeight(double weight) {
		this.Weight = weight;
	}
			
	public int getIdx() {
		return idx;
	}
	
	public void setIdx() {
		this.idx =(int)((getWeight()/(getHeight()*getHeight()))*10000);;
	}

	public void setMsg(){
		if(idx>30) { this.msg="��"; }
		else if(idx>24){ this.msg="��ü��"; }
		else if(idx>20){ this.msg="����"; }
		else if(idx>15){ this.msg="��ü��"; }
		else if(idx>13){ this.msg="����"; }
		else if(idx>10){ this.msg="�������"; }
		else{ this.msg="�Ҹ���";}
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void PrintingKoup() {
		System.out.println("�̸�->"+getName()+"\tŰ->"+getHeight()+"\t������->"+getWeight()+"\tī��������->"+getIdx()+"\t����->"+getMsg());
	}
	
}
