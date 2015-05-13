package cmm04.array;

public class No01_IntArrayDemo {
	public static void main(String[] args) {
//		int[] IntArr = new int[10]; // 아래와 같은 문장
		int[] IntArr;
		IntArr= new int[10];
		
		IntArr[0] = 100;
		IntArr[1] = 200;
		IntArr[2] = 300;
		IntArr[3] = 400;
		IntArr[4] = 500;
		IntArr[5] = 600;
		IntArr[6] = 700;
		IntArr[7] = 800;
		IntArr[8] = 900;
		IntArr[9] = 1000;
//		IntArr[10] = 1100;
//		IntArr[11] = 1200;
		
		for (int i = 0; i < IntArr.length; i++) {
			System.out.println("Element at index"+i+ ":"+IntArr[i]);
		}
	}
}
