
public class time3 {

	public static void main(String[] args) {
		/*
		 * try { //얘는 정지가 있음 time2는 exit없으면 계속돌아감
		 * System.out.println("수업시작"); Thread.sleep(5000);
		 * System.out.println("수업종료");
		 * }catch(InterruptedException a) { System.out.println(a); }
		 */
		/*
		 * [응용문제] 외부 class가 있습니다. 단 메인 클래스에서 해당 외부 class를 로드하면 해당 메소드에서 즉각적으로
		 * "처리중입니다. 잠시만 기다려주세요." 8초동안 로딩이 발생합니다. 8초 이후에 return으로 "입금이 모두처리 되었습니다."라는 문자를
		 * 받도록 하십시오.
		 */
		bank yn = new bank();
		yn.money();
	}
}

class bank {
	public void money() {
		try {
			System.out.println("처리중입니다. 잠시만 기다려 주세요.");
			//int c = 0*6;
			Thread.sleep(8000);
			//String kkk = this.msg();
			System.out.println(this.msg());
		} catch (InterruptedException a) {
			System.out.println(a);
		}
	}

	public String msg() {
		return "입금이 모두 처리 되었습니다";
	}

}

/*
 * class te {
 * 
 * private String msg;
 * 
 * public te(String m) { String msg = m; } public String getMsg() { try { msg =
 * "처리중입니다. 잠시만 기다려주세요."; Thread.sleep(8000); msg = "입금이 모두처리 되었습니다."; } catch
 * (InterruptedException a){ System.out.println(a); } return msg; } }
 */

