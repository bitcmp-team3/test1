package test;

public class Sub extends PrivateConstructor {

	private Sub() {
		// 에러 원인 --> 기초 클래스의 디폴트 생성자가 private
}
}
