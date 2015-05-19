package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
	
		System.out.println("카드 높이 :"+CardVO.height);
		System.out.println("카드 넓이 :"+CardVO.width);
		
		//인스턴스를 생성하여 아래 결과처럼 
		//출력되도록 해주세요.
		
		CardVO player = new CardVO("하트", 3);
		CardVO computer = new CardVO("스페이스", 5);
		
		System.out.println("플레이어는 "+player.getKind()+player.getNumber()+"이고");//heart , space
		System.out.println("컴퓨터가 "+computer.getKind()+player.getNumber()+"라서  컴퓨터가 이겻습니다.");
		
		System.out.println(" 플레이어는 "+player.toString()+"이고");
		System.out.println("컴퓨터가 "+computer.toString()+"라서  컴퓨터가 이겻습니다.");
		
	}
}
