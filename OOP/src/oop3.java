
public class oop3 {
	//��Ƽ ������(Multi Thread): start,run,sleep,setStop
	//��Ƽ ������ : cpu �ھ�� ���� ���� 
	public static void main(String[] args) {
		//������(Thread):���μ��� ���ο��� ���������� ����Ǵ� �۾��� ���� 1.���� (�۵� ����)2.�ܺ�
		//��Ƽ ������(Multi Thread):���μ��� ���ο��� �� ���� �̻� �۾� ���� ��� //�۵��� ���ÿ� �� 
		//��Ƽ ������� ������ public
		//mythread my = new mythread(); �ڽ� ����
		//�ھ�����->���� 
		//�ڸ�Ƽ������->����+������+����
		Thread my = new mythread(); //��; �տ��� �θ� �Ҹ� wow �̷��� ������ �θ� �ǰ� �θ𿡴ٰ� �ڽ��� ���� ���� 
		//�ںθ� �޼ҵ� = �ڽ� �޼ҵ� 
		Thread my2 = new test2();
		my.start(); //my.run�� ������ �ܺδٳ������� ���ΰ������  
		my2.start(); //��Thread �޼ҵ� �⺻ run�� �۵��ϱ� ���� start ��ɾ�
		for(int a=1;a<15;a++) {
			System.out.println("���� Ŭ����:"+a);
		}
		
	}

}

class test2 extends Thread{
@Override
public void run() {
	for(int i=1;i<15;i++) {
		System.out.println("�ܺ� Ŭ����2:"+i);
	}
}
}
class mythread extends Thread{ //��Thread: JVM�⺻ ž�� �޼ҵ�(Thread�� �ܵ����� ��� ���� ����)
	@Override
	public void run() { //�� �� �ִ� �ܾ ������ //��run�̶� ��Ƽ�޼ҵ� �⺻ ���� �޼ҵ�
		for(int i=1;i<15;i++) {
			System.out.println("�ܺ� Ŭ����:"+i);
		}
	}
}
