package oop04.abstraction;

public class ComputerInpo extends ProductInfo{

	protected String cpuInfo;
	protected String ramInfo;
	protected String hddInpo;
	
	@Override
	public void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("����ȸ�� : "+this.productCompany);
		System.out.println("��ǰ�� : " + this.productName);
		System.out.println("������ȣ : "+this.productSerialID);
		System.out.println("cpu���� : "+this.cpuInfo);
		System.out.println("���θ޸� ���� :"+this.ramInfo);
		System.out.println("�ϵ��ũ ���� :"+this.hddInpo);
	}
	public void setComputerInfo(String productCompany, String productName, String productSerialID, String cpuInfo, String ramInfo, String hddInfo) {
		super.setProductInpo(productCompany, productName, productSerialID);
		this.cpuInfo= cpuInfo;
		this.ramInfo = ramInfo;
		this.hddInpo= hddInfo;
	}
	
}
