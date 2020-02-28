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
		boardList.add(new FreeBoard(1, "����", "�ۼ���", "����", new GregorianCalendar()));
		boardList.add(new FreeBoard(2, "��źĿ��", "Ŀ��", "����Ŀ��+����", new GregorianCalendar(1999, 2, 22)));

		Date[] dates=new Date[2];
		
		// ������ ���� �ʹ�.
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i).getContents());
			
		}

		// ����� �ۼ��⵵
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
