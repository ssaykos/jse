package cmm03.flow;

import java.util.Scanner;

public class No04_SwitchCaseDemo {

	public static void main(String[] args) {
		System.out.println("평균 점수를 입력하세요");
		Scanner scanner= new Scanner(System.in);
		int avg;
		do{
			System.out.println("평균 점수의 값은 0~100점이어야 합니다 /n 다시 입력하세요");
			avg= scanner.nextInt();
		}while(avg>100||avg<0);

//		avg= scanner.nextInt();
//		while(avg>100||avg<0){
//			avg= scanner.nextInt();
//		}

//		while(true){			
//			if(avg>100||avg<0){
//				System.out.println("평균 점수의 값은 0~100점이어야 합니다 /n 다시 입력하세요");
//				avg= scanner.nextInt();
//			}else{
//				break;
//			}
//		}

		String result = "";
//		if(avg>=70){
//			result = "합 to the 격";
//		}
		if(avg >=70){
			result = "합 to the 격";
		}else {
			result ="재시험";
		}
		//평균 점수에 따라서 비교 학점구하기
		char grade = 'F';
//		if(avg>=90){grade = 'A';}
//		else if(avg >= 80){grade ='B';}
//		else if(avg>=70){grade ='C';}
//		else if(avg>=60){grade ='D';}
//		else {grade ='F';}
//		//위의 이프문장을 스위치로 바꾸시오
//		System.out.println("귀하는"+result+"이며,"+grade+"입니다.");
		
		int condition=avg/10;
		switch(condition){
		case 10:	{	grade='A';	break;	}
		case 9:	{	grade='A';	break;	}
		case 8:	{	grade='B';	break;	}
		case 7:	{	grade='C';	break;	}
		case 6:	{	grade='D';	break;	}
		default:	{	grade='F';	break;	}
		}
		System.out.println("귀하는"+result+"이며,"+grade+"입니다.");
	}
}
