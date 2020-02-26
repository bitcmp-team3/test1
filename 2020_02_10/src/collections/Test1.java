package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "������";
		String b = "��μ�";
		String c = "�̹α�";
		
		String [] strs = {"������", "��μ�", "�̹α�"};
		String [] ss = {a, b, c};
		String [] xx = new String[3];
		xx[0] = "������";
		xx[1] = "��μ�";
		xx[2] = "�̹α�";
		xx[0] = a;
		xx[1] = b;
		xx[2] = c;
		
		//�迭�� ����Ʈó�� ���������� ������ ���ܼ� ������ �ַ��� �Ҷ�
		String [] removeAfters = new String[strs.length-1]; //�Űܴ��� �迭����
		removeAfters[0]=strs[0]; //strs�� 1������ ���������Ƿ� removeAfter�� 1���� 2���� �־������
		removeAfters[1]=strs[2]; //removeAfter�� �ٿŰܳ���
		strs=null;  //strs�� �� ����ְ�
		strs=removeAfters.clone(); //removeAfters�� �ִ� �ڷḦ clone���� ����
		System.out.println("removeAfters.clone()�ϰ� �� �� "+strs.length);
		
		//ArrayList�� �迭ó�� ũ�⸦ �������� �ʾƵ� �ڵ����� �����ȴ�.
//		List<Date> strings = new ArrayList<Date>(); 
		List<String> strings = new ArrayList<String>();
		List<String> strings2 = new ArrayList<String>();
		strings2.addAll(Arrays.asList(strs));
		for(String x : strs) {
			strings2.add(x);
		}
		
		strings.add("������");
		strings.add("�����");
		strings.add("�̼���");
		strings.add("�ڼ���");
		strings.add("������");
		strings.add("������");
		
		System.out.println(strings.size());
		
		//List�� ����ϴ� �ΰ��� ���
		for(String str : strings) { //strings�� ��ü�� ���ʴ�� str�� �ְڴٴ� �ǹ�
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