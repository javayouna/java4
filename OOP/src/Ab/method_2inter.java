package Ab;
//interface: ���� ��� : �޼��常 ���� , �߰��� ������ ó���ϴ� ������ default�� �߰���
public interface method_2inter { //�������̽��� �޼ҵ� �̹Ƿ� �ʵ忡 �ڷ����� ���� �� �� ���� 

	public String names(); //String name() return�޼ҵ� ���� 
	
	default void setbox(String name){ //setter
		System.out.println(name);
	}
	default String box3() { //getter
		//�������̽��� default �����ϸ� ���� �޼ҵ� �����
		//default void box3() { �������̽��� default�� �־���� �Ѿ, abstract�� �׳� �Ѿ 
		return null;
	}	
	
}

interface method_2re extends method_2inter { //interface�� extend�� �θ� interface�� �ε� �� �� �ֽ��ϴ�.
}