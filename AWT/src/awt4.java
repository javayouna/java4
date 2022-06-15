
	//import java.awt.Button;
public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java연계
		decorate de= new decorate ();
		de.view();
		
		
	}

}


class decorate extends awt4_class {
	public String aws="";
	
	public void btn_push(int c) {
	/*사용자가 입력한 숫자를 기준으로 구구단을 작성*/
		//this.aws=
		for(int i=1; i<10; i++) {
			System.out.println(c + " * " + i + " = "+(c*i));
		}
		
		public String calls() {
			return this.aws;
		}
		//System.out.println(c);
		
	}
	
	
	
	
	
}