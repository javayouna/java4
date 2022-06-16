
public class class2 {

	public static void main(String[] args) {
		
		/* [응용문제]
		 * 더블클래스를 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하세요. 
		 * 클래스는 2가지 있습니다.
		 * 부모클래스명은 :mother
		 * 자식클래스명은 :child
		 * 메인 클래스에서 mother 클래스로 값을 전달 30,50
		 * child에서 부모클래스 있는 값을 받아서 두개의 숫자를 곱한 결과 출력 
		 */
		
		mother sc = new mother();
		sc.sb(30,50);
		mother.child pc = sc.new child();
		pc.sb2();
	}

}
class mother{
int aa;
int bb;
	
public void sb(int a, int b) {
	this.aa=a;
	this.bb=b;
}
	class child{
		int aa= mother.this.aa;
		int bb= mother.this.bb;
		public void sb2() {
			int cc = this.aa*this.bb;
			System.out.println(cc);
			
			/*int w; 내가 한것..
			w=mother.this.aa*mother.this.bb;
			System.out.println(w);*/
		}
		
	}
	
}