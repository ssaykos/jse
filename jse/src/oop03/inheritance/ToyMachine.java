package oop03.inheritance;

import java.util.Vector;

public class ToyMachine {
	private Vector<ToyVO> toys;
	public Vector<ToyVO> toy;
	
	public ToyMachine() {
		// TODO Auto-generated constructor stub
		this(10,5);
	}
	ToyMachine(int cap, int increment){
		toy = new Vector<ToyVO>(cap,increment);
	}
	public void resist(String name , int price, toyspec spec) {
		ToyVO toy = new ToyVO (name, price , spec);
		toys.addElement(toy);
	}
	public Vector<ToyVO> searchname(String name) {
		Vector<ToyVO> catchToys = new Vector<ToyVO>();
		for (int i = 0; i < toys.size(); i++) {
			while (toy instanceof ToyVO) {
				if ( toy.getName().equalsIsIgoreCase(name)) {
					catchToys.add(toy);
				}
				System.out.println(toy.getName()+"ÀÎÇü");
			}
		}
		return toy;
		
	}
}
