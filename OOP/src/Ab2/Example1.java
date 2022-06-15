package Ab2;

public class Example1 {
	public static void main(String[] args) {

		home h[] = { new computer(), new monitor() };
		home2 h2[] = { new phone() }; // extends로 home을 로드하였음
		h[0].broken(40);
		h[1].broken(0);
		h2[0].broken(25);

	}

}

class computer implements home {
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원 공급 중!!");
	}

	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원 중단!!");
	}

	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("컴퓨터 고장!!");
		} else if (this.bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}

class monitor implements home {
	@Override
	public void poweron() {
		System.out.println("모니터 전원 공급 중!!");
	}

	@Override
	public void poweroff() {
		System.out.println("모니터 전원 중단!!");
	}

	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("모니터 고장!!");
		} else if (this.bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}

/*
 * 휴대폰에 추가 기능이 필요합니다. 휴대폰 고장시 최소전원(20) -> 정상작동 40~79정상, 80이상(고장) 1.전원은 공급되지만 화면이
 * 고장날 경우 (공급중 작동이 안 되는 경우) 20~39 2.전원을 공급시키지만 충전이 안될 경우 (공급이 아예 안 되는 경우) 20이하
 */
class phone implements home, home2 { // 기능 추가
	@Override
	public void poweron() {
		System.out.println("휴대폰 전원 공급 중!!");
	}

	@Override
	public void poweroff() {
		System.out.println("휴대폰 전원 중단!!");
	}

	@Override
	public void powerchk1() {

		System.out.println("전원을 공급시키지만 화면이 고장 날 경우"); // 20~39
	}

	@Override
	public void powerchk2() {
		System.out.println("전원을 공급시키지만 배터리 충전이 안 될 경우"); // 20미만
	} 

	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("휴대폰 고장!!");
		} else if (this.bk > 20 && n > 0) {

			if (n < 20) {
				this.powerchk2();
			} else if (n >= 20 && n < 39) {
				this.powerchk1();
			} else {
				this.poweron();
			}
		}	 else {
			this.poweroff();

		}
	}

}