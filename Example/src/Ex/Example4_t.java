package Ex;

import java.util.ArrayList;
import java.util.Arrays;
/*선생님 풀이*/
//Example3 데이터베이스 활용 -> 회원 전체 포인트 합계 구하기
public class Example4_t {
	
	public static void main(String[] args) {
		
		aaa_1 a1 = new aaa_1();
		a1.setter();
		int k = a1.getter();	//retrun 받은 total 값을 k로 넣고
		System.out.println("회원 전체의 포인트 합계는 : " + k + "입니다.");	//k출력
	}

}
	
abstract class aaa {
	
	ArrayList<String[]> arr2;	//ArrayList 2차배열 이상 객체만 생성
	public abstract void setter();
	public abstract int getter();
	public abstract void DB3();
	
}

class aaa_1 extends aaa {
	int total = 0;
	
	@Override
	public void setter() {
		DB3();
//		System.out.println(this.arr2.get(0)[6]);	//포인트값이 잘 로드되나 확인
		int w = 0;
		while(w < this.arr2.size()) {	//배열 갯수만큼 반복문 돌림
			this.total += Integer.parseInt(this.arr2.get(w)[6]);	
			//상속 클래스 필드에 만들어둔 total 변수에 Integer.parseInt로 숫자로 바꿔서 포인트값을 전부 넣어줌(합계치)
			w++;
		}
		
	}
	
	@Override
	public int getter() {
		return this.total;	//합계치가 담긴 total 값을 main에 보냄
	}
	
	@Override
	public void DB3() {	//전부 '문자' 형태임
		String a[][] = new String[][] {
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
	this.arr2 = new ArrayList<>(Arrays.asList(a));	//추상 클래스 필드에 객체 생성한 arr2에 배열값을 넣어줌
		
	}
}
