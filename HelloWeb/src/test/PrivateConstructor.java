package test;

public class PrivateConstructor {
	private static PrivateConstructor ref;
	private PrivateConstructor() {
		//함부로 인스턴스를 만들지 못하게 하도록
		//단 하나의 인스턴스만을 만들어야 할 때
		//서브 클래스 , 하위 클래스 에서도 인스턴스를 함부로 만들지 못한다.
	}
	public static PrivateConstructor getInstance() {
		System.out.println("Instance ="+ref);
		if(ref == null )ref= new PrivateConstructor();
			return ref;
			
	}
}
