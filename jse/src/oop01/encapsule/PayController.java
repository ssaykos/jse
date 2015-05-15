package oop01.encapsule;

import java.util.Scanner;


public class PayController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PayService payService = new PayService();
		System.out.println("급여내역에 대한 계산을 시작합니다");
		System.out.print("이름 -> ");
		String name = scanner.nextLine();
		System.out.print("본봉 -> ");
		int salary=scanner.nextInt();
		payService.input(name, salary);
		
		/*
		 	공식..
		 	income = salay - tax;
		 	
		 	PayVO : get.set
		 	PayService: 계산로직
		 	PayController = Paymain: 입출력
		 	
		 	세 개로 분할 하고
		 	이름과 급여(셀러리)
		 	세율을 뺀 소득을 구하는 로직.
		 */
		System.out.println(" ===== 급여내역 ===== ");
		System.out.println(" 성명 -> "+name);
		System.out.println(" 본봉 -> "+salary+" 만원");
		System.out.println(" 세금 -> "+payService.tax()+"%");
		System.out.println(" 실수령액 -> "+ payService.calcPay()+" 만원");//내가만든고.
		
		//선생님의 예제
		System.out.println(" ===== 급여내역 ===== ");
		System.out.println(" 성명 -> "+name);
		System.out.println(" 본봉 -> "+salary+" 만원");
		System.out.println(" 세율 -> "+payService.showTax());
		/*
		 * 아래 클레임용
		 */
		System.out.println(" 세금 -> "+payService.tax()+"%");//이건 내가 만든고;
		/*
		 * 위 클레임용
		 */
		System.out.println(" 실수령액 -> "+ payService.calculateIncom(name, salary)+" 만원");
	}
}
