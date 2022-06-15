package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(추가), get(가져오기), remove(삭제), size(인덱스 크기) : 
		//ArrayList util 메소드에서 사용하는 부분
		//Arrays.asList: 로드할 배열 변수를 적용
		//중요: add는 일반적으로 무조건 맨 뒤에 데이터가 추가됨 단, index번호를 적용 후 값을 실행하면
		//해당 index 부분에 추가가 됩니다.
		//String member[] = {"이순신", "홍길동", "유관순", "강감찬"};
		//ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
//		//System.out.println(mb);
//		int ea = mb.size();
//		//System.out.println(ea);
//		mb.add("김유신"); //김유신이 추가되면서 기존의 인덱스 번호가 변경되니 확인 할 것
//		//System.out.println(mb);
//		mb.remove(1);
//		//System.out.println(mb);
//		mb.add(3,"세종대왕"); //인덱스 번호 3번에 세종대왕 입력
//		//System.out.println(mb);
//		String checks = mb.get(2);
//		//System.out.println(checks);
		
		
		/*[응용문제]
		 *{15, 22, 37, 8, 11, 19, 41}; 
		 *데이터를 커스텀하여 다음 결과값이 출력하세요.
		 *결과값
		 *[7,15,22,8,11,39,41]
		 */
		/*ArrayList에는 int를 사용하지 않음(Integer)사용함*/
		Integer numbers[] = {15, 22, 37, 8, 11, 19, 41};
		ArrayList<Integer> mm = new ArrayList<>(Arrays.asList(numbers));
		
		mm.remove(2);
		mm.remove(4);
		
		mm.add(0,7);
		mm.add(5,39);

		System.out.println(mm);
		
		
		
	}

}
