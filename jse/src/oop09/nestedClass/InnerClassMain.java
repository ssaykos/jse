package oop09.nestedClass;
/*
 	�ȵ���̵� �ڵ��� ����.. 
 	���ڵ��� �ȵ���̵嵵 ������� �ٲ�� ���� �߼�.
 */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m =new InnerClassMain();
//		m.getInnerClassInstance();
//		m.getInnerClassLocal();
//		m.getInnerClassStatic();	//�߾Ⱦ� // �ý��۾ƿ�����Ʈ ,�ý�����
//		m.getInnerClassAnonyServiceImpl();  // �ȵ���̵� �� ���� ������ ���// Ŭ������ �޼ҵ�ȭ
	}
	//ALT +SHIFT +m �޼ҵ� ���� ����Ű  // �����丵  => Ŭ������ �޼ҵ�ȭ�� �ϰ� ����ƽ�� ����.(����->�޸� ������ ���߱� ���ؼ�.)
												// �ν��Ͻ��� �޼ҵ�ȭ
	
	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl  inn=new InnerClassAnonyServiceImpl();// �͸�Ŭ���� ��� ���� �ٷ� ������ Ŭ����
		inn.print();
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();//����ƽ���� Ŭ������ �ܺ� Ŭ������ ���� ���� Ŭ������ ������ ����
		inn.printData();
	}
	public void getInnerClassLocal() {//��ü��=������ �޼ҵ��� ���� ������ ��к����� �ʼ��ΰ�� ���ȴ�.
		InnerClassLocal outer = new InnerClassLocal();
		outer.innreTest(1000);
	}
	public void getInnerClassInstance() {//��ü��
		InnerClassInstance.Inner inn=new InnerClassInstance().new Inner();//�ܺ� Ŭ������ �����ڸ� ���� ���� ������ ����
		//Outer(�ٱ� Ŭ����).����  ����= new �ٱ�Ŭ���� ������ . ���� ������.
		inn.printData(); // �ý���. �ƿ�. ����Ʈ �� ����ѰŶ�� ���� �ض�..
	}
}
