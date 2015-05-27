package oop03.inheritance;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {
	private Map<String, Object>properties;
	
	public ToySpec() {
		// TODO Auto-generated constructor stub
		properties = new HashMap<String , Object>();
	}

	public Map<String, Object> getPropertiles() {
		return properties;
	}
	
	public void setPropertiles(Map<String, Object> propertiles) {
		this.properties = propertiles;
	}
	
	/* ���� Ű�� �Ӽ��� �߰�*/
	public void setProperty(String pName , Object pvalue) {
		// TODO Auto-generated method stub
		properties.put(pName, pvalue);
	}
	
	/*Ű ���� ���� �Ӽ��� �ҷ�����*/
	public Object getProperty(String pname) {
		// TODO Auto-generated method stub
		return properties.get(pname);
	}
	/*�� �˻�*/
	public boolean match(ToySpec spec) {
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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return properties.toString();
	}
	
}
