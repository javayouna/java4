package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {

		/*
		 * ���빮�� ����ڰ� ���ڱݾ��� �Է��մϴ�. �ش� ���� �ݾ� Ƚ���� �� 8���Դϴ�. 0~n���� �Է°����ϸ� �ش� �Է��� ��� ������ ���� �հ�
		 * �ݾ��� ��� ��Ű�ÿ�.
		 * 
		 * 
		 * ����) �Ա��� �ݾ��� ��������. ~~~~8�� ���:
		 */

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> bank = new LinkedList<>();
		String user;
		sc.close();
		int w = 0;
		int total =0;
		do {

			System.out.println("�Ա��� �ݾ��� ��������");
			String money = sc.next();
			try {
				int addm = Integer.parseInt(money);
				bank.add(addm);
				total+=addm;

			} catch (Exception a) {
				System.out.println("�ݾ��� ���ڷθ� �Է��ϼ���.");
			}

			w++;
		} while (w < 8);
		
		System.out.println("��ü �Ա��� �� �ݾ���"+ total +"�Դϴ�.");
		
	}

}
