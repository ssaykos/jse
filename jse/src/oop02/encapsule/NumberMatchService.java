package oop02.encapsule;



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
			System.out.println(vo.getPlayer()+"정답!!");
			result = 1;
		}else{
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은" + vo.getCom()+"입니다.");
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
				System.out.print(count+"회->");
				input=getInput();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("문자는 안됩니다.");
			}
			if(vo.getPlayer()==0){
				System.out.println("다시 입력해주십시오");
			}else{
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
			}
			if(result ==1){
				System.out.println("맞췃습니다."+"게임을 종료합니다.");
				condition = 1;
//				break;
			}else if(count==3){
				System.out.println("3회 모두 사용하셨습니다"+"\n패배하셧습니다"+"\n게임을 종료합니다.");
//				break;
			}
//		}
			return condition;
	}
}
