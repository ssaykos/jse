package cmm02.op;

public class No06_ConditionDemo {
	public static void main(String[] args) {
		int val01=1;
		int val02=2;
		
		if((val01==1) && (val02==2)){
			System.out.println("1번 값과 2번 값이 맞습니다.");
		}else if((val01!=1) || (val02!=2)){
			System.out.println("1번값과 2번값이 다릅니다.");
		}
	}
}
