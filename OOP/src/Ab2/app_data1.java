package Ab2;

public interface app_data1 {
	String a = "홍길동"; 
	int b = 0 ;
	// 필드에 자료형을 비어있는 값을 사용하면적용 자체가 안됨/String a=null; ex String a; (X)
	public void user_join(); //선언 형태의 메소드는 this 사용못함 
	default void aaa() { //default는 this사용 가능 함(값이 있을 경우) 
		System.out.println(this.a);
	}
}
