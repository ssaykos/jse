package cmm03.flow;

import java.util.Scanner;


public class No10_NomberMatch {
	public static void main(String[] args) {
		No10_NumberMatchV0 vo = new No10_NumberMatchV0();
		System.out.println("ÃÑ 3È¸ ½Ãµµ °¡´É");
		Scanner scanner= new Scanner(System.in);
		int result = 0;
		for (int i = 0; i < 3; i++) {
			try {
				int input = scanner.nextInt();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("¹®ÀÚ´Â ¾ÈµË´Ï´Ù.");
			}
			if(vo.getPlayer()==0){
				System.out.println("´Ù½Ã ÀÔ·ÂÇØÁÖ½Ê½Ã¿À");
			}else{
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}
			if(result ==1){
				System.out.println("¸Â­Ÿ½À´Ï´Ù."+"°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
				break;
			}else if(i==2){
				System.out.println("3È¸ ¸ðµÎ »ç¿ëÇÏ¼Ì½À´Ï´Ù"+"\nÆÐ¹èÇÏ¼Ë½À´Ï´Ù"+"\n°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
				break;
			}
		}
		
	}
}
