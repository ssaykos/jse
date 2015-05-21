package oop04.abstraction;


public class ComputerInfoClass extends ProductInfoClass{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo() {
		//����
		super.displayInfo();
		System.out.println("CPU :"+this.cpu);
		System.out.println("RAM:"+this.ram);
		System.out.println("hdd:"+this.hdd);
		/*
		 	ProductInfoClass�� �ִ� �ɺ��� private �̹Ƿ� ������ �Ұ���.
		 	���� �߻� Ŭ������ protected ���� ���� �����޴µ� ������ private���� �����ִ�.
		 	�׷��� �ɺ��� ���� ������ü�� �θ� �ִ� displayInfo() �� ȣ���ؼ� ó���Ѵ�.
		 */
	}
	public void setInfo(String company, String name, String sid, String cpu, String ram, String hdd) {
		//�����ϼ���
		super.setInfo(company, name, sid);
		this.cpu= cpu;
		this.ram=ram;
		this.hdd=hdd;
		/*
		 	�Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super�� ���� �θ� �޼ҵ��� �Ķ���ͷ� ������ �ٷ� set�Ѵ�.
		 	�ɺ��� ������ �θ��ڽ� ���迡�� �����ϹǷ�, �θ��� �ɺ��� ���� ���� ���� ����������.
		 */
	}
}
