import java.nio.file.attribute.AclEntry;

//������ȣ�߼� �ý��� ������ȣ�� �ùٸ��� �ƴ��� 
public class awt6 {

	public static void main(String[] args) {
	//��ư ������ ������ȣ �߼�(�ܼ�â��) 
	//�Է°��� ������ ���ٰ� �ƴϸ� �ƴ϶�� ��...
	//[���μ��� �۵� ����] 
    //�ݱ� Ŭ��:���α׷� ����
	//������ȣ �߼� Ŭ�� pc�� 4�ڸ� ���� 0~9���� �� �Ѱ����� ���� �ϰԉ�
	//�� ���� ��ȣ�� 4�ڸ� �����̸�, �ش� ���ڴ� console�� ��� 
		//����ڰ� �ش� ���� �ƹ��͵� �Է����������� 
		//�޼����� "������ȣ 4�ڸ��� �Է��ϼ���"
		
		number2 mm = new number2();
		mm.design();
		
	}

}


class number2 extends awt6_abstract{
	private int auser; //�����Լ�
	private int honuser; //������Է°�
	
	//@Override
	//public String signok() {
		
	//	return null;
	//}

//	@Override
//public void nmcheck(int mid2) {
//		this.auser=mid2;
	
	
	
	
	@Override
	public void nmcheck(int auser) {
		this.auser=auser; //������ȣ 
		
		//if(auser==)
		
	}
	@Override
	public void dataload(int honuser) {
		this.honuser=honuser; //�����Է°�
		
		if(auser==honuser) {
			msg.setText("���� �Ǿ����ϴ�");
		}
		else {
			msg.setText("������ Ʋ�Ⱦ��");
		}
	}

}