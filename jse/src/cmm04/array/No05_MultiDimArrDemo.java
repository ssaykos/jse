package cmm04.array;

public class No05_MultiDimArrDemo {

	public static void main(String[] args) {
		int[][] score={
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int korTotal = 0;
		int engTotal=0;
		int mathTotal=0;
				
		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("====================");
		for (int i = 0; i < score.length; i++) {
			korTotal += score[i][0];
			engTotal+=score[i][1];
			mathTotal+=score[i][2];
			int sum=0;
			System.out.print(" "+(i+1)+"\t");
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(sum+"\t"+sum/(float)score[i].length);
			
		}
		System.out.println("=====================");
		//아래에서 국어,영어,수학 총점이 나오게 하세요.
		
		System.out.println("총점->"+korTotal+ " " + engTotal + " "+mathTotal);
	}
}
