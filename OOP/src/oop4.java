
public class oop4 {
	// 추상클래스 및 메소드 abstract 로드를 못함 = 메인에 못 때림
	// 추상 메소드는 반드시 구현하거나 클래스 형태를 추상클래스로 바꿔줘야함 
	public static void main(String[] args) {

			ab_2 ab = new ab_2(); //abstract은 객체화가 안 되서 extends로 가져와서 객체화 
		//ystem.out.println(ab.b());
			ab.ab_a();
	}

}

abstract class ab_1 { // 추상클래스 (ghost) 외부에서 로드가 절 때 안됨 -자체 실행(x)
	public int c;
	public void ab_a() { //free (인수값 없는 추상 메소드) -사용해도되고 안해두됨
		//System.out.println("부모 클래스 입니다."); //환경설정 같은거 할 때 사용 ex 스캐너 같은거 
		 c = 0123456;
	}
	public void ab_a(int a) { //free (인수값 또는 추상 메소드)
		
	}
	public abstract void ab_c(); //14번줄보단 이게좋음 free니까 
	public abstract int b(); // abstract쓰면 뒤에 (인수값) 못씀; //추상 메소드 (free구성)- 자체실행 (x)
	// ★추상 메소드 - 자체 실행(x)
	
}
class ab_2 extends ab_1{
	@Override
	public void ab_c() {
		
	}
	public void ab_a() {
		System.out.println(this.c);
	}
	
	@Override
	public int b() { //실제 메소드+추상 메소드
		return 55;
	}
}
	@Override
	public int c() {
		return 99;
	}

}