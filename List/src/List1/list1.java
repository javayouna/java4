package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(�߰�), get(��������), remove(����), size(�ε��� ũ��) : 
		//ArrayList util �޼ҵ忡�� ����ϴ� �κ�
		//Arrays.asList: �ε��� �迭 ������ ����
		//�߿�: add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰��� ��, index��ȣ�� ���� �� ���� �����ϸ�
		//�ش� index �κп� �߰��� �˴ϴ�.
		//String member[] = {"�̼���", "ȫ�浿", "������", "������"};
		//ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
//		//System.out.println(mb);
//		int ea = mb.size();
//		//System.out.println(ea);
//		mb.add("������"); //�������� �߰��Ǹ鼭 ������ �ε��� ��ȣ�� ����Ǵ� Ȯ�� �� ��
//		//System.out.println(mb);
//		mb.remove(1);
//		//System.out.println(mb);
//		mb.add(3,"�������"); //�ε��� ��ȣ 3���� ������� �Է�
//		//System.out.println(mb);
//		String checks = mb.get(2);
//		//System.out.println(checks);
		
		
		/*[���빮��]
		 *{15, 22, 37, 8, 11, 19, 41}; 
		 *�����͸� Ŀ�����Ͽ� ���� ������� ����ϼ���.
		 *�����
		 *[7,15,22,8,11,39,41]
		 */
		/*ArrayList���� int�� ������� ����(Integer)�����*/
		Integer numbers[] = {15, 22, 37, 8, 11, 19, 41};
		ArrayList<Integer> mm = new ArrayList<>(Arrays.asList(numbers));
		
		mm.remove(2);
		mm.remove(4);
		
		mm.add(0,7);
		mm.add(5,39);

		System.out.println(mm);
		
		
		
	}

}
