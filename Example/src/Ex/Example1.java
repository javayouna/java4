package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		//�ܺ�Ŭ������ ������ ��
		//�ܺ� class�� ����Ͽ� ���� ���μ����� �ۼ��ϼ���.
		/*
		 *���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. ��, 2���� �迭�� �ϳ��� ��ġ���� �մϴ�. 
		 * �� ���, �ߺ��� ���� �ϳ��� ó���� �մϴ�.
		 * 
		 * 1�� �迭 11,22,33,44,55
		 * 2�� �迭 8,10,11,19,44
		 * 
		 * ������
		 * [8,10,11,19,22,33,44,55]
		 * ���ĵǾ��� 
		 */
		Integer a[]= {11,22,33,44,55};
		Integer b[]= {8,10,11,19,44};
		
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(b));
		ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(a));

		a2.removeAll(b2);
		int ea=b2.size();
		for(int f=0; f<ea; f++) {
			a2.add(b2.get(f));
		}
		
		Collections.sort(a2);
		System.out.println(a2);
	}

}

public class number33{ //�迭�� ����� �޾� ���� ��.. ?
	
	
	
	
}
//	protected Integer a[]= {11,22,33,44,55};
//	protected Integer b[]= {8,10,11,19,44};
//	
//	ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(b));
//	ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(a));
//
//	a2.removeAll(b2);
//	int ea=b2.size();
//	for(int f=0; f<ea; f++) {
//		a2.add(b2.get(f));
//	}
//	
//	Collections.sort(a2);
//	System.out.println(a2);
//	}

