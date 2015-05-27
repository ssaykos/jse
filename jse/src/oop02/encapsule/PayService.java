package oop02.encapsule;

public class PayService {
	
	PayVO payVO = new PayVO();
	
	public void input(String name, int salary){
		payVO.setName(name);
		payVO.setSalary(salary);
	}
	public int calcPay(){
		int income= (int) (payVO.getSalary()*(1-payVO.TAX));
		return income;
	}
	public int tax(){
		return (int)(PayVO.TAX*100);
	}
	/************»ùÀÇ ¿¹Á¦*******************/
	
	public int calculateIncom(String name, int salary) {
		payVO.setName(name);
		payVO.setSalary(salary);
		return (int) (payVO.getSalary()*(1-payVO.TAX));
	}
	public double showTax(){
		return PayVO.TAX;
	}
}
