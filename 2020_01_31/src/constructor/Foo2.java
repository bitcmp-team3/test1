package constructor;

public class Foo2 {
	private int age;
	private String addr;

	public Foo2() {
		System.out.println("Foo2()");
	}

	public Foo2(int age, String addr) {
		this.age = age;
		this.addr = addr;
	}

	public Foo2(String addr) {

		System.out.println(addr);
	}

	public void output() {
		System.out.println(age + " " + addr);
	}
}
