package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*[���빮��]
		 * �ѹ�������   1 3,6,9,12,15
		 * �ѹ�������2  2,4
		 * 
		 * ���: 3,6,9,12,15,2,4 //������1�� ������2�߰��ϱ�
		 */ 
		//ArrayList<Integer> mm = new ArrayList<>(Arrays.asList(uu));
	
		/*Arrays.sort: �迭���� ���¸� �����մϴ�.*/
		Integer a[]= {3,6,9,12,15};
		Integer b[]= {2,4};
	
		ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(b));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(a)); //�߰��� �갡 ����
		
		int ea = b2.size();
			for(int f=0;f<ea;f++) {
					a2.add(b2.get(f));
		
		}
		//Integer c[]=bb;
		//Arrays.sort(c); //Arrays List�� sort�� �ȴ� ;��; ������ int c[]=new int[9]�̷��� ����
		//System.out.println(Arrays.toString(c));
		System.out.println(a2);
		Collections.sort(a2); //ArrayList, LinkedList sort �������� ���� 
		System.out.println(a2);
		
		
		int ea2 = a2.size();
		System.out.println(ea2); //
	}

}
