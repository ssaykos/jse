package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
	
		System.out.println("ī�� ���� :"+CardVO.height);
		System.out.println("ī�� ���� :"+CardVO.width);
		
		//�ν��Ͻ��� �����Ͽ� �Ʒ� ���ó�� 
		//��µǵ��� ���ּ���.
		
		CardVO player = new CardVO("��Ʈ", 3);
		CardVO computer = new CardVO("�����̽�", 5);
		
		System.out.println("�÷��̾�� "+player.getKind()+player.getNumber()+"�̰�");//heart , space
		System.out.println("��ǻ�Ͱ� "+computer.getKind()+player.getNumber()+"��  ��ǻ�Ͱ� �̰���ϴ�.");
		
		System.out.println(" �÷��̾�� "+player.toString()+"�̰�");
		System.out.println("��ǻ�Ͱ� "+computer.toString()+"��  ��ǻ�Ͱ� �̰���ϴ�.");
		
	}
}
