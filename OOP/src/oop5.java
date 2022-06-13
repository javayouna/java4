	// abstract
public class oop5 {
	// abstract 응용 기본형태 인수값으로 추상 메소드 값을 넘김 
	public static void main(String[] args) {
		load1 ld1= new load1();
		ld1.datain(20, 30);
		ld1.call();
		load2 ld2= new load2();
		ld2.datain(20, 30);
		ld2.call();
	}

}

abstract class abclass {
	int data1, data2;
	public void datain(int d1, int d2) { //기본 추상 메소드, 모든 데이터를 인수 값
		//받아서 this 처리 단, 외부 클래스에는 선언하지 않음
		this.data1 = d1;
		this.data2 = d2;
	}

	public abstract void plus(); //plus 꼭 ! 잊지말고 클래스 만들면 꼭 쓰기
	//각각의 class기본으로 plus 메소드는 무조건 들어가야함 이게 메인클래스라는 소리 
	public void call() { //call을쓰면 plus같이 쓰는게 당연 
		this.plus();
	}

}

class load2 extends abclass {
	
	
	
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg(); //int sum = this.data1 * this.data2;끝날 때 this.avg();
		//써주면 50,600,홍길동 이렇게 다 ㄸ뜸
	}


	public void avg() {
		System.out.println("홍길동");
	}

}
class load1 extends abclass {
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
		
		
	}

}
