import java.util.Arrays;

/* 배열 신규 생성값을 정확하게 설정하여 신규배열로 생성하기*/
public class oop2 {

	public static void main(String[] args) {
		// 배열 가지고 만드는 것 ;;
		array1 ar = new array1();
	}

}

class array1{
	
	private int ar1[];
	private int ea;
	public array1(){ //배열을 필드에 있는 변수 선언으로 처리 하는 방식(this)
		this.ar1= new int[]{1,2,3,4,5,6,7}; // this를 쓰려면 이렇게 쓰면 됨 
		this.ea = this.ar1.length;
		//System.out.println(Arrays.toString(this.ar1));
		//System.out.println(ea); //인덱스 갯수 알 수 있음 
		//5이상 배열값만 가져오기 
		int w=0;
		String newdata=""; // ,<-가 들어가야해서 스트링
		while(w<ea) {
			
			if(this.ar1[w]>=5) {
				newdata += this.ar1[w]+","; 
				//★해당 조건에 맞는 값만 문자열로 변환하여 저장
			}
			w++;
		}
	
		String ar2[]= newdata.split(",") ; 
		//★해당 저장된 문자열을 split으로 구분하여 배열로 전환 split은 절대 int는 안대용
		int ar2_ea =ar2.length;
		int oridata[]=new int[ar2_ea];
		//★문자열 갯수만큼 배열생성자 값을 추가하게 됩니다.
		
		int ww=0;
		while(ww<ar2_ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]); //★문자열을 숫자로 변환/신규 배열 생성자한테 값 저장
			ww++;
		}
				//System.out.println(Arrays.toString(ar2)); //출력:[5, 6, 7]
				//System.out.println(ar2_ea); //출력 3
				System.out.println(Arrays.toString(oridata));
	}

}