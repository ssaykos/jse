package oop01.encapsule;

public class RpsService {

	public int displayComVal() {
		/*��ǻ�Ͱ� �������� �߻���Ų�� 1-3����*/
		// TODO Auto-generated method stub
		return (int)((Math.random()*3)+1);
	}

	public void showWinner(int playerVal, int comVal) {
		// TODO Auto-generated method stub
		/*���ڸ� �����ִ� ����*/
		int result = playerVal - comVal+3;
		switch (result) {
		case 1:
		case 4:
			System.out.println("����->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-��ǻ��");
			System.out.println("����� �̰���ϴ�.");
			break;
		case 2:
		case 5:
			System.out.println("����->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-��ǻ��");
			System.out.println("����� �����ϴ�.");
			break;
		case 3:
			System.out.println("���̽��ϴ�.");
			System.out.println("����->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-��ǻ��");
			break;
		}
	}
	public String reShowWinner(int playerVal, int comVal) {
		// TODO Auto-generated method stub
		/*���ڸ� �����ִ� ����*/
		String msg ="";
		int result = playerVal - comVal+3;
		switch (result) {
		case 1:
		case 4:
			msg += "����->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-��ǻ��\n"+"����� �̰���ϴ�";
			break;
		case 2:
		case 5:
			msg+= "����->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-��ǻ��\n"+"����� �����ϴ�.";
			break;
		case 3:
			msg+= "����->"+showRpsVal(playerVal)+"vs"+showRpsVal(comVal)+"<-��ǻ��\n"+"���˽��ϴ�.";
			break;
		}
		return msg;
	}
	public String showRpsVal(int playerVal) {
		/* ���ڿ� �Ҵ�� ������������ ���ڷ� ��ȯ�ؼ� �����ִ� ��Ȱ*/
			switch (playerVal) {
			case 1:
				return "����";
			case 2:
				return "����";
			case 3:
				return "���ڱ�";
			default:
				RpsUtil util = new RpsUtil();
				util.showRange(1, 3);
//				util.showWrongType();
				break;
		}
		return "���������ϱ�?";
	}
}
