package Ex;

public class Example4 {

	public static void main(String[] args) {
		
		/*
		 * 응용문제
		 * 가입된 모든 회원의 포인트 총 합을 구하세요.
		 * 단, abstract를 무조건 사용합니다.
		 * 결과 : "회원 전체의 포인트 합계는 : 34390 입니다."
		 */
		
		total_a ta = new total_a();
		ta.ef();

	}

}

abstract class total {
 	protected String arr[][];
	public abstract void ef();
	public abstract void DB1();
}
class total_a extends total {
	int ea = 0;
	
	@Override
	public void ef() {
		DB1();
		int w = 0;
		int total = 0;
		while(w < this.ea) {
			//System.out.println(this.arr[w][6]);
			total += Integer.parseInt(this.arr[w][6]);
			w++;
		}
		System.out.printf("회원 전체의 포인트 합계는 : %d 입니다.",total);
		
	}
	
	@Override
	public void DB1() {
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
		this.ea = this.arr.length;
	}
}
