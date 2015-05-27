package oop02.encapsule;


public class GameRpsValueController {

	public String rpsChangeNumber(int numberRps) {
		String rps="";
		switch (numberRps) {
		case 1:
			rps="가위";
			break;
		case 2:
			rps="바위";
			break;
		case 3:
			rps="보";
			break;
		}
		return rps;
	}
	
	/*
	 * 사용자가 입력한 값이 체크후 체크가 통과 하거나 컴퓨터의 난수를 
	 * 디비역활인 VO클래스에 접속해서 
	 * 입력된 정수값을 
	 * 가위/바위/보 3개 중 하나로 스트링 값이 나오도록 게터 세터 이용하는 컨트롤러 작성
	 */
//	GameRpsVO vo = new GameRpsVO();
//	
//	
//	private void gameValueController() {
//		// TODO Auto-generated method stub
//
//	}
// 	브이오 클레스에서 가위바위보의 1 2 3 값을 가지고 있지 않다면..
//	해당클래스에서 할일은 서비스에 1 2 3 값이 올라왓던것을 받아서 
//	다시 스트링 문자로 바꾸어주는 역활을 해야 할 것 같다.
	
}
