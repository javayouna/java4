
public class class3 {

	public static void main(String[] args) {
		/*
		 * [응용문제]
		 */
		apink m = new apink();
		m.f_method("이보미");

		apink.cafe LA = m.new cafe();
		LA.call();
	}
}
abstract class father { // 추상클래스 (abstract을 사용하면 추상)
	public String u_name; // this 떄리려고 //전역변수 선언 (abstract 없으므로 추상이 아님)

	public abstract void f_method(String name); // 꼭 써야하는애 //추상메소드

}

class apink extends father {
	@Override
	public void f_method(String name) {//추상메소드를 실제메소드로 전환
		this.u_name = name; //추상메소드에 있는 전역 변수로 값을 이관함

	}

	class cafe { 
		String msg = apink.this.u_name; // 부모클래스에 있는 전역변수를 자식클래스 전역변수로 이관 
		//father되긴하지만, apink로 상속 받은게 apink니까

		public void call() {
			String msg2 = this.msg + "님 짱!!";
			System.out.println(msg2);
		}
	}

}