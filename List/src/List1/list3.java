package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*[응용문제]
		 * 넘버데이터   1 3,6,9,12,15
		 * 넘버데이터2  2,4
		 * 
		 * 결과: 3,6,9,12,15,2,4 //데이터1에 데이터2추가하기
		 */ 
		//ArrayList<Integer> mm = new ArrayList<>(Arrays.asList(uu));
	
		/*Arrays.sort: 배열변수 형태만 적용합니다.*/
		Integer a[]= {3,6,9,12,15};
		Integer b[]= {2,4};
	
		ArrayList<Integer> b2 = new ArrayList<>(Arrays.asList(b));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(a)); //추가할 얘가 기준
		
		int ea = b2.size();
			for(int f=0;f<ea;f++) {
					a2.add(b2.get(f));
		
		}
		//Integer c[]=bb;
		//Arrays.sort(c); //Arrays List로 sort는 안댐 ;ㅁ; 쓰려면 int c[]=new int[9]이럴땐 가능
		//System.out.println(Arrays.toString(c));
		System.out.println(a2);
		Collections.sort(a2); //ArrayList, LinkedList sort 오름차순 정렬 
		System.out.println(a2);
		
		
		int ea2 = a2.size();
		System.out.println(ea2); //
	}

}
