package Ab2;

public interface app_data1 {
	String a = "ȫ�浿"; 
	int b = 0 ;
	// �ʵ忡 �ڷ����� ����ִ� ���� ����ϸ����� ��ü�� �ȵ�/String a=null; ex String a; (X)
	public void user_join(); //���� ������ �޼ҵ�� this ������ 
	default void aaa() { //default�� this��� ���� ��(���� ���� ���) 
		System.out.println(this.a);
	}
}
