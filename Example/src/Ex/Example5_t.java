package Ex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example5_t {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 사용자가 직접 숫자를 입력 받습니다.
		 * 단, 사용자가 문자를 입력할 경우 예외처리가 진행되어야 합니다.
		 * 총 숫자 입력은 일곱번이며, 사용자가 입력한 숫자를 오름차순으로 정렬합니다.
		 * "숫자를 하나 입력해주시길 바랍니다. : " -> 7번
		 * 결과 예) [6,22,37,44,45,80,100] 
		 * 
		 * 추가옵션 - 짝수와 홀수값을 별도로 배열을 관리하도록 합니다.
		 */
		
		/* 아래 주석처리한 것들은 추가옵션 문제임! */
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data = new LinkedList<>();	//짝수	//LinkedList로 빈배열 하나 생성
//		LinkedList<Integer> data2 = new LinkedList<>();	//홀수	/* !추가옵션! 홀수값을 넣을 배열 생성 */		
		int w = 0;
		do {
			System.out.println("숫자를 하나 입력해주세요.");	//7번 출력되어야 하니까 반복문 안에 넣어줌
			try {	//try~catch문으로 문자를 쓸 경우를 예외처리 해줌
				Integer ck = Integer.valueOf(sc.next());	//사용자가 숫자를 입력한게 맞다면
//				if(ck % 2 == 0) {	/* !추가옵션! try문 안에 조건문을 넣어, 만약 사용자 입력값이 짝수라면 */				
					data.add(ck); // LinkedList 빈 배열에 사용자 입력값을 추가해줌
//				}
//				else {	/* !추가옵션! 홀수라면 data2 배열에 넣어주세요 */		
//					data2.add(ck);
//				}
			}
			catch (Exception e) {	
				System.out.println("숫자를 입력하셔야 합니다.");
			}
			w++;
		}while(w < 7);	//7번만 돌아감(w = 0으로 설정했기 때문)
		Collections.sort(data);	 	//Collections을 이용해서 내림차순 정렬
//		Collections.sort(data2);
		System.out.println(data);	
//		System.out.println(data2);	/* !추가옵션! data배열과 같이 출력하면 짝수, 홀수 나눠서 출력 가능 */		

	}

}
