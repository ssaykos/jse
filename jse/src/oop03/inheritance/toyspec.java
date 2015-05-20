package oop03.inheritance;

import java.util.HashMap;
import java.util.Map;

public class toyspec {
	private Map<String, Object>propertiles;
	
	public toyspec() {
		// TODO Auto-generated constructor stub
		propertiles = new HashMap<String , Object>();
	}

	public Map<String, Object> getPropertiles() {
		return propertiles;
	}
	
	public void setPropertiles(Map<String, Object> propertiles) {
		this.propertiles = propertiles;
	}
	
	/* 맵의 키값 속성값 추가*/
	
	public void setProperty(String pName , Object pvalue) {
		// TODO Auto-generated method stub
		propertiles.put(pName, pvalue);
	}
	
	public Object getProperty(String pname) {
		// TODO Auto-generated method stub
		return propertiles.get(pname);
	}
	public boolean match(toyspec spec) {
		String specSTR ="";
		String thisSTR = "";
		
		if(spec.getProperty("ToyUser")!=null){
			specSTR+=spec.getProperty("ToyUser");
			thisSTR+= getProperty("ToyUser");
		}
		if(spec.getProperty("ToyType")!=null){
			specSTR+=spec.getProperty("ToyUser");
			thisSTR+=getProperty("ToyUser");
		}
		return false ;
	}
}
