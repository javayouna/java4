
public class Example1 {

	public static void main(String[] args) { // �ܺ� Ŭ���� ȣ�⸸ �մϴ�
		// abstract ���빮��

		/*
		 * 1�� �迭���� �ֽ��ϴ�. �ش� �迭���� ��� ���� ���� ����մϴ�. ��, abstract �⺻ void �̸��� sender ���� �� �����
		 * sender���� ��� �迭�� abstract���� ��� �迭 ������:6,13,22,9,12,64,32,47,39
		 */

		b1 su = new b1();
		su.sender();

	}

}

abstract class aa {
	int dt[] = { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
	public abstract void sender();

}

class b1 extends aa {

	@Override
	public void sender() {
		int total = 0;
		for (int i = 0; i < this.dt.length; i++) {
			total += this.dt[i];
		}
		System.out.println(total);

	}

}
