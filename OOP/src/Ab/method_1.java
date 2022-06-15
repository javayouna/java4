package Ab;

import java.util.Arrays;

//method_1a.java
public class method_1 extends ide_mth1 { 
	//package Ab2에서 import할 수 있또록 하며, 외부 클래스도 동일하게 모두 가져오게함 
	
	public void recall() { //Ab2패키지와 공유설정 메소드
		System.out.println("test");
	}
	 protected static void name(){ //protected만 하면 안됨 static같이..!1\ 
		System.out.println("홍길동");
	}
	
	
	public static void main(String[] args) {
		/*
		 * Arrays.sort : 배열 오름차순 정렬 (숫자, 한글, 영문) 단, 영문일 경우 대문자가 제일 먼저 오름차순으로 정렬됨 int
		 * number_data[] = { 5, 7, 1, 4, 9, 2 }; //Arrays.sort(number_data); // sort 숫자
		 * 정렬 오름차순 System.out.println(Arrays.toString(number_data));
		 * 
		 * String user_data[]= {"홍길동","이순신","장보고","김유신"}; Arrays.sort(user_data); //sort
		 * 한글도됨 System.out.println(Arrays.toString(user_data));
		 */
		String user = "oh";
		int point = 2500;
		/*
		 * [응용문제] 변수를 2개 생성 1개는 문자, 1개는 숫자 현재 가입된 사용자 아이디를 확인 후 해당 포인트가 적립 되도록 합니다. 단,
		 * 기존 포인트 + 적립금 포인트 결과를 출력 출력은 main class에서 사용
		 */
		ide_mth1 yn = new ide_mth1();
		yn.setter(user, point);
		System.out.println(yn.getter());
	}
}

class ide_mth1 extends mth1 { //여기가 public class일수 없는 이유 : public class는 하나 밖에 못 끌고옴  

	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total = 0;
	private String msg;
	public ide_mth1() {
		this.member_ship = new String[][] { { "kim", "park", "seo", "oh", "lee", "jang", "jeong", "cho", "wang" },
				{ "1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800" } };
		this.ea = this.member_ship[0].length;
	}

	@Override
	public void setter(String data1, int data2) { // 해당 메소드 적용
		this.data1 = data1;
		this.data2 = data2;
		this.loops(this.data1, this.data2, this.ea);
		// if(data3.equals("증감")){
		// this.loops(); 등등 가능

	};

	public void loops(String a, int b, int c) { // static쓰면 this못씀 쓰려면 this.loops(this.ea)
		int w = 0;
		while (w < c) {
			if (this.member_ship[0][w].equals(a)) {
				this.total = Integer.parseInt(this.member_ship[1][w]) + data2;
			}
			w++;
		}
		this.msg="증감";

	}

	@Override
	public void setter(int data3[]) {
	};

	@Override
	public String getter() {
		String print = this.data1+ "님 포인트가 " + this.total + this.msg +"되었습니다.";
		return print;
	};
}