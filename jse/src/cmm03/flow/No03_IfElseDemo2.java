package cmm03.flow;


public class No03_IfElseDemo2 {

	public static void main(String[] args) {
		int kor =90,eng=85,sum=0;
		double avg =0.0;
		String msg="�޼���";
		sum = kor+eng;
		avg= sum/2;
		
		/*
		 	���ǿ� ���� ifó��
		 	��� 100�� �����̸� "���ʽ�" ����
		 	����� 70�̻��̸� "���� �հ�"
		 	�̸��̸� "������� ������."
		 */
		if(avg == 100){
			msg ="���� tothe��  �ٺ��ʽ� ���ޡ� ��";
		}else if(avg>=70){
			msg="�� �� �����հ� �� ��";
		}else{
			msg="�� ��_�� ����� ��_�� ��";
		}
		
		System.out.println("���� : " +kor);
		System.out.println("���� : " +eng);
		System.out.println("���� : " +sum);
		System.out.println(msg);
		
	}
}
