package oop04.abstraction;


public class ProductClassController {
	public static void main(String[] args) {
		ComputerInfoClass ci = new ComputerInfoClass();
		ci.setInfo("»ï¼º", "¼¾½º", "a-1234", "µà¾óÄÚ¾î", "2GB", "500GB");
		
		TvInfoClass ti =new TvInfoClass();
		ti.setInfo("LG", "x-Äµ¹ö½º", "lg-1234", "42ÀÎÄ¡", "LCD");
		
		ProductInterface pii[] = new ProductInterface[2];
		
		pii[0]=ci;
		pii[1]=ti;
		for (int i = 0; i < pii.length; i++) {
			pii[i].displayInfo();
			System.out.println();
		}
	}
}
