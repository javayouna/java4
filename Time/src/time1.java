
public class time1 {

	public static void main(String[] args) {
		
		/*try-catch�� : ����ó����� ����*/
		for(int i=1;i<11;i++) {	
			try { //���ܹ߻��� �ڵ带 ���� 
				Thread.sleep(1000); //1000 = 1�� 
				//Thread.sleep : �Ͻ����� ���¸� ���մϴ�.
		}
		catch(InterruptedException e){
			//InterruptedException : �ش� ���ܹ߻��� �Ǿ��� ��� ó���ϱ����� ���� 
		}
	
			System.out.println(i);
		

	}

}
}
