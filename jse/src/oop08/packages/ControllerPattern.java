package oop08.packages;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import oop02.encapsule.NumberMatchController;
import oop02.encapsule.RpsController;

public class ControllerPattern {
	public static void main(String[] args) {
		ControllerPattern cp = new ControllerPattern();
		RpsController rps = new RpsController();
		NumberMatchController num = new NumberMatchController();
		Scanner scanner = new Scanner(System.in);
		int flag= 0;
		do {
			System.out.println("���� ���μ��� ��ȣ�� �Է��ϼ���.");
			System.out.println("�Է��� ��ġ���� 0 �� �Է��ϼ���.");
			 flag = scanner.nextInt();
			 switch (flag) {
			case 1: rps.main(args);
				break;
			case 2: num.main(args);
				break;

			default:
				break;
			}
		} while (flag != 0);
	}
//	public int getNumScanner() {
//		int num=  0;
//		try {
//			num = Integer.parseInt(new BufferedReader(new InputStreamReader(arg0)));
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println(" getNumScanner() ���� �����߻�!");
//		}
//		return num;
//	}
}

