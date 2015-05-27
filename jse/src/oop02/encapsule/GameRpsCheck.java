package oop02.encapsule;


public class GameRpsCheck {

	public boolean check(int playerCheck) {
		boolean condition=true;
		if(playerCheck>=1&&playerCheck<=3){
			condition=false;
		}else{
			condition=true;
		}
		return condition;
	}

	public boolean qustionCheck(int qustionContinue) {
		boolean condition=true;
		if(qustionContinue>=1&&qustionContinue<=2){
			condition=false;
		}else{
			condition=true;
		}
		return condition;
	}

}
