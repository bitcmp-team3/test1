package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<FreeBoard> boardList = new ArrayList<FreeBoard>();
		boardList.add(new FreeBoard(1, "제목", "작성자", "내용", new GregorianCalendar()));
		boardList.add(new FreeBoard(2, "방탄커피", "커피", "원두커피+버터", new GregorianCalendar(1999, 2, 22)));

		Date[] dates=new Date[2];
		
		// 내용을 보고 싶다.
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i).getContents());
			
		}

		// 제목과 작성년도
		for (int i = 0; i < boardList.size(); i++) {
			System.out.print(boardList.get(i).getTitle()+", ");
			System.out.println(boardList.get(i).getDateCreate().get(Calendar.YEAR));
		}
		
		for(FreeBoard board : boardList) {
			System.out.print(board.getTitle()+", ");
			System.out.println(board.getDateCreate().get(Calendar.YEAR));
		}
	}
	
}
