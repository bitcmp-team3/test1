package collections;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GeneTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ss = new ArrayList<String>();
		List ss2 = new ArrayList();
		List<Date> ss3 = new ArrayList();
		
		ss.add("454546");
		ss.add("adfasdf");
		
		//Generic한 표현을 안써주면 늘 Object형이므로 원시형으로 자동 형변환됨
		ss2.add(123);
		ss2.add(new Date());
		ss2.add("SDFSDFDSFSD");
		ss2.add(new Test1());
		
		ss3.add(new Date());
		ss3.add(new Date(1999,9,9));
		ss3.add(new Date(1978,2,22));
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<ss2.size();i++) {
			sb.append(ss2.get(i));
		}
		System.out.println(sb);
		
		Date[] dates=new Date[10];
		Object obj;
		int dIndex=0;
		for(int i=0; i<ss2.size();i++) {
			obj = ss2.get(i);
			if(obj instanceof Date) {//instanceof라는 키워드 (연산자)
				dates[dIndex++]=(Date)obj;
			}
			
		}
		System.out.println(dates[0]);
		
		for(int i=0;i<ss3.size();i++) {
			dates[i] = ss3.get(i);
			
		}
		System.out.println(dates[0]);
	}

}
