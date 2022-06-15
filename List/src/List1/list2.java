package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {

		/*
		 * [응용문제] 해당 데이터 값 중 휴먼고객 데이터는 모두 삭제해야합니다. 고객 데이터 {"김수빈", "김정현", "김창순", "박도현",
		 * "이경훈", "정재욱", "하윤성"}
		 *
		 * 결과 정재욱, 하윤성 만 나와야함
		 */

		String member[] = { "김수빈", "김정현", "김창순", "박도현", "이경훈", "정재욱", "하윤성" };
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		int ea = mb.size();
		int w = 0;
		while (w < ea) {
			int ww = 0;
			while (ww <= 0) {
				if (!mb.get(ww).equals("정재욱") && !mb.get(ww).equals("하윤성")) { // 하나 지워질 떄 마다 w숫자가 바뀜 (인덱스 갯수가 바뀜) double
																				// 반복문 사용
					mb.remove(0); // 0이유는 앞에있는 것만 지운 다는 뜻
					System.out.println(mb);
				}
				ww++;
			}
			w++;
		}

		/*
		 * 응용문제 짝수 삭제합니다. 10,7,6,1,11,37,41,22
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
