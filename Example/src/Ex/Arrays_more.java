package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList 2차 배열형태 (다차원도 포함)
// http://mekeyace.dothome.co.kr/Arraylist.txt (2차배열형태)

public class Arrays_more {

	public static void main(String[] args) {
		/* 다차원 배열에서 회원의 전화번호만 따로 추출 */
		String member_data[][] = {
				{ "홍길동", "SKT", "010-1236-4879", "45", "종로구", "hong@gmail.com", "2200" },
				{ "김도형", "LG", "010-1267-5879", "25", "강남구", "kim@nate.com", "2100" },
				{ "이선영", "KT", "010-3738-4800", "55", "강서구", "sunyoung@nate.com", "4510" },
				{ "차은우", "SKT", "010-5242-0879", "42", "강남구", "chreey@gmail.com", "6720" }
		};
		//String[] : 2차배열 이상 / Integer[] : 2차배열 이상
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
		/*String이나 Integer 옆에 []를 붙여주면 2차배열 이상 완성
		  but, ArrayList로 만든 2차배열, 다차원배열은 데이터를 전부 출력하려면 반복문 돌려야함*/
		
		//System.out.println(list.get(0)[1]); -> 이런식으로 데이터 갯수 하나씩만 확인 가능.. (선생님이 전체 보는 건 모르는건지 방법이 없는건지 안알려줬어 ㅠ)
		
		
		int w = 0;
		
		while (w < list.size()) {
			System.out.println(list.get(w)[2]);	//.get(반복문)[인덱스 숫자]
			w++;
		}

	}

}
