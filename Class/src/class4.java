import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 * [응용문제] 배열데이터 : 홍길동, 이순신, 유관순 메인 class에서 문자를 하나 전송합니다. 단, 문자가 null로 보낼 수도 있고,
		 * 배열 데이터와 관계없는 문자를 보낼 수도 있다 (ex 강감찬)
		 * 
		 * 외부 클래스명:data_list 추상 클래스명:v_constuct 외부 클래스안에 내부 클래스명은 check입니다.
		 * 
		 * [결과] 메인 class에서 강감찬 적용 내부 클래스에서 "해당 사용자는 가입자가 아닙니다." 메인 class에서 이순신 적용 내부
		 * 클래스에서 "해당 사용자가 있습니다." 라고 출력 단 ArrysList로 하기
		 */
		data_list mm = new data_list();
		mm.userinput("유관순");		
	}
}
abstract class v_constuct {
	String user_name;

	public abstract void userinput(String nm);
}

class data_list extends v_constuct {
	@Override
	public void userinput(String nm) {
		if (nm == null) {
			System.out.println("사용자 이름을 입력하셔야 합니다.");
		} else {
			this.user_name = nm; // 숫자가 들어가면 try catch
			check ck = new check(); //여기다가 class꺼 한번 더 써주기 
			ck.db();
		}
	}
	class check {//부모클래스에서 받은 값을 자식 클래스로 이관 
		String user_name = data_list.this.user_name; //부모클래스에서 받은 값을 자식 클래스로 이관 
		String data_list[];//필드에 배열을 받는 객체 생성 객체만 생성한거 인스턴스는 new때려야올라가는 것 
		ArrayList<String> ar=null; // ArrayList util을 필드에 객체 생성 . 
		public void db() { // 여기다가 출력 할 수 도있음
			//해당 필드에 있는 ArrayList를 인스턴스로 적용함 
			this.data_list = new String[] {"홍길동","이순신","유관순"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); //this로 처리 
			this.compare(); //종료시켜버리기  최종 db와 사용자 정보를 비교하는 메소드 
		}		
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			boolean bl = false; //결과 확인 작업 
			do {
				if(this.user_name.equals(this.ar.get(w))) {
					bl=true;
				}
				w++;			
			}while(w<ea);
			if(bl==true) {
				System.out.println("해당 사용자가 있습니다.");
			}
			else {
				System.out.println("해당 사용자는 가입자가 아닙니다.");
			}
		}
	}
}
