import java.awt.*;
import java.awt.event.*;

//AWT ȯ�漳�� 
public abstract class awt5_abstract {

 public abstract String signok(); //���� getter
 public abstract void idcheck(String id); //���� setter
 public abstract void dataload(); // �����ͺ��̽� data
	
 Frame fr = new Frame();
 Button bt = null; //�ߺ�üũ 
 Button close = null; //���� 
 TextField mid = null; //150 * 25 �Է°�
 Label msg = new Label(); //�޼���
 
 public void design() {
	 this.fr.setBounds(200,200,300,450);
	 this.fr.setLayout(null);
	 this.fr.setVisible(true);
	//this.mid.addTextListener(null);
	
	 
	 this.bt = new Button("�ߺ�üũ");
	 this.close = new Button("����");
	 this.mid = new TextField(); //�Է°�
	 
	 this.msg.setBackground(Color.LIGHT_GRAY);
	 this.msg.setBounds(25,200,250,25);
	 this.mid.setBounds(25, 150, 150, 25);	 
	 this.bt.setBounds(200, 150, 80, 25);
	 this.close.setBounds(200, 300, 80, 25);
	 //this.bt.setBackground(Color.black);
	 
 
	 this.fr.add(msg);
	 this.fr.add(mid);
	 this.fr.add(bt);
	 this.fr.add(close);
	 this.clicks(); //awt ������ �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵� 
 }
 
 public void clicks() {
	 //�ߺ�Ȯ�� ��ư
	 this.bt.addActionListener(new ActionListener() {//�ߺ�üũ ������
		
		@Override
		//setText(���), getText(�Է°� ��������)
		public void actionPerformed(ActionEvent e) {	
			//awt5_abstract.this.msg.setText("üũ�Ϸ�"); //�� �̷��� �θ�����(?) Ȯ�ο�
			String userid = awt5_abstract.this.mid.getText();
			
			if(userid.equals("")) {
				msg.setText("���̵� �Է��ϼ���.");
				
			}
			else {
				idcheck(userid); //Ŭ�� �� �� ���� �ʱ�ȭ 
				String result = signok();
				if(result==null) {
					msg.setText("��밡���� ���̵� �Դϴ�");
				}
				else {
					msg.setText("�ٸ����̵� �Է����ֽʽÿ�.");
				}
			}
			
			
		}
	});
	 //�����ư
	 this.close.addActionListener(new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	});
	  
  }
}
	

