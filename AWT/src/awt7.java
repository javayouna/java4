import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	Checkbox ck = null;
	static boolean agree =false; //�̷��� ����� ��..! ������ üũ �ڽ� �⺻ ���� false
	
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setBounds(200, 200, 350 ,180);
		fr.setLayout(null);
		fr.setVisible(true);
		Checkbox ck = new Checkbox("������");
		Choice se = new Choice();
		ck.setBounds(30,40,30,30);
		se.setBounds(30,80,100,30);
		se.add("��Ż縦 ������ �ּ���");
		se.add("SKT");
		se.add("KT");
		se.add("LG");
		se.add("�˶���");
		
		fr.add(ck);
		fr.add(se);
		/* addItemListener : checkbox , choice���� �����  */
		
		ck.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
			/*
			String checks = (String)e.getItem(); //�Ӽ���ȯ���־����
			System.out.println(checks);
			*/
				if(e.getStateChange()==1) {
						agree=true;
					//System.out.println("�����ϼ̽��ϴ�.");
				}
				else{
					//System.out.println("���Ǹ� �ϼž��մϴ�.");
						agree=false;
				}
				
				//System.out.println(e.getStateChange());
				//1:check 2:uncheck
			}
		});
		
		se.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String change = (String)e.getItem();
				System.out.println(change);
				System.out.println(agree);
				
			}
		});
		
		
	}

}
