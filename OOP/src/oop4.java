
public class oop4 {
	// �߻�Ŭ���� �� �޼ҵ� abstract �ε带 ���� = ���ο� �� ����
	// �߻� �޼ҵ�� �ݵ�� �����ϰų� Ŭ���� ���¸� �߻�Ŭ������ �ٲ������ 
	public static void main(String[] args) {

			ab_2 ab = new ab_2(); //abstract�� ��üȭ�� �� �Ǽ� extends�� �����ͼ� ��üȭ 
		//ystem.out.println(ab.b());
			ab.ab_a();
	}

}

abstract class ab_1 { // �߻�Ŭ���� (ghost) �ܺο��� �ε尡 �� �� �ȵ� -��ü ����(x)
	public int c;
	public void ab_a() { //free (�μ��� ���� �߻� �޼ҵ�) -����ص��ǰ� ���صε�
		//System.out.println("�θ� Ŭ���� �Դϴ�."); //ȯ�漳�� ������ �� �� ��� ex ��ĳ�� ������ 
		 c = 0123456;
	}
	public void ab_a(int a) { //free (�μ��� �Ǵ� �߻� �޼ҵ�)
		
	}
	public abstract void ab_c(); //14���ٺ��� �̰����� free�ϱ� 
	public abstract int b(); // abstract���� �ڿ� (�μ���) ����; //�߻� �޼ҵ� (free����)- ��ü���� (x)
	// ���߻� �޼ҵ� - ��ü ����(x)
	
}
class ab_2 extends ab_1{
	@Override
	public void ab_c() {
		
	}
	public void ab_a() {
		System.out.println(this.c);
	}
	
	@Override
	public int b() { //���� �޼ҵ�+�߻� �޼ҵ�
		return 55;
	}
}
	@Override
	public int c() {
		return 99;
	}

}