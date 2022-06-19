package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 * 외부class를 사용하여 다음 프로세서를 작성하세요.
		 * 다음 2개의 배열 데이터가 있습니다.
		 * 단, 2개의 배열을 하나의 배열로 합치도록 합니다.
		 * 그대신 중복된 값은 하나로 처리를 하셔야 합니다.
		 * 1번 DB : 11,22,33,44,55
		 * 2번 DB : 8,10,11,19,44
		 * 결과 출력 : 8,10,11,19,22,33,44,55
		 */
		
		ak_data ad = new ak_data();
		ad.add();
		

		

	}

}


class ak_data {
	//ArrayList<Integer> a = null;
	
	public void add() {
		Integer box[] = new Integer[10];
		int a1[] = {11,22,33,44,55};
		int a2[] = {8,10,11,19,44};
		
		int w = 0;
		int ct = 0;
		while(w < a1.length) {
			box[ct] = a1[w];
			ct++;
			box[ct] = a2[w];
			ct++;
			w++;
		}
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(box));
		a.remove(0);
		a.remove(8);
		
		Collections.sort(a);
		System.out.println(a);
		
	}
	

}