package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "동송현";
		String b = "김민수";
		String c = "이민기";
		
		String [] strs = {"동송현", "김민수", "이민기"};
		String [] ss = {a, b, c};
		String [] xx = new String[3];
		xx[0] = "동송현";
		xx[1] = "김민수";
		xx[2] = "이민기";
		xx[0] = a;
		xx[1] = b;
		xx[2] = c;
		
		//배열을 리스트처럼 공간제거후 앞으로 땡겨서 설정해 주려고 할때
		String [] removeAfters = new String[strs.length-1]; //옮겨담을 배열설정
		removeAfters[0]=strs[0]; //strs의 1번방을 제거했으므로 removeAfter의 1번에 2번걸 넣어줘야함
		removeAfters[1]=strs[2]; //removeAfter에 다옮겨놓고
		strs=null;  //strs를 다 비워주고
		strs=removeAfters.clone(); //removeAfters에 있는 자료를 clone으로 복제
		System.out.println("removeAfters.clone()하고 난 후 "+strs.length);
		
		//ArrayList는 배열처럼 크기를 정해주지 않아도 자동으로 가변된다.
//		List<Date> strings = new ArrayList<Date>(); 
		List<String> strings = new ArrayList<String>();
		List<String> strings2 = new ArrayList<String>();
		strings2.addAll(Arrays.asList(strs));
		for(String x : strs) {
			strings2.add(x);
		}
		
		strings.add("동송현");
		strings.add("김송현");
		strings.add("이송현");
		strings.add("박송현");
		strings.add("강송현");
		strings.add("남송현");
		
		System.out.println(strings.size());
		
		//List를 출력하는 두가지 방법
		for(String str : strings) { //strings의 객체를 차례대로 str에 넣겠다는 의미
			System.out.println(str);
		}
		
		System.out.println("=====================================");
		
		for(int i=0; i<strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		strings.remove(2);
		System.out.println("=====================================");
		for( String str : strings) {
			System.out.println(str);
		}
		
	}

}
