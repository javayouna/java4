/*부모클래스 및 자식(내부)클래스 연동*/

public class class1 {

	public static void main(String[] args) {
		/*부모가 인스턴스에 적용 되지 않으면 자식 class는 절때 호출하지 못 함*/
		parents bb = new parents();
		bb.p_boc();
		parents.child pc = bb.new child(); 
		//(부모class.자식class 이름생성 = 부모클래스명 부모를 객체화 해준거에다가 new 자식클래스명(인스턴스에 적용)
		pc.c_box();
	}
}
class parents{ //부모클래스
	String a = "홍길동"; //부모필드에 있는 전역변수(this)
	String b;
	class child{ //자식클래스 
	int a = 20;
	
	public void c_box() {//자식메소드
		double c = 10.5;
		System.out.println(c); //자식메소드 전용 지역변수 
		System.out.println(this.a); //자식클래스 전용 전역변수
	    System.out.println(parents.this.a); //부모클래스 전용 전역변수
	    System.out.println(parents.this.b); //부모클래스 전용 전역변수
	    //a가지고 오려면 parents.this.a (부모 클래스 이름. this)
	   //만약에 class child에 아무것도 없는 상황이면 this.a하면 못 읽음 가장 어려운 부분 
	}
	}
	public void p_boc() {    //부모메소드에 있는 지역변수 //메소드안에도 class들어갈 수 있음 
		String a = "이순신"; //p_box에 있는 지역변수 선언 
		this.b=a;
		System.out.println(this.a); //this.a 쓰면 "홍길동", 그냥 a쓰면 이순신
	}
}