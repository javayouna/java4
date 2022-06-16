import java.awt.*;
import java.awt.event.*;

//AWT 환경설정 
public abstract class awt5_abstract {

 public abstract String signok(); //리턴 getter
 public abstract void idcheck(String id); //세터 setter
 public abstract void dataload(); // 데이터베이스 data
	
 Frame fr = new Frame();
 Button bt = null; //중복체크 
 Button close = null; //종료 
 TextField mid = null; //150 * 25 입력값
 Label msg = new Label(); //메세지
 
 public void design() {
	 this.fr.setBounds(200,200,300,450);
	 this.fr.setLayout(null);
	 this.fr.setVisible(true);
	//this.mid.addTextListener(null);
	
	 
	 this.bt = new Button("중복체크");
	 this.close = new Button("종료");
	 this.mid = new TextField(); //입력값
	 
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
	 this.clicks(); //awt 디자인 완료 후 해당 핸들링 메소드로 이동 
 }
 
 public void clicks() {
	 //중복확인 버튼
	 this.bt.addActionListener(new ActionListener() {//중복체크 누르기
		
		@Override
		//setText(출력), getText(입력값 가져오기)
		public void actionPerformed(ActionEvent e) {	
			//awt5_abstract.this.msg.setText("체크완료"); //왜 이렇게 부르는지(?) 확인용
			String userid = awt5_abstract.this.mid.getText();
			
			if(userid.equals("")) {
				msg.setText("아이디를 입력하세요.");
				
			}
			else {
				idcheck(userid); //클릭 할 때 마다 초기화 
				String result = signok();
				if(result==null) {
					msg.setText("사용가능한 아이디 입니다");
				}
				else {
					msg.setText("다른아이디를 입력해주십시오.");
				}
			}
			
			
		}
	});
	 //종료버튼
	 this.close.addActionListener(new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	});
	  
  }
}
	

