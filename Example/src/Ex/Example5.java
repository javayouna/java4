package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 사용자가 직접 숫자를 입력 받습니다.
		 * 단, 사용자가 문자를 입력할 경우 예외처리가 진행되어야 합니다.
		 * 총 숫자 입력은 일곱번이며, 사용자가 입력한 숫자를 오름차순으로 정렬합니다.
		 * "숫자를 하나 입력해주시길 바랍니다. : " -7번
		 * 결과 - [6,22,37,44,45,80,100] 
		 * 
		 * 추가옵션 - 짝수와 홀수값을 별도로 배열을 관리하도록 합니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();

		try {
			int w = 1;
			while (w < 8) {
				System.out.println("숫자만 입력ㄱ");
				int ak = sc.nextInt();
				a.add(ak);
				if(ak % 2 == 0) {
					b.add(ak);
				}
				else {
					c.add(ak);
				}
				w++;
			}

		} catch (Exception e) {
			System.out.println("숫자만 입력하라고");
		}

		Collections.sort(b);
		Collections.sort(c);
		//System.out.println(a);
		
		System.out.println(b);
		System.out.println(c);

	}

}
