package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		Integer a[] = { 3, 6, 9, 12, 15 };
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a)); // �߰��߰� ������ ���� ���״� LinkedList�� ����
		System.out.println(ln);

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();// �ƹ��͵� ���� �迭
		String user;
		//for(;;) ���ѷ���
		//do~while(true) ���ѷ���
		while (true) { // ���� ����
			System.out.println("���ڸ� �Է��ϼ���");
			user = sc.next(); //AWT���� �̰��� input��Ʈ
			try { //����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
			int number = Integer.parseInt(user);
			list.add(number);
			int ea = list.size();
			
			if(ea>5) {
				break; //5������ �迭�� �ԷµǸ� ���ѷ����� �������� 
			}
			} 
			catch (Exception e) { //������ �߻����� �� �۵��Ǵ� ��Ʈ
				System.out.println("�ش� �Է»����� �����Դϴ�.\n ���ڸ� �Է��ض�");
			}

		}
		System.out.println(list); //break ������ ������ ������, why? ���ѷ����ϱ� break�� �ְų� ����� ���� sysout��ġ�� �ٲ�
	}
}
