package abstracttest;

public abstract class B {
	public void m1() {
		System.out.println("%%%���%%%");
	}
	protected void mustCall() {
		System.out.println("mustCall()");
	}
	protected void mustSubOverride() {//body
		System.out.println("mustSubOverride()");
	}
	protected abstract void overriding(); //�������̵��� �������� �ְ������ abstract�� ���δ�. ��� �߰�ȣ�� ���־���{}
}
