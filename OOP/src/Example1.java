import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) { // �ܺ� Ŭ���� ȣ�⸸ �մϴ�
		// abstract ���빮��

		/*
		 * 1�� �迭���� �ֽ��ϴ�. �ش� �迭���� ��� ���� ���� ����մϴ�. ��, abstract �⺻ void �̸��� sender ���� �� �����
		 * sender���� ��� �迭�� abstract���� ��� �迭 ������:6,13,22,9,12,64,32,47,39
		 */

		arr1 ar = new arr1();

	}

}

/* �������� Ǯ���ֽ� �� */
abstract class vdata {

	public abstract void sender();
}

class arr1 extends vdata {
	private final int alldata[];

	public arr1() {

		this.alldata = new int[] { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
		this.sender();

	}

	@Override
	public void sender() {
		int total = 0;
		for (int i = 0; i < this.alldata.length; i++) {
			total += this.alldata[i];
		}
		System.out.println("�� �հ�: " + total);
	}

}

/*
 * ���� Ǭ��(���� ����) abstract class aa{ int dt[] = {6,13,22,9,12,64,32,47,39}; public
 * abstract void sender(); }
 * 
 * class b1 extends aa{
 * 
 * @Override public void sender() { int total=0; for(int
 * i=0;i<this.dt.length;i++) { total+=this.dt[i]; } System.out.println(total); }
 * 
 * }
 */
