import java.util.ArrayList;
import java.util.Arrays;

//중복 아이디 체크 시스템 만들기 : awt5_abstract 함께 사용 
//회원데이터: hong, lee, park, 
public class awt5 {

	public static void main(String[] args) {

		handel hd = new handel();
		hd.design();
	}
}
class handel extends awt5_abstract {
	private String aid; // awt에서 넘어온 인수값을 클래스에서 활용
	private String return_id;
	// awt로 다시 값을 전달 하는 전역 변수 :
	// null일 경우 아이디 사용 가능
	// 아이디값이 전달 되면: 해당 아이디는 사용 할 수 없음
	ArrayList<String> db = null;

	@Override
	public void idcheck(String id) { // setter
		this.return_id=null; //초기화 시켜주기 //awt에서 중복버튼을 클릭하면
		//해당 변수를 지속적으로 초기화 하는 부분
		this.aid = id;
		this.dataload(); //정상적으로 데이터가 넘어왔을 경우 해당메소드 로드하여 확인 하게 됨 
		int ea = this.db.size();
		int w = 0;
		while (w < ea) {
			if (this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
	}
	@Override
	public String signok() { // getter
		return this.return_id;
	}

	@Override
	public void dataload() {
		String ori[] = { "hong", "lee", "park","jong","kim" };
		this.db = new ArrayList<>(Arrays.asList(ori));
		// System.out.println("test");
	}
}