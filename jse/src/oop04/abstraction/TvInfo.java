package oop04.abstraction;


public class TvInfo extends ProductInfo{

	protected String inchInfo;
	protected String screenRationInfo;
	
	@Override
	public void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("����ȸ�� : "+this.productCompany);
		System.out.println("��ǰ�� : " + this.productName);
		System.out.println("������ȣ : "+this.productSerialID);
		System.out.println("��ġ���� :"+this.inchInfo);
		System.out.println("ȭ����� :"+this.screenRationInfo);
	}

	public void setTVInfo(String productCompany,String productName, String productSerialID,String inchInfo, String screenRationInfo) {
		//���� ������ ���θ޼ҵ带 ���� ��ֱ�.
		super.setProductInpo(productCompany, productName, productSerialID);
		this.inchInfo= inchInfo;
		this.screenRationInfo = screenRationInfo;
	}
}
