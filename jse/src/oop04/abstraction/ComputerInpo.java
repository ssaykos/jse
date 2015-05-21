package oop04.abstraction;

public class ComputerInpo extends ProductInfo{

	protected String cpuInfo;
	protected String ramInfo;
	protected String hddInpo;
	
	@Override
	public void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("제조회사 : "+this.productCompany);
		System.out.println("제품명 : " + this.productName);
		System.out.println("고유번호 : "+this.productSerialID);
		System.out.println("cpu정보 : "+this.cpuInfo);
		System.out.println("메인메모리 정보 :"+this.ramInfo);
		System.out.println("하드디스크 정보 :"+this.hddInpo);
	}
	public void setComputerInfo(String productCompany, String productName, String productSerialID, String cpuInfo, String ramInfo, String hddInfo) {
		super.setProductInpo(productCompany, productName, productSerialID);
		this.cpuInfo= cpuInfo;
		this.ramInfo = ramInfo;
		this.hddInpo= hddInfo;
	}
	
}
