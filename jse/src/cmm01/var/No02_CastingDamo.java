package cmm01.var;


public class No02_CastingDamo {
	public static void main(String[] args) {

/*
upcasting
= ��ȯ(conversion)
=promotion
=������(implict)�ڵ���ȯ 
;�ڹٰ� �����ϴ� �ڵ���ȯ���� �������� ����
������ Ÿ���� ǥ�������� ���� �ʿ��� ���� ������ ��ȯ �ɶ��� ����.
 */
		byte varByte =1 ;
		int varInt = 123;
		double varDou = 123.456;
		
		int upByte = (int)varByte; 
		double upInt = varInt;
		
		/*
		 Down- Casting
		 =ĳ����(Casting)
		 ���� ����ȯ
		 : ���α׷����� ��������� �����ϴ� Ÿ�Ժ�ȯ
		 ��Һ�ȯ�� �Ǵ� ���� �ݵ�� ��������� ĳ���� �Ͽ��� ��.
		 ����!!!!������ �ս��� �߻��Ҽ� �ִ�.(=���� �ȵȴ�.)
		 */
		float varFlo=123.456f;
		int downFlo=(int) varFlo;
		System.out.println("�ٿ�ĳ���� ����� : " + downFlo);
	}
	
}


