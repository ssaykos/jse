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
			System.out.println(vo.getPlayer()+"����!!");
			result = 1;
		}else{
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ����" + vo.getCom()+"�Դϴ�.");
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
				System.out.print(count+"ȸ->");
				input=getInput();
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
			if(vo.getPlayer()==0){
				System.out.println("�ٽ� �Է����ֽʽÿ�");
			}else{
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
			}
			if(result ==1){
				System.out.println("�­����ϴ�."+"������ �����մϴ�.");
				condition = 1;
//				break;
			}else if(count==3){
				System.out.println("3ȸ ��� ����ϼ̽��ϴ�"+"\n�й��ϼ˽��ϴ�"+"\n������ �����մϴ�.");
//				break;
			}
//		}
			return condition;
	}
}
