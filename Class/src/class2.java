
public class class2 {

	public static void main(String[] args) {
		
		/* [���빮��]
		 * ����Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����ϼ���. 
		 * Ŭ������ 2���� �ֽ��ϴ�.
		 * �θ�Ŭ�������� :mother
		 * �ڽ�Ŭ�������� :child
		 * ���� Ŭ�������� mother Ŭ������ ���� ���� 30,50
		 * child���� �θ�Ŭ���� �ִ� ���� �޾Ƽ� �ΰ��� ���ڸ� ���� ��� ��� 
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
			
			/*int w; ���� �Ѱ�..
			w=mother.this.aa*mother.this.bb;
			System.out.println(w);*/
		}
		
	}
	
}