import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public abstract class awt66_abstract {
//	public abstract void nmcheck(int auser); //����Ȯ�� 
// 	public abstract void dataload(int honuser);//����� �Է°�
 	
	static String pc =""; //pc�� ������ �޸𸮿� ��� ���ѵΰڴ�.
	
	//setter
	public abstract void setter(String userno);
	
	
	//getter
	public abstract String getter();
	
	
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
 		this.click();
 	
}
 	public void click() {
 			this.close.addActionListener(new ActionListener() {
 				
 				@Override
 				public void actionPerformed(ActionEvent e) {
 					System.exit(0);
		
	}
 		});
 			//������ȣ �߼�
 			this.bt.addActionListener(new ActionListener() { 
 				//String inputno =awt66_abstract.this.mid.getText();
 				
				@Override
				public void actionPerformed(ActionEvent e) {
				Random ra = new Random();
				pc=""; //static �޸𸮿� ����Ǿ����� ����!
				for(int f=1;f<5;f++) {
				 pc += String.valueOf(ra.nextInt(10));	
				} //���⼭ ��
	
				
				//awt66_abstract.�� �ҷ�����ߵ�

				setter(awt66_abstract.this.mid.getText());
				
				}
					
			});
 			
 	
 			//������ȣ Ȯ�� 
 			this.com.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(awt66_abstract.this.mid.getText().equals("")){
						awt66_abstract.this.msg.setText("������ȣ�� �Է����ּ���.");
					}
					
					else {
						setter(awt66_abstract.this.mid.getText());
					}
					//String m= getter();
					awt66_abstract.this.msg.setText(getter());
				}
			});
 			
 			
 	}
}
