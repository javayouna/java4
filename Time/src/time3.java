
public class time3 {

	public static void main(String[] args) {
		/*
		 * try { //��� ������ ���� time2�� exit������ ��ӵ��ư�
		 * System.out.println("��������"); Thread.sleep(5000);
		 * System.out.println("��������");
		 * }catch(InterruptedException a) { System.out.println(a); }
		 */
		/*
		 * [���빮��] �ܺ� class�� �ֽ��ϴ�. �� ���� Ŭ�������� �ش� �ܺ� class�� �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������
		 * "ó�����Դϴ�. ��ø� ��ٷ��ּ���." 8�ʵ��� �ε��� �߻��մϴ�. 8�� ���Ŀ� return���� "�Ա��� ���ó�� �Ǿ����ϴ�."��� ���ڸ�
		 * �޵��� �Ͻʽÿ�.
		 */
		bank yn = new bank();
		yn.money();
	}
}

class bank {
	public void money() {
		try {
			System.out.println("ó�����Դϴ�. ��ø� ��ٷ� �ּ���.");
			//int c = 0*6;
			Thread.sleep(8000);
			//String kkk = this.msg();
			System.out.println(this.msg());
		} catch (InterruptedException a) {
			System.out.println(a);
		}
	}

	public String msg() {
		return "�Ա��� ��� ó�� �Ǿ����ϴ�";
	}

}

/*
 * class te {
 * 
 * private String msg;
 * 
 * public te(String m) { String msg = m; } public String getMsg() { try { msg =
 * "ó�����Դϴ�. ��ø� ��ٷ��ּ���."; Thread.sleep(8000); msg = "�Ա��� ���ó�� �Ǿ����ϴ�."; } catch
 * (InterruptedException a){ System.out.println(a); } return msg; } }
 */

