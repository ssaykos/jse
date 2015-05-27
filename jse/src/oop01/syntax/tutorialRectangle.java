package oop01.syntax;

public class tutorialRectangle {
	
	public int width = 0 , height = 0;
	public tutorialPoint origin;
	
	public tutorialRectangle() {
		origin = new tutorialPoint(0,0);
	}
	public tutorialRectangle(tutorialPoint p) {
		origin = p;
	}
	public tutorialRectangle(int w , int h) {
		origin = new tutorialPoint(0,0);
		width = w;
		height = h;
	}
	public tutorialRectangle(tutorialPoint p,int w , int h) {
		origin = p;
		width = w;
		height = h;
	}
	
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		//채우세요
		origin.x = x;
		origin.y = y;
	}
	public int  getArea() {
		return this.height*this.width;//직사각형을 구하는 공식
	}
	
}
