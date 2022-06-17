import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	Checkbox ck = null;
	static boolean agree =false; //이렇게 만들어 둠..! 동의함 체크 박스 기본 값은 false
	
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setBounds(200, 200, 350 ,180);
		fr.setLayout(null);
		fr.setVisible(true);
		Checkbox ck = new Checkbox("동의함");
		Choice se = new Choice();
		ck.setBounds(30,40,30,30);
		se.setBounds(30,80,100,30);
		se.add("통신사를 선택해 주세요");
		se.add("SKT");
		se.add("KT");
		se.add("LG");
		se.add("알뜰폰");
		
		fr.add(ck);
		fr.add(se);
		/* addItemListener : checkbox , choice에서 사용함  */
		
		ck.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
			/*
			String checks = (String)e.getItem(); //속성변환해주어야함
			System.out.println(checks);
			*/
				if(e.getStateChange()==1) {
						agree=true;
					//System.out.println("동의하셨습니다.");
				}
				else{
					//System.out.println("동의를 하셔야합니다.");
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
