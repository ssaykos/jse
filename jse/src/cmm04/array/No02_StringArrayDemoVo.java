package cmm04.array;


public class No02_StringArrayDemoVo {
	String[] juso= new String[3];
	
	No02_StringArrayDemoVo() {
		this("서울"," 종로"," 경복궁");
	}
	
	No02_StringArrayDemoVo(String a, String b, String c){
		this.juso[0] = a;
		this.juso[1] = b;
		this.juso[2] = c;
	}
	
	public void output() {
		for (int i = 0 ; i < juso.length ; i++) {
			System.out.print(juso[i]);
		}
	}

}