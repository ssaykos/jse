package oop01.encapsule;

public class RpsService {

	public int displayComVal() {
		/*컴퓨터가 랜덤으로 발생시킨수 1-3까지*/
		// TODO Auto-generated method stub
		return (int)((Math.random()*3)+1);
	}

	public void showWinner(int playerVal, int comVal) {
		// TODO Auto-generated method stub
		/*승자를 보여주는 로직*/
		int result = playerVal - comVal+3;
		switch (result) {
		case 1:
		case 4:
			System.out.println("유저->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-컴퓨터");
			System.out.println("당신이 이겼습니다.");
			break;
		case 2:
		case 5:
			System.out.println("유저->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-컴퓨터");
			System.out.println("당신이 졌습니다.");
			break;
		case 3:
			System.out.println("비기셨습니다.");
			System.out.println("유저->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-컴퓨터");
			break;
		}
	}
	public String reShowWinner(int playerVal, int comVal) {
		// TODO Auto-generated method stub
		/*승자를 보여주는 로직*/
		String msg ="";
		int result = playerVal - comVal+3;
		switch (result) {
		case 1:
		case 4:
			msg += "유저->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-컴퓨터\n"+"당신이 이겼습니다";
			break;
		case 2:
		case 5:
			msg+= "유저->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-컴퓨터\n"+"당신이 졌습니다.";
			break;
		case 3:
			msg+= "유저->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-컴퓨터\n"+"비기셧습니다.";
			break;
		}
		return msg;
	}
	public String showRpsVal(int playerVal) {
		/* 숫자에 할당된 가위바위보를 문자로 전환해서 보여주는 역활*/
			switch (playerVal) {
			case 1:
				return "가위";
			case 2:
				return "바위";
			case 3:
				return "보자기";
			default:
				RpsUtil util = new RpsUtil();
				util.showRange(1, 3);
//				util.showWrongType();
				break;
		}
		return "무슨버그일까?";
	}
}
