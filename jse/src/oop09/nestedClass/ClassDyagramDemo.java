package oop09.nestedClass;

import java.util.Scanner;


public class ClassDyagramDemo {
	private String name;
	private String pass;
	private String id;
	public void signupID(String name,String pass,String id) {
		this.name = name ;
		this.pass= pass;
		this.id = id;
	}
	public boolean join(String name , String pass,String id) {
		boolean condition=true;
		if (this.name.equalsIgnoreCase(name)&&this.id.equalsIgnoreCase(id)&&this.pass.equalsIgnoreCase(pass)) {
			System.out.println("�α��ο� �����ϼ˽��ϴ�.");
			condition=true;
		}else{
			System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ� �Է��Ͽ� �ֽʽÿ�.");
			condition=false;
		}
		
		return condition;
	}
	public void message() {
		System.out.println("message()�޼ҵ� ȣ�� ����");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ȸ������ ���� ");
		System.out.print("�̸� ->");
		String name = scanner.next();
		System.out.print("���̵�->");
		String id = scanner.next();
		System.out.print("��� ->");
		String pass=scanner.next();
		ClassDyagramDemo demo = new ClassDyagramDemo();
		demo.signupID(name, pass, id);
		System.out.println("������ �����Ǿ����ϴ�.");
		System.out.println("�α��� ����");
		boolean condition=false;
		while (!condition) {
			System.out.print("�̸� ->");//�α��ο�
			name = scanner.next();
			System.out.print("���̵�->");
			id = scanner.next();
			System.out.print("��� ->");
			pass=scanner.next();
			condition=demo.join(name, pass, id);
		}
		demo.message();
		
		
	}
}
