package cmm03.flow;

import java.util.Scanner;


public class No10_NomberMatch {
	public static void main(String[] args) {
		No10_NumberMatchV0 vo = new No10_NumberMatchV0();
		System.out.println("�� 3ȸ �õ� ����");
		Scanner scanner= new Scanner(System.in);
		int result = 0;
		for (int i = 0; i < 3; i++) {
			try {
				int input = scanner.nextInt();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
			if(vo.getPlayer()==0){
				System.out.println("�ٽ� �Է����ֽʽÿ�");
			}else{
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}
			if(result ==1){
				System.out.println("�­����ϴ�."+"������ �����մϴ�.");
				break;
			}else if(i==2){
				System.out.println("3ȸ ��� ����ϼ̽��ϴ�"+"\n�й��ϼ˽��ϴ�"+"\n������ �����մϴ�.");
				break;
			}
		}
		
	}
}
