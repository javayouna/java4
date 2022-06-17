package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		//외부클래스는 무조건 씀
		//외부 class를 사용하여 다음 프로세서를 작성하세요.
		/*
		 *다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나로 합치도록 합니다. 
		 * 그 대신, 중복된 값은 하나로 처리로 합니다.
		 * 
		 * 1번 배열 11,22,33,44,55
		 * 2번 배열 8,10,11,19,44
		 * 
		 * 결과출력
		 * [8,10,11,19,22,33,44,55]
		 * 정렬되야함 
		 */
		Integer a[]= {11,22,33,44,55};
		Integer b[]= {8,10,11,19,44};
		
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(b));
		ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(a));

		a2.removeAll(b2);
		int ea=b2.size();
		for(int f=0; f<ea; f++) {
			a2.add(b2.get(f));
		}
		
		Collections.sort(a2);
		System.out.println(a2);
	}

}

public class number33{ //배열을 여기로 받아 오는 것.. ?
	
	
	
	
}
//	protected Integer a[]= {11,22,33,44,55};
//	protected Integer b[]= {8,10,11,19,44};
//	
//	ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(b));
//	ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(a));
//
//	a2.removeAll(b2);
//	int ea=b2.size();
//	for(int f=0; f<ea; f++) {
//		a2.add(b2.get(f));
//	}
//	
//	Collections.sort(a2);
//	System.out.println(a2);
//	}

