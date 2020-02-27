package collections;

import java.util.GregorianCalendar;
import java.util.Vector;

public class BoardListTest2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Vector<FreeBoard> boardList = new Vector<FreeBoard>();
		boardList.add(new FreeBoard(1, "제목", "작성자", "내용", new GregorianCalendar()));
		boardList.add(new FreeBoard(2, "방탄커피", "커피", "원두커피+버터", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(3, "제목", "작성자", "내용", new GregorianCalendar()));
		boardList.add(new FreeBoard(4, "방탄커피", "커피", "원두커피+버터", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(5, "제목", "작성자", "내용", new GregorianCalendar()));
		boardList.add(new FreeBoard(6, "방탄커피", "커피", "원두커피+버터", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(7, "제목", "작성자", "내용", new GregorianCalendar()));
		boardList.add(new FreeBoard(8, "방탄커피", "커피", "원두커피+버터", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(9, "제목", "작성자", "내용", new GregorianCalendar()));
		boardList.add(new FreeBoard(10, "방탄커피", "커피", "원두커피+버터", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(11, "제목", "작성자", "내용", new GregorianCalendar()));
		boardList.add(new FreeBoard(12, "방탄커피", "커피", "원두커피+버터", new GregorianCalendar(1999, 2, 22)));
		
		System.out.println("capacity::"+boardList.capacity()); //List의 용량 20
		System.out.println("size::"+boardList.size()); //실제 데이터크기 12
		boardList.trimToSize(); //낭비되는 공간을 삭제함
		System.out.println("capacity::"+boardList.capacity()); //12
	}
	
}
