package cmm04.array;

public class No03_ForLoopArrayVo {

	int [] arr= {1,2,3,4,5};
	int result = 0;
	private int kor,eng,math,skill,scien;
	private double avg;
	
	public void output() {
//	
//		Scanner scanner= new Scanner(System.in);

//		for (int i : arr) {
//			System.out.println("\t"+i);
//		}
		/*
		 *  1���� 5������ ���� ���ϼ���.
		 */
		
//		System.out.println("5���� ���ڸ� �Է¹޾� ���ص帳�ϴ�.");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("�� ��" +(1+i)+"��° ���ڸ� �Է��ϼ���->");	
//			arr[i]=scanner.nextInt();
//		}
				
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"��°�� ���� -> "+result+"+"+arr[i]+"=");
			result+=arr[i];
			System.out.println(result);			
		} 
		
		System.out.println(" 1������ 5������ ����:"+result);
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSkill() {
		return skill;
	}
	
	public void setSkill(int skill) {
		this.skill = skill;
	}
	
	public int getScien() {
		return scien;
	}
	
	public void setScien(int scien) {
		this.scien = scien;
	}

	public void add(int a1,int a2,int a3,int a4,int a5) {
		arr[0]=a1;
		arr[1]=a2;
		arr[2]=a3;
		arr[3]=a4;
		arr[4]=a5;
	}
	
	public void reset() {
		result=0;
		avg=0;
	}
	
	public void calc() {
		result = kor+eng+scien+math+skill;
		avg= result/5;
	}
	
	public void output1() {
		System.out.println("�ش��л��� ������ "+result);
		System.out.println("�ش��л��� ����� "+avg);
	}
	
}