package cmm03.flow;

import java.util.Scanner;


public class No10_NomberMatch {
	public static void main(String[] args) {
		No10_NumberMatchV0 vo = new No10_NumberMatchV0();
		System.out.println("총 3회 시도 가능");
		Scanner scanner= new Scanner(System.in);
		int result = 0;
		for (int i = 0; i < 3; i++) {
			try {
				int input = scanner.nextInt();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("문자는 안됩니다.");
			}
			if(vo.getPlayer()==0){
				System.out.println("다시 입력해주십시오");
			}else{
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}
			if(result ==1){
				System.out.println("맞췃습니다."+"게임을 종료합니다.");
				break;
			}else if(i==2){
				System.out.println("3회 모두 사용하셨습니다"+"\n패배하셧습니다"+"\n게임을 종료합니다.");
				break;
			}
		}
		
	}
}
