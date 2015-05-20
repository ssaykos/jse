package oop02.syntax;
/*
	static ����
	- ��������
	- Ŭ������ JVM ������ �ε��ÿ� �޸� �ߴ��� �Ѵ�.
	- �ؽ��ڵ� (HeshCode) �� ���
	- ��ü�� �ؽ��ڵ�� JVM �� �ؽ� �˰��� �� �� ��Ű����� Ŭ���� ���� ���յǾ� �ؽ��ڵ尡 �����ȴ�.
	- String �� ��ü ������ ���� ���� ��� �� ���� ���ڿ��� ������ ������.. �ؽ� �ڵ带 �����Ѵ�.
	String str1 = "��ũ";
	String str2 = "��ũ";
	str1.HashCode() = str2.HashCode();
*/
/*
	static ����� ����ؾ� �� ��Ȳ
	 - �ɺ� �� ��� �ν��Ͻ��� ���������� ����ؾ� �ϴ� �Ϳ� �ٿ� ���.
	 - �ν��Ͻ� ������ ������� �ʰ� Ŭ�������� �ٷ� �����Ϸ��� ��.
*/
public class No06StaticSyntax {
	public static void main(String[] args) {
		String hulk="��ũ";
		String hulk1 = new String("��ũ");
		String hulk2 = new String("��ũ");
		boolean aa =(hulk1.hashCode()==hulk2.hashCode());
		boolean bb =(hulk.hashCode()==hulk2.hashCode());
		System.out.println(aa);
		System.out.println(bb);
	}
}
