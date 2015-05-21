package oop04.abstraction;


public class TvInfo extends ProductInfo{

	protected String inchInfo;
	protected String screenRationInfo;
	
	@Override
	public void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("제조회사 : "+this.productCompany);
		System.out.println("제품명 : " + this.productName);
		System.out.println("고유번호 : "+this.productSerialID);
		System.out.println("인치정보 :"+this.inchInfo);
		System.out.println("화면비율 :"+this.screenRationInfo);
	}

	public void setTVInfo(String productCompany,String productName, String productSerialID,String inchInfo, String screenRationInfo) {
		//내부 정보는 메인메소드를 보고 써넣기.
		super.setProductInpo(productCompany, productName, productSerialID);
		this.inchInfo= inchInfo;
		this.screenRationInfo = screenRationInfo;
	}
}
