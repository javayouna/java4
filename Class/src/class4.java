import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 * [���빮��] �迭������ : ȫ�浿, �̼���, ������ ���� class���� ���ڸ� �ϳ� �����մϴ�. ��, ���ڰ� null�� ���� ���� �ְ�,
		 * �迭 �����Ϳ� ������� ���ڸ� ���� ���� �ִ� (ex ������)
		 * 
		 * �ܺ� Ŭ������:data_list �߻� Ŭ������:v_constuct �ܺ� Ŭ�����ȿ� ���� Ŭ�������� check�Դϴ�.
		 * 
		 * [���] ���� class���� ������ ���� ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�." ���� class���� �̼��� ���� ����
		 * Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�." ��� ��� �� ArrysList�� �ϱ�
		 */
		data_list mm = new data_list();
		mm.userinput("������");		
	}
}
abstract class v_constuct {
	String user_name;

	public abstract void userinput(String nm);
}

class data_list extends v_constuct {
	@Override
	public void userinput(String nm) {
		if (nm == null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
		} else {
			this.user_name = nm; // ���ڰ� ���� try catch
			check ck = new check(); //����ٰ� class�� �ѹ� �� ���ֱ� 
			ck.db();
		}
	}
	class check {//�θ�Ŭ�������� ���� ���� �ڽ� Ŭ������ �̰� 
		String user_name = data_list.this.user_name; //�θ�Ŭ�������� ���� ���� �ڽ� Ŭ������ �̰� 
		String data_list[];//�ʵ忡 �迭�� �޴� ��ü ���� ��ü�� �����Ѱ� �ν��Ͻ��� new�����߿ö󰡴� �� 
		ArrayList<String> ar=null; // ArrayList util�� �ʵ忡 ��ü ���� . 
		public void db() { // ����ٰ� ��� �� �� ������
			//�ش� �ʵ忡 �ִ� ArrayList�� �ν��Ͻ��� ������ 
			this.data_list = new String[] {"ȫ�浿","�̼���","������"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); //this�� ó�� 
			this.compare(); //������ѹ�����  ���� db�� ����� ������ ���ϴ� �޼ҵ� 
		}		
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			boolean bl = false; //��� Ȯ�� �۾� 
			do {
				if(this.user_name.equals(this.ar.get(w))) {
					bl=true;
				}
				w++;			
			}while(w<ea);
			if(bl==true) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			}
			else {
				System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
			}
		}
	}
}
