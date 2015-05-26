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
			System.out.println("로그인에 성공하셧습니다.");
			condition=true;
		}else{
			System.out.println("잘못입력하셨습니다 다시 입력하여 주십시오.");
			condition=false;
		}
		
		return condition;
	}
	public void message() {
		System.out.println("message()메소드 호출 성공");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원가입 시작 ");
		System.out.print("이름 ->");
		String name = scanner.next();
		System.out.print("아이디->");
		String id = scanner.next();
		System.out.print("비번 ->");
		String pass=scanner.next();
		ClassDyagramDemo demo = new ClassDyagramDemo();
		demo.signupID(name, pass, id);
		System.out.println("계정이 생성되었습니다.");
		System.out.println("로그인 시작");
		boolean condition=false;
		while (!condition) {
			System.out.print("이름 ->");//로그인에
			name = scanner.next();
			System.out.print("아이디->");
			id = scanner.next();
			System.out.print("비번 ->");
			pass=scanner.next();
			condition=demo.join(name, pass, id);
		}
		demo.message();
		
		
	}
}
