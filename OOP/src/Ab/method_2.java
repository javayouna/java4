package Ab;
/*abstract�� interface�� ������ �� ������*/
public class method_2 {
	//method_2inter and method_2inter2 interface�����
	public static void main(String[] args) {
		loadinter ld = new loadinter();
		ld.setbox("ȫ�浿");
		
	}

}
//�߿�:acstract�� interface�� ��� static�� ����� �� ���� 

 abstract class test{ //abstract class�� public �� ��� �˾Ƽ��ɸ� abstract�� default�� ������� ���� (public�� �⺻���� ����)
	 //�ʵ忡 �ڷ����� ������ �� ���� 
	public String nn;
	public abstract void box();
	public void box2(String n) {
		this.nn= n;
		System.out.println(this.nn);
	}
}



class loadinter implements method_2re, method_2inter2{ //���߻�� 
	@Override
	public String names() {
	return null;
}
}