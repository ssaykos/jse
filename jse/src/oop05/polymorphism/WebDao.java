package oop05.polymorphism;

public interface WebDao {// 웹 디비에 접근하는 클래스
	public String getMembers();
	public String getMember();
	public String setMember();
	public void deleteMember();
	public void updateMember();
}
