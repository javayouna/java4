import java.awt.*;
import java.awt.event.*;

public abstract class awt6_abstract {
	//public abstract String signok();
	public abstract void nmcheck(int auser); //����Ȯ�� 
 	public abstract void dataload(int honuser);//����� �Է°�
 	
 	Frame fr = new Frame();
	Button bt = null; //������ȣ�߼�
	Button com=null;//����Ȯ��
	Button close =null; //����
	TextField mid = null; // ������ȣ �Է�
	Label msg = new Label(); //�޼��� ���
 	
 	public void design() {
		
 		this.fr.setBounds(200, 200, 350 ,180);
 		this.fr.setLayout(null);
 		this.fr.setVisible(true);
 	
 		this.bt = new Button("������ȣ�߼�");
 		this.com = new Button("����Ȯ��");
 		this.close = new Button("X");
 		this.mid = new TextField(); //������ȣ �Է�
 		
 		this.msg.setBackground(Color.gray);
 		this.bt.setBounds(25, 50, 100, 25); //������ȣ�߼�
 		this.close.setBounds(280, 30, 30, 25); //�ݱ�
 		this.com.setBounds(180,80, 100, 25); //������ȣȮ��
 		this.mid.setBounds(25, 80, 200,25); //������ȣ�Է�
 		this.msg.setBounds(25, 120, 250, 25);
 		
 		this.fr.add(bt);
 		this.fr.add(com);
 		this.fr.add(mid);
 		this.fr.add(msg);
 		this.fr.add(close);
 		this.clicks();
 	}
	
 	public void clicks() {
 		//������ȣ�߼�
 		this.bt.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				int i = (int)(Math.random()*(9999-1000+1))+1000;
 					nmcheck(i);
 				System.out.println(i);	
 				
 			}
		});
 		

 		
 		
 		
 		this.com.addActionListener(new ActionListener() {
			//����Ȯ�� ��ư
			@Override
			public void actionPerformed(ActionEvent e) {
				int mid2 = awt6_abstract.this.mid.getX();
				dataload(mid2);
				
			}
		});

 		this.close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
 	

}
}
 