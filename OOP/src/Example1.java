
public class Example1 {

	public static void main(String[] args) { // 외부 클래스 호출만 합니다
		// abstract 응용문제

		/*
		 * 1차 배열값이 있습니다. 해당 배열값을 모두 더한 값을 출력합니다. 단, abstract 기본 void 이름은 sender 최종 값 출력은
		 * sender에서 출력 배열은 abstract에서 사용 배열 데이터:6,13,22,9,12,64,32,47,39
		 */

		b1 su = new b1();
		su.sender();

	}

}

abstract class aa {
	int dt[] = { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
	public abstract void sender();

}

class b1 extends aa {

	@Override
	public void sender() {
		int total = 0;
		for (int i = 0; i < this.dt.length; i++) {
			total += this.dt[i];
		}
		System.out.println(total);

	}

}
