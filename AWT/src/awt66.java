
public class awt66 {

	public static void main(String[] args) {
		
		handle2 mm = new handle2();
		mm.design();
	}

}
class handle2 extends awt66_abstract{
	String message2 ="";
	
	@Override
	public void setter(String userno) {
		System.out.println(pc);

		if(userno.equals(pc)) {
			this.message2="인증이 완료 되었습니다.";
		}
		else {
			this.message2="인증번호를 다시 확인하십시오";
			}
		
	}
	
	@Override
	public String getter() {
		return this.message2;
	}
}

//인증번호 횟수 제한 있음 