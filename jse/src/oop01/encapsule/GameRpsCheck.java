package oop01.encapsule;


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

}
