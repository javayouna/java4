
public class oop6 {

	public static void main(String[] args) {
		// 배열 형태의 생성자 객체 추상클래스 만들기

		box[] b = { new abox(), new abox2(), new abox3() };
		/*
		 * b[0].dataload(); //전체 출력(수동) b[1].dataload();
		 */
		/*//for each단점 특정 class를 출력 안 하고 싶을때 사용  하지는 못함 
		 * for(box z:b) { //전체 출력 z.dataload(); }
		 */

		int w = 0;
		while (w < (b.length)) {
			if (w != 1) { // abox2(인덱스1번)는 출력 안 하고 싶을 때
				b[w].dataload();
			}
			w++;
		}

	}

}

abstract class box { // 별로 클래스 파일2개면 public 때려야하지만 아니므로 default
	public abstract void dataload();
}

class abox extends box {
	@Override
	public void dataload() {
		System.out.println("test1");
	}
}

class abox2 extends box {
	@Override
	public void dataload() {
		System.out.println("test2");
	}
}

class abox3 extends box {
	@Override
	public void dataload() {
		System.out.println("test3");
	}
}