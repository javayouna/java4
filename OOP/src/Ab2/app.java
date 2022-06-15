package Ab2;

public class app {

	public static void main(String[] args) {
		
		//(자식)=(자식)
		/*members mb = new members();
		mb.opp();
		mb.oop();
		*/
		//(부모)=(자식) =>인터페이스 기준으로 적용된 오버라이드만 호출 
		//인터페이스 외에는 호출 못 하게 막았다. =형변환
		//members mb = new members(); //자식 class 전용
		//app_data2 ap = mb;//인터페이스 전용 (클래스->인터페이스기준)
		
		
		app_data2 ap = new members();
		members mb2 = (members)ap; //(인터페이스 -> 클래스변환) 이렇게 쓰면 new 한 번만 쓰면 되서 좋음 
	
		/*ap.opp();
		ap.opp2();
		//ap.oop(); error! 자식한테만 있고, 부모에게 없음 */
		
	}

}
/*
class members implements app_data1{
	app_data1에 강제로 자료형 선언하는 방식 
	
}*/
class members implements app_data2{
	@Override
	public void opp() {
		System.out.println("test");
	
	}
	@Override
	public void opp2() {
	 System.out.println("test2");
			
		}
	public void oop() {
		System.out.println("test3");
	}
	
}