package oop02.syntax;

public class tutorialBycycle {
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	private static int numberOfBicycle=0;

	public tutorialBycycle(int stratCadence, int stratGear, int stratSpeed) {
		super();
		this.cadence = stratCadence;
		this.gear = stratGear;
		this.id = ++numberOfBicycle;
		this.speed = stratSpeed;
	}
	public int getCadence() {
		return cadence;
	}
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public void applyBrake(int decrement){
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed+=increment;
	}
}
