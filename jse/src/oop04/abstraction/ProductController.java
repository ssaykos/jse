package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInpo ci = new ComputerInpo();
		ci.setComputerInfo("삼성", "센스", "a-1234-5678", "dual-core", "8G", "500GB");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		ti.setTVInfo("LG", "X캔버스", "x-1234","42인치","16:9");
		//셋메소드 호출(TV회사:LG, 제품명 :X캔버스,제품번호 x-1234,화면사이즈 42인치,화면비율 16:9
		ti.displayProductInfo();
	}
}

/*
productCompany);
System.out.println("제품명 : " + this.productName);
System.out.println("고유번호 : "+this.productSerialID);
System.out.println("인치정보 :"+this.inchInfo);
System.out.println("화면비율 :"+this.screenRationInfo);
*/