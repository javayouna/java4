import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class awt4_class {
 public int no=0;
	//awt4.java ����
	
	public void view() {
		decorate de= new decorate (); //awt4.java �ڽ� class�ε� 
		TextField input = new TextField(); //����� �Է� �ϴ� ��
		Frame f = new Frame();
		Label lb = new Label();
		f.setBounds(200,200,300,300);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("���");
		Button closebtn = new Button("����");
		lb.setBackground(Color.gray);
		input.setBounds(50,50,100,25);
		btn.setBounds(180,50,80,25);
		closebtn.setBounds(50,200,80,25);
		lb.setBounds(50,100,200,100);
		
		
		
		
		
		f.add(lb);
		f.add(input);
		f.add(btn);
		f.add(closebtn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int c=Integer.parseInt(input.getText()); //this �� �� ����� !!!! why? 5�����ٿ� �����س��� this
				de.btn_push(c); //void this����?(?)
				lb.setText(de.calls());
				}
				catch(Exception aaa) {
					lb.setText("���ڸ� �Է��ϼ���");
					//System.out.println("���ڸ� �Է��ϼ���");
				}
				
			}
		});
		closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
					
	}
		});
	}
}

	
