package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		//int kor = 90; //  ->int kor;(���� = Declartion) �� kor =90;(�Ҵ� = Allocation) �� ��ģ���̴�. ����� ���ÿ� �ʱ�ȭ �Ѱ��̴�.
		// �ʱ�ȭ = ������ ���� �ε� �Ǵ¼���//�޸𸮻����� ���ÿ� ����ִ°�.
		// �Ҵ� =�ϵ忡�� �޸𸮷� ���� �ö� ���� ��.
		int kor =90, eng = 85 , sum = 0;
		sum = kor+eng;
		System.out.print("����ó��\n");
		System.out.println("����\t����\t�հ�");
		System.out.println(kor+"\t"+ eng+"\t"+sum);
		
	}
}
