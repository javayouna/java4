package Ex;

import java.util.ArrayList;
import java.util.Arrays;
/* 선생님이 짠 코드 */
//DB는 http://mekeyace.dothome.co.kr/example2_db.txt 에 있음
public class Example2_t {

	public static void main(String[] args) {

		user_list ul = new user_list();
		ul.setter("naver.com");	//setter 메소드에 naver.com 값 전달
		int total = ul.getter();	//getter에서 retrun값을 받아 total 이라는 변수에 넘겨줌
		System.out.println(total);	//total 출력하면 3이란 결과가 나옴
	}

}

abstract class basic {	//추상 클래스 생성	
	String arr[][];

	// ArrayList<String> ar1 = null;	//ArrayList 사용시 필드에 먼저 선언해줌
	
	public abstract void setter(String email);	//setter메소드 생성

	public abstract int getter();	//getter 메소드 생성

	public abstract void DB();	//데이터베이스 메소드 생성

}

class user_list extends basic {
	
	int ea = 0;
	int total = 0;

	@Override
	public void setter(String email) {	//main에서 naver.com 값을 받음
		DB();	//제일 먼저 DB를 불러옴(데이터베이스를 불러와서 대조해야 하니까)
		int w = 0;	
		while (w < this.ea) {
			
			/*	!-선생님이 ArrayList로 값을 구하는거랑 기본 배열로 값을 구하는 법 두 가지 알려줌-!
			 * 	!-ArrayList 사용시 단점 : ArrayList로 생성시 메모리 할당 오버되는 상황이 올 수 있음-!
			 * 	this.ar1 = new ArrayList<>(Arrays.asList(this.arr[w][5])); 
			 * 	if(this.ar1.get(0).indexOf(email) != -1) { //배열에선 indexOf를 바로 적용할 수 없기 때문에 get(0) 을 붙여줘야 함
			 * 		this.total += 1; 
			 * }
			 */
			
			/* 원시형태의 배열사항으로 카운팅함 
			   indexOf : -1(없음) , -1 외 모든 정수는 값이 있음 */
			if (this.arr[w][5].indexOf(email) != -1) {	//arr배열 5번째 인덱스라인(이메일라인)에 naver.com이 아닌 걸 제외하고
				this.total += 1;	//naver.com 의 갯수 카운팅
			}
			w++;
		}
	}

	@Override
	public int getter() {
		return this.total;	//getter로 total값(naver.com의 총갯수)을 보내줌
	}

	@Override
	public void DB() {	
		//추상 클래스 필드에 선언한 String arr[][] 에 다차원 배열값 넣어주기
		this.arr = new String[][] { 
				{ "홍길동", "SKT", "010-1236-4879", "45", "종로구", "hong@gmail.com", "2200" },
				{ "김도형", "LG", "010-1267-5879", "25", "강남구", "kim@nate.com", "2100" },
				{ "서한솔", "LG", "010-1267-4112", "37", "종로구", "soso4112@naver.com", "1200" },
				{ "정재성", "SKT", "010-3221-8871", "41", "강남구", "jsung_kks@naver.com", "700" },
				{ "한울", "KT", "010-2455-4879", "22", "금천구", "han1004@nate.com", "920" },
				{ "강은형", "SKT", "010-3770-4009", "34", "종로구", "kans32@gmail.com", "1250" },
				{ "김실", "KT", "010-1606-3137", "20", "은평구", "kimsil_love@nate.com", "4505" },
				{ "서한결", "SKT", "010-3412-0902", "31", "금천구", "hanso12@nate.com", "2125" },
				{ "정재혁", "LG", "010-4557-8282", "30", "은평구", "jehyuk@naver.com", "8160" },
				{ "이선영", "KT", "010-3738-4800", "55", "강서구", "sunyoung@nate.com", "4510" },
				{ "차은우", "SKT", "010-5242-0879", "42", "강남구", "chreey@gmail.com", "6720" } 
		};
		//자식 클래스 필드에 선언한 int ea에 배열의 갯수를 넣어줌 (11개)
		this.ea = this.arr.length;
		
	}

}
