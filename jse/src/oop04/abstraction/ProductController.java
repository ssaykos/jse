package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInpo ci = new ComputerInpo();
		ci.setComputerInfo("�Ｚ", "����", "a-1234-5678", "dual-core", "8G", "500GB");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		ti.setTVInfo("LG", "Xĵ����", "x-1234","42��ġ","16:9");
		//�¸޼ҵ� ȣ��(TVȸ��:LG, ��ǰ�� :Xĵ����,��ǰ��ȣ x-1234,ȭ������� 42��ġ,ȭ����� 16:9
		ti.displayProductInfo();
	}
}

/*
productCompany);
System.out.println("��ǰ�� : " + this.productName);
System.out.println("������ȣ : "+this.productSerialID);
System.out.println("��ġ���� :"+this.inchInfo);
System.out.println("ȭ����� :"+this.screenRationInfo);
*/