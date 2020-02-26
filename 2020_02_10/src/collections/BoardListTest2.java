package collections;

import java.util.GregorianCalendar;
import java.util.Vector;

public class BoardListTest2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Vector<FreeBoard> boardList = new Vector<FreeBoard>();
		boardList.add(new FreeBoard(1, "����", "�ۼ���", "����", new GregorianCalendar()));
		boardList.add(new FreeBoard(2, "��źĿ��", "Ŀ��", "����Ŀ��+����", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(3, "����", "�ۼ���", "����", new GregorianCalendar()));
		boardList.add(new FreeBoard(4, "��źĿ��", "Ŀ��", "����Ŀ��+����", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(5, "����", "�ۼ���", "����", new GregorianCalendar()));
		boardList.add(new FreeBoard(6, "��źĿ��", "Ŀ��", "����Ŀ��+����", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(7, "����", "�ۼ���", "����", new GregorianCalendar()));
		boardList.add(new FreeBoard(8, "��źĿ��", "Ŀ��", "����Ŀ��+����", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(9, "����", "�ۼ���", "����", new GregorianCalendar()));
		boardList.add(new FreeBoard(10, "��źĿ��", "Ŀ��", "����Ŀ��+����", new GregorianCalendar(1999, 2, 22)));
		
		boardList.add(new FreeBoard(11, "����", "�ۼ���", "����", new GregorianCalendar()));
		boardList.add(new FreeBoard(12, "��źĿ��", "Ŀ��", "����Ŀ��+����", new GregorianCalendar(1999, 2, 22)));
		
		System.out.println("capacity::"+boardList.capacity()); //List�� �뷮 20
		System.out.println("size::"+boardList.size()); //���� ������ũ�� 12
		boardList.trimToSize(); //����Ǵ� ������ ������
		System.out.println("capacity::"+boardList.capacity()); //12
	}
	
}
