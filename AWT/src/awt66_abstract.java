import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public abstract class awt66_abstract {
//	public abstract void nmcheck(int auser); //랜덤확인 
// 	public abstract void dataload(int honuser);//사용자 입력값
 	
	static String pc =""; //pc가 뽑은건 메모리에 기억 시켜두겠다.
	
	//setter
	public abstract void setter(String userno);
	
	
	//getter
	public abstract String getter();
	
	
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
 		this.click();
 	
}
 	public void click() {
 			this.close.addActionListener(new ActionListener() {
 				
 				@Override
 				public void actionPerformed(ActionEvent e) {
 					System.exit(0);
		
	}
 		});
 			//인증번호 발송
 			this.bt.addActionListener(new ActionListener() { 
 				//String inputno =awt66_abstract.this.mid.getText();
 				
				@Override
				public void actionPerformed(ActionEvent e) {
				Random ra = new Random();
				pc=""; //static 메모리에 저장되어있음 맨위!
				for(int f=1;f<5;f++) {
				 pc += String.valueOf(ra.nextInt(10));	
				} //여기서 끝
	
				
				//awt66_abstract.를 불러와줘야됨

				setter(awt66_abstract.this.mid.getText());
				
				}
					
			});
 			
 	
 			//인증번호 확인 
 			this.com.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(awt66_abstract.this.mid.getText().equals("")){
						awt66_abstract.this.msg.setText("인증번호를 입력해주세요.");
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
