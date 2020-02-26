package collections;

import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Date> map = new Hashtable<String, Date>();
		map.put("birthday", new Date(1993,4,6));
		map.put("engday", new Date(2020,2,12));
		
		System.out.println(map.get("engday").getMonth());
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			System.out.println(map.get(keys.next()).getYear());
		}
	}

}
