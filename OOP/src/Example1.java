import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) { // 외부 클래스 호출만 합니다
		// abstract 응용문제

		/*
		 * 1차 배열값이 있습니다. 해당 배열값을 모두 더한 값을 출력합니다. 단, abstract 기본 void 이름은 sender 최종 값 출력은
		 * sender에서 출력 배열은 abstract에서 사용 배열 데이터:6,13,22,9,12,64,32,47,39
		 */

		arr1 ar = new arr1();

	}

}

/* 선생님이 풀어주신 것 */
abstract class vdata {

	public abstract void sender();
}

class arr1 extends vdata {
	private final int alldata[];

	public arr1() {

		this.alldata = new int[] { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
		this.sender();

	}

	@Override
	public void sender() {
		int total = 0;
		for (int i = 0; i < this.alldata.length; i++) {
			total += this.alldata[i];
		}
		System.out.println("총 합계: " + total);
	}

}

/*
 * 내가 푼것(정답 맞음) abstract class aa{ int dt[] = {6,13,22,9,12,64,32,47,39}; public
 * abstract void sender(); }
 * 
 * class b1 extends aa{
 * 
 * @Override public void sender() { int total=0; for(int
 * i=0;i<this.dt.length;i++) { total+=this.dt[i]; } System.out.println(total); }
 * 
 * }
 */
