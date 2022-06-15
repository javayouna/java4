import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class awt4_class {
 public int no=0;
	//awt4.java 연계
	
	public void view() {
		decorate de= new decorate (); //awt4.java 자식 class로드 
		TextField input = new TextField(); //사용자 입력 하는 곳
		Frame f = new Frame();
		Label lb = new Label();
		f.setBounds(200,200,300,300);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("계산");
		Button closebtn = new Button("종료");
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
				int c=Integer.parseInt(input.getText()); //this 못 씀 여기는 !!!! why? 5번쨰줄에 선언해놔서 this
				de.btn_push(c); //void this못씀?(?)
				lb.setText(de.calls());
				}
				catch(Exception aaa) {
					lb.setText("숫자만 입력하세요");
					//System.out.println("숫자만 입력하세요");
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

	
