package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		Integer a[] = { 3, 6, 9, 12, 15 };
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a)); // 중간중간 수정이 들어가는 경우네는 LinkedList가 좋음
		System.out.println(ln);

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();// 아무것도 없는 배열
		String user;
		//for(;;) 무한루프
		//do~while(true) 무한루프
		while (true) { // 무한 루프
			System.out.println("숫자를 입력하세요");
			user = sc.next(); //AWT에선 이것이 input파트
			try { //사용자가 입력한 값이 오류가 있는지 확인하는 파트
			int number = Integer.parseInt(user);
			list.add(number);
			int ea = list.size();
			
			if(ea>5) {
				break; //5개까지 배열이 입력되면 무한루프를 빠져나옴 
			}
			} 
			catch (Exception e) { //오류가 발생했을 때 작동되는 파트
				System.out.println("해당 입력사항은 문자입니다.\n 숫자만 입력해라");
			}

		}
		System.out.println(list); //break 넣으면 밖으로 빼도됨, why? 무한루프니까 break가 있거나 없어나에 따라 sysout위치가 바뀜
	}
}
