package sub;

import abstracttest.B;

public class SubB extends B{
	
	public void m1(int a) {
		for(int i=0; i<a; i++) {
			System.out.println("//////////////////");	
		}
	}
	
	@Override
	public void m1() {
		System.out.println("%%%%%%%½Ò¹ä%%%%%%%%%%%%");
	}
	
	public void output() {
		mustCall();
	}

	@Override
	protected void overriding() {
		// TODO Auto-generated method stub
		
	}
}
