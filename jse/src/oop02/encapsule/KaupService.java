package oop02.encapsule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class KaupService {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		KaupVO ks = new KaupVO();
		
		System.out.println("ī���� ������ �����մϴ�. \nī���� ������ ����ϱ� ���� \n������ �̸� �׸��� Ű�� �����Ը� �Է��ϼ���.");
		
		System.out.print("�̸�->");
		String name=scanner.next();
		ks.setName(name);
		
		System.out.print("Ű(ex,1@@.@)->");
		double Height=scanner.nextDouble();
		ks.setHeight(Height);
		
		System.out.println("������(ex,@@.@)->");
		double Weight=scanner.nextDouble();
		ks.setWeight(Weight);
		
		System.out.println("ī���� ������ ����մϴ�.");
		ks.setIdx();
		
		System.out.println("ī���� ������ ����մϴ�.");
		ks.setMsg();
		ks.PrintingKoup();
//		String condition="0";
//		int a=0;
//		
//		KaupVO[] kouplist ={
//				new KaupVO()
//		};
//		while(condition.equalsIgnoreCase("0")){
//			if(!(condition).equalsIgnoreCase("0")){
//				break;
//			}
//			
//			System.out.print("�̸�->");
//			name=scanner.next();
//			kouplist[a].setName(name);
//			
//			System.out.print("Ű(ex,1@@.@)->");
//			Height=scanner.nextDouble();
//			kouplist[a].setHeight(Height);
//			
//			System.out.println("������(ex,@@.@)->");
//			Weight=scanner.nextDouble();
//			kouplist[a].setWeight(Weight);
//			a++;
//		}
//		for (int i = 0; i < args.length; i++) {
//			
//		}
//		
//		ArrayList<KaupVO> arrList = new ArrayList<KaupVO>();
//		int cmd = -1;
//		
//		
//		do{
//			System.out.println("�̸��� �Է��ϼ��� �����~");
//			String username = scanner.next();
//			System.out.println("Ű�� �����Ը� �Է����ּ���.");
//			String 
//		
//			
//		}while();
//		
//		
//		KaupVO arr;
//		int flow=1;
//		while(flow==1){
//			System.out.print("�Է��� ��� �Ͻðڽ��ϱ�?[(1)��,(2)�ƴϿ�]");
//			flow=scanner.nextInt();
//			arr.add(arr=new KaupVO());
//			if(flow==2){
//				break;
//			}
//			
//			
//		}
	}
}
