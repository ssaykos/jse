package oop02.encapsule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class KaupService {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		KaupVO ks = new KaupVO();
		
		System.out.println("카우프 지수를 시작합니다. \n카우프 지수를 계산하기 위한 \n고객님의 이름 그리고 키와 몸무게를 입력하세요.");
		
		System.out.print("이름->");
		String name=scanner.next();
		ks.setName(name);
		
		System.out.print("키(ex,1@@.@)->");
		double Height=scanner.nextDouble();
		ks.setHeight(Height);
		
		System.out.println("몸무게(ex,@@.@)->");
		double Weight=scanner.nextDouble();
		ks.setWeight(Weight);
		
		System.out.println("카우프 지수를 계산합니다.");
		ks.setIdx();
		
		System.out.println("카우프 지수를 출력합니다.");
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
//			System.out.print("이름->");
//			name=scanner.next();
//			kouplist[a].setName(name);
//			
//			System.out.print("키(ex,1@@.@)->");
//			Height=scanner.nextDouble();
//			kouplist[a].setHeight(Height);
//			
//			System.out.println("몸무게(ex,@@.@)->");
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
//			System.out.println("이름을 입력하세요 블라블라~");
//			String username = scanner.next();
//			System.out.println("키와 몸무게를 입력해주세요.");
//			String 
//		
//			
//		}while();
//		
//		
//		KaupVO arr;
//		int flow=1;
//		while(flow==1){
//			System.out.print("입력을 계속 하시겠습니까?[(1)예,(2)아니오]");
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
