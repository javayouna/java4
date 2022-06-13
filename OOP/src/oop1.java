import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		//재귀메소드 사용법 자주 쓰임 반복문은 횟수를 정해야하지만 요렇게 쓰면 무한으로 사용 가능 
		//재귀메소드는 클래스하나에서 도는 것..!! 클래스 여러개에서 도는건 노노 
		op_method om = new op_method(); //메인은 많이 사용하지 않음
		
	}

}
//재귀메소드 : 메소드를 직접 또는 간접으로 호출하는 프로세서
//반복문, 외부 class를 재실행 등 복잡한 문제를 쉽게 해결 하기 위해서
//구현하는 메소드 형태를 말합니다.
class op_method{
	Scanner sc = new Scanner(System.in); //메모리쌓이는걸 방지하기위해 한번만 선언하면 밑에서 쓸 수 있음 
	private String nm;
	
	public op_method() { //최초 실행 소드
		this.m1(); //이거는 숨기는 것 
	}
	public void m1() { //메소드 m1 작동 
		System.out.println("찾을 이름을 입력하세요.");
		this.nm=sc.next();
		this.m2(); //인수는 처음에만 때리면 좋아요.
		//this.m2(); //같은 클래스라서 private여도 m2로 넘어가요.
	}
	public void m2() { //m1에 대한 결과값을 m2가 확인 
		if(this.nm.equals("홍길동")) {
			sc.close();
			System.exit(0);
			
		}
		else {
			System.out.println("해당 이름은 없습니다");
			this.m1(); //홍길동 나올 때까지 계속 호출 (m1을 재 호출(재귀메소드))
		}
	}
}
