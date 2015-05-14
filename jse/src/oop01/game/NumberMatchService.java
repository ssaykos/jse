package oop01.game;



public class NumberMatchService {

	NumberMatchVO vo = new NumberMatchVO();
	NumberMatchController con = new NumberMatchController();
	
	private int input;
	private int result = 0;
	int count = 0;
	private int condition=0;
	
	public int game(int com, int player) {
		int result;
		if(vo.getPlayer()==vo.getCom()){
			System.out.println(vo.getPlayer()+"Á¤´ä!!");
			result = 1;
		}else{
			System.out.println("Æ²·È½À´Ï´Ù.");
			System.out.println("ÄÄÇ»ÅÍ°¡ ¼±ÅÃÇÑ °ªÀº" + vo.getCom()+"ÀÔ´Ï´Ù.");
			result = 0;
		}
		return result;
	}
	
	public void setInput(int input) {
		this.input= input;
	}
	
	public int getInput() {
		return input;
	}
	public int GameControl() {
			
//		for (int i = 0; i < 3; i++) {
			try {
				count++;
				System.out.print(count+"È¸->");
				input=getInput();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("¹®ÀÚ´Â ¾ÈµË´Ï´Ù.");
			}
			if(vo.getPlayer()==0){
				System.out.println("´Ù½Ã ÀÔ·ÂÇØÁÖ½Ê½Ã¿À");
			}else{
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
			}
			if(result ==1){
				System.out.println("¸Â­Ÿ½À´Ï´Ù."+"°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
				condition = 1;
//				break;
			}else if(count==3){
				System.out.println("3È¸ ¸ğµÎ »ç¿ëÇÏ¼Ì½À´Ï´Ù"+"\nÆĞ¹èÇÏ¼Ë½À´Ï´Ù"+"\n°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
//				break;
			}
//		}
			return condition;
	}
}
