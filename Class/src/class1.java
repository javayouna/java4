/*�θ�Ŭ���� �� �ڽ�(����)Ŭ���� ����*/

public class class1 {

	public static void main(String[] args) {
		/*�θ� �ν��Ͻ��� ���� ���� ������ �ڽ� class�� ���� ȣ������ �� ��*/
		parents bb = new parents();
		bb.p_boc();
		parents.child pc = bb.new child(); 
		//(�θ�class.�ڽ�class �̸����� = �θ�Ŭ������ �θ� ��üȭ ���ذſ��ٰ� new �ڽ�Ŭ������(�ν��Ͻ��� ����)
		pc.c_box();
	}
}
class parents{ //�θ�Ŭ����
	String a = "ȫ�浿"; //�θ��ʵ忡 �ִ� ��������(this)
	String b;
	class child{ //�ڽ�Ŭ���� 
	int a = 20;
	
	public void c_box() {//�ڽĸ޼ҵ�
		double c = 10.5;
		System.out.println(c); //�ڽĸ޼ҵ� ���� �������� 
		System.out.println(this.a); //�ڽ�Ŭ���� ���� ��������
	    System.out.println(parents.this.a); //�θ�Ŭ���� ���� ��������
	    System.out.println(parents.this.b); //�θ�Ŭ���� ���� ��������
	    //a������ ������ parents.this.a (�θ� Ŭ���� �̸�. this)
	   //���࿡ class child�� �ƹ��͵� ���� ��Ȳ�̸� this.a�ϸ� �� ���� ���� ����� �κ� 
	}
	}
	public void p_boc() {    //�θ�޼ҵ忡 �ִ� �������� //�޼ҵ�ȿ��� class�� �� ���� 
		String a = "�̼���"; //p_box�� �ִ� �������� ���� 
		this.b=a;
		System.out.println(this.a); //this.a ���� "ȫ�浿", �׳� a���� �̼���
	}
}