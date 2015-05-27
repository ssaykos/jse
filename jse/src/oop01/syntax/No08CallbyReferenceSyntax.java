package oop01.syntax;
/*
	�޼ҵ��� ���� �����ϴ� ���
	- Call by Value
	- �޼ҵ�� �� ����, ��� ���ڿ�, ���ڸ� �����ϸ� ���� ���� �� �� �����̶�� �Ѵ�.
	- C����� ��쿡�� ���� , ���� �迭�� Call by value �̰�,
		���ڿ��� char* �� �̹Ƿ� Call by Address �� �ȴ�.
	- C��� ó�� �ּ�(������) �� �����ϴ� Call by Address�� �ڹٿ����� ����.
	- Call by Value �� ��� ���� �����ϸ� ���� ������ ���� ������ ������ �ȵȴ�.
	���� stack ���� ���� ����ȴ�.
	- Call by Reference �� ��� ������ (Hash Code) �� ������ ��ü�� �ڽ��� �������� ���޵����ν� ���� ��ȭ�� �߻��Ҽ� �ִ�.
*/
/*
	Call by Reference �������� ���� ����
	- ���� ��ü�� �����Ͱ� ����ȴ�.
		 ������ �������� �ϴ� ��� �̿�ȴ�.
 */
/*
	String ��ü�� ������ ���� ����
	- String ��ü�� ��ü�̹Ƿ� ���������� Call by Reference �� ����ϳ�
	- ���ڿ� �Ҵ� ���� ���� �� ������ Call by Value ������� �����Ѵ�.
	- ���ڿ��� ������ �ɺ��̳� ������ ���� Hash Code �� ������ �ִٰ�
	- ���� ������ ��������. �׷��� ���ο� ���ڿ��� ������ �����ϸ� 
	- �� �ٸ� Hach Code �� �߻��Ǹ鼭 �ɹ������� ���еǰ� �ȴ�.
 */
public class No08CallbyReferenceSyntax {
	public static void main(String[] args) {
		No08CallbyReferenceSyntax callbyReferenceSyntax = new No08CallbyReferenceSyntax();
		
		int a = callbyReferenceSyntax.name(3,3);
	}
	public int name(int a, int b) {
		return a+b;
	}
}
