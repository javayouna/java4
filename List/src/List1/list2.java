package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {

		/*
		 * [���빮��] �ش� ������ �� �� �޸հ� �����ʹ� ��� �����ؾ��մϴ�. �� ������ {"�����", "������", "��â��", "�ڵ���",
		 * "�̰���", "�����", "������"}
		 *
		 * ��� �����, ������ �� ���;���
		 */

		String member[] = { "�����", "������", "��â��", "�ڵ���", "�̰���", "�����", "������" };
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		int ea = mb.size();
		int w = 0;
		while (w < ea) {
			int ww = 0;
			while (ww <= 0) {
				if (!mb.get(ww).equals("�����") && !mb.get(ww).equals("������")) { // �ϳ� ������ �� ���� w���ڰ� �ٲ� (�ε��� ������ �ٲ�) double
																				// �ݺ��� ���
					mb.remove(0); // 0������ �տ��ִ� �͸� ���� �ٴ� ��
					System.out.println(mb);
				}
				ww++;
			}
			w++;
		}

		/*
		 * ���빮�� ¦�� �����մϴ�. 10,7,6,1,11,37,41,22
		 *
		 * 7,1,11,37,41
		 */

		Integer uu[] = { 10, 7, 6, 1, 11, 37, 41, 22 };
		ArrayList<Integer> mm = new ArrayList<>(Arrays.asList(uu));

		int no = mm.size();
		int z = 0;
		do {
			int no2 = mm.size();
			int zz = 0;
			do {
				if (mm.get(zz) % 2 == 0) {
					mm.remove(zz);
					break;

				}
				zz++;
			} while (zz < no2);
			// mm.remove(0);
			z++;
		} while (z < no);
		System.out.println(mm);

	}
}
