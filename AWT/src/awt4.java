
	//import java.awt.Button;
public class awt4 { //�̰� ��¾ȵǼ� �ڵ� �ٽ� ���ƾ���.. .

	public static void main(String[] args) {
		//awt4_class.java����
		//decorate de= new decorate ();
		//de.view();
		
		
	}

}


class decorate extends awt4_class {
	public String aws="";
	
	public void btn_push(int c) {
	/*����ڰ� �Է��� ���ڸ� �������� �������� �ۼ�*/
		String prf = "";
		for(int i=1; i<10; i++) {
			prf = prf + c +" * " + i + " = "+(c*i);
			//System.out.println(c + " * " + i + " = "+(c*i));
		}
		
	//this.aws=prf;
		public String calls() {
			return this.aws;
		}
		//System.out.println(c);
		
	}
	
	
	
	