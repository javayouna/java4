package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1_t {
/*선생님이 짠 코드*/
	public static void main(String[] args) {

		/*
		 * 외부class를 사용하여 다음 프로세서를 작성하세요.
		 * 다음 2개의 배열 데이터가 있습니다.
		 * 단, 2개의 배열을 하나의 배열로 합치도록 합니다.
		 * 그대신 중복된 값은 하나로 처리를 하셔야 합니다.
		 * 1번 DB : 11,22,33,44,55
		 * 2번 DB : 8,10,11,19,44
		 * 결과 출력 : 8,10,11,19,22,33,44,55
		 */
		
		/* 
		 * [코드 작성 순서]
		 * 1. 1번 DB, 2번 DB 중복값을 비교하여 2번 DB 안에 있는 중복값 삭제
		 * 2. 2번 DB를 1번 DB에 추가
		 * 3. 1번 DB sort로 정렬
		 */
		
		outclass ot = new outclass();
		ot.filter();

	}

}

class outclass {

	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;

	public void filter() {

		Integer[] a = { 11, 22, 33, 44, 55 };
		Integer[] b = { 8, 10, 11, 19, 44 };
		/* ArrayList를 사용하려면 배열 자료형이 Integer이어야 함 */
		this.a1 = new ArrayList<>(Arrays.asList(a));
		this.b1 = new ArrayList<>(Arrays.asList(b));

		int w = 0;
		do { // 큰 반복문

			int ww = 0;
			int z = this.b1.size();

			while (ww < z) { // 작은 반복문

				if (this.a1.get(w) == this.b1.get(ww)) {
					// System.out.println(this.b1.get(ww)); //중복된 숫자 나오는지 확인
					this.b1.remove(ww);
					this.b1.add(ww, 0);
					/*
					 * 배열 안에 있는 숫자를 삭제한 뒤 baeak로 끝내버리면 후에 배열에 값이 추가 됐을 때 수정이 힘들어짐. 중복된 값을 삭제하고 원래 있던
					 * 자리에 0을 채워줌
					 */
				}

				ww++;

			} // 여기까지 작은 반복문

			w++;

		} while (w < this.a1.size()); // 여기까지 큰 반복문

		/* 위에 있는 반복문을 빠져나와서 새로운 반복문을 돌림 */
		int t = 0;

		while (t < this.b1.size()) {
			/* 현재 b1 배열 데이터값 중 중복된 수가 삭제되고 0으로 채워진 상태 */
			if (this.b1.get(t) != 0) { // 배열 데이터 안에 있는 0을 제외하고

				this.a1.add(this.b1.get(t)); // a1 배열 안에 b1 데이터를 추가한다(0인 값을 제외하고)
			}

			t++;
		}

		Collections.sort(this.a1); // 배열 안에 있는 숫자 정렬
		System.out.println(this.a1); // 출력

	}

}