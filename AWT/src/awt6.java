import java.nio.file.attribute.AclEntry;

//인증번호발송 시스템 인증번호가 올바른지 아닌지 
public class awt6 {

	public static void main(String[] args) {
	//버튼 누르고 인증번호 발송(콘솔창에) 
	//입력값이 같으면 같다고 아니면 아니라고 ㅋ...
	//[프로세스 작동 사항] 
    //닫기 클릭:프로그램 종료
	//인증번호 발송 클릭 pc가 4자리 숫자 0~9까지 각 한가지를 선택 하게됌
	//총 인증 번호는 4자리 숫자이며, 해당 숫자는 console로 출력 
		//사용자가 해당 값을 아무것도 입력하지않으면 
		//메세지에 "인증번호 4자리를 입력하세요"
		
		number2 mm = new number2();
		mm.design();
		
	}

}


class number2 extends awt6_abstract{
	private int auser; //랜덤함수
	private int honuser; //사용자입력값
	
	@Override
	public String signok() {
		
		return null;
	}

//	@Override
//public void nmcheck(int mid2) {
//		this.auser=mid2;
	
	
	
	@Override
	public void dataload() {
		
	}

	@Override
	public void nmcheck() {
		
		
	}

}