import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		//��͸޼ҵ� ���� ���� ���� �ݺ����� Ƚ���� ���ؾ������� �䷸�� ���� �������� ��� ���� 
		//��͸޼ҵ�� Ŭ�����ϳ����� ���� ��..!! Ŭ���� ���������� ���°� ��� 
		op_method om = new op_method(); //������ ���� ������� ����
		
	}

}
//��͸޼ҵ� : �޼ҵ带 ���� �Ǵ� �������� ȣ���ϴ� ���μ���
//�ݺ���, �ܺ� class�� ����� �� ������ ������ ���� �ذ� �ϱ� ���ؼ�
//�����ϴ� �޼ҵ� ���¸� ���մϴ�.
class op_method{
	Scanner sc = new Scanner(System.in); //�޸𸮽��̴°� �����ϱ����� �ѹ��� �����ϸ� �ؿ��� �� �� ���� 
	private String nm;
	
	public op_method() { //���� ���� �ҵ�
		this.m1(); //�̰Ŵ� ����� �� 
	}
	public void m1() { //�޼ҵ� m1 �۵� 
		System.out.println("ã�� �̸��� �Է��ϼ���.");
		this.nm=sc.next();
		this.m2(); //�μ��� ó������ ������ ���ƿ�.
		//this.m2(); //���� Ŭ������ private���� m2�� �Ѿ��.
	}
	public void m2() { //m1�� ���� ������� m2�� Ȯ�� 
		if(this.nm.equals("ȫ�浿")) {
			sc.close();
			System.exit(0);
			
		}
		else {
			System.out.println("�ش� �̸��� �����ϴ�");
			this.m1(); //ȫ�浿 ���� ������ ��� ȣ�� (m1�� �� ȣ��(��͸޼ҵ�))
		}
	}
}
