package Ab;
/*abstract와 interface의 차이점 및 공통점*/
public class method_2 {
	//method_2inter and method_2inter2 interface연결됨
	public static void main(String[] args) {
		loadinter ld = new loadinter();
		ld.setbox("홍길동");
		
	}

}
//중요:acstract와 interface는 모두 static은 사용할 수 있음 

 abstract class test{ //abstract class는 public 안 써두 알아서걸림 abstract는 default를 사용하지 않음 (public이 기본으로 설정)
	 //필드에 자료형을 생성할 수 있음 
	public String nn;
	public abstract void box();
	public void box2(String n) {
		this.nn= n;
		System.out.println(this.nn);
	}
}



class loadinter implements method_2re, method_2inter2{ //다중상속 
	@Override
	public String names() {
	return null;
}
}