import java.awt.*;
import java.awt.event.*;

public abstract class awt6_abstract {
	//public abstract String signok();
	public abstract void nmcheck(int auser); //랜덤확인 
 	public abstract void dataload(int honuser);//사용자 입력값
 	
 	Frame fr = new Frame();
	Button bt = null; //인증번호발송
	Button com=null;//인증확인
	Button close =null; //종료
	TextField mid = null; // 인증번호 입력
	Label msg = new Label(); //메세지 출력
 	
 	public void design() {
		
 		this.fr.setBounds(200, 200, 350 ,180);
 		this.fr.setLayout(null);
 		this.fr.setVisible(true);
 	
 		this.bt = new Button("인증번호발송");
 		this.com = new Button("인증확인");
 		this.close = new Button("X");
 		this.mid = new TextField(); //인증번호 입력
 		
 		this.msg.setBackground(Color.gray);
 		this.bt.setBounds(25, 50, 100, 25); //인증번호발송
 		this.close.setBounds(280, 30, 30, 25); //닫기
 		this.com.setBounds(180,80, 100, 25); //인증번호확인
 		this.mid.setBounds(25, 80, 200,25); //인증번호입력
 		this.msg.setBounds(25, 120, 250, 25);
 		
 		this.fr.add(bt);
 		this.fr.add(com);
 		this.fr.add(mid);
 		this.fr.add(msg);
 		this.fr.add(close);
 		this.clicks();
 	}
	
 	public void clicks() {
 		//인증번호발송
 		this.bt.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				int i = (int)(Math.random()*(9999-1000+1))+1000;
 					nmcheck(i);
 				System.out.println(i);	
 				
 			}
		});
 		

 		
 		
 		
 		this.com.addActionListener(new ActionListener() {
			//인증확인 버튼
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
 