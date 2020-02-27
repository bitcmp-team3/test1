package abstracttest;

public abstract class B {
	public void m1() {
		System.out.println("%%%잡곡%%%");
	}
	protected void mustCall() {
		System.out.println("mustCall()");
	}
	protected void mustSubOverride() {//body
		System.out.println("mustSubOverride()");
	}
	protected abstract void overriding(); //오버라이딩의 강제성을 주고싶으면 abstract를 붙인다. 대신 중괄호를 없애야함{}
}
