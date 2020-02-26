package javabook.ch9;

import java.util.*;

public class Ch9Ex3 {
	//��ǰ DB�� �����ϴ� HashMap
	HashMap<String, ArrayList<String>> productdb;
	
	//������
	public Ch9Ex3() {
		productdb = new HashMap<String, ArrayList<String>>();
		
		//�����纰 ��ǰ ���
		ArrayList<String> plist1 = new ArrayList<String>();
		ArrayList<String> plist2 = new ArrayList<String>();
		ArrayList<String> plist3 = new ArrayList<String>();
		
		plist1.addAll(Arrays.asList("����Ʈ TV", "������S10", "��Ʈ20.1"));
		productdb.put("�Ｚ", plist1);
		plist2.addAll(Arrays.asList("Ŀ��� TV", "��Ƽ�ӽ�G10", "LG������"));
		productdb.put("����", plist2);
		plist3.addAll(Arrays.asList("���� TV", "������10", "�����е�"));
		productdb.put("����", plist3);
	}
	
	void search() {
		System.out.println("## ��ǰ �˻� ##");
		System.out.println("# �����縦 �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		
		String p = sc.next();
		
		//�Էµ� �������� ��ǰ����� �˻�
		ArrayList<String> result = (ArrayList<String>)productdb.get(p);
		if(result != null) {
			for(String s : result) {
				System.out.println(s);
			}
		}
		else
			System.out.println("�˻������ �����ϴ�.");
			sc.close();
	}
	
	public static void main(String[] args) {
		Ch9Ex3 app = new Ch9Ex3();
		app.search();
	}
}
