
public class awt66 {

	public static void main(String[] args) {
		
		handle2 mm = new handle2();
		mm.design();
	}

}
class handle2 extends awt66_abstract{
	String message2 ="";
	
	@Override
	public void setter(String userno) {
		System.out.println(pc);

		if(userno.equals(pc)) {
			this.message2="������ �Ϸ� �Ǿ����ϴ�.";
		}
		else {
			this.message2="������ȣ�� �ٽ� Ȯ���Ͻʽÿ�";
			}
		
	}
	
	@Override
	public String getter() {
		return this.message2;
	}
}

//������ȣ Ƚ�� ���� ���� 