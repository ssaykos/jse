package cmm03.flow;


public class No03_IfElseDemo2 {

	public static void main(String[] args) {
		int kor =90,eng=85,sum=0;
		double avg =0.0;
		String msg="메세지";
		sum = kor+eng;
		avg= sum/2;
		
		/*
		 	조건에 따라 if처리
		 	평균 100점 만점이면 "보너스" 지급
		 	평균이 70이상이면 "시험 합격"
		 	미만이면 "재시험을 보세요."
		 */
		if(avg == 100){
			msg ="지전 tothe축  ☆보너스 지급☆ 하";
		}else if(avg>=70){
			msg="축 ☆ 시험합격 ☆ 하";
		}else{
			msg="애 ㅠ_ㅠ 재시험 ㅠ_ㅠ 도";
		}
		
		System.out.println("국어 : " +kor);
		System.out.println("영어 : " +eng);
		System.out.println("총점 : " +sum);
		System.out.println(msg);
		
	}
}
