import java.awt.Button;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
public class awt8 {
	TextField search=null;
	
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setBounds(200, 200, 350 ,180);
		fr.setLayout(null);
		fr.setVisible(true);
		TextField search = new TextField();
		Button btn = new Button("�˻�");
		search.setBounds(10,30,150,25);
		btn.setBounds(200,30,80,25);
		fr.add(search);
		fr.add(btn);
		
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String sh = search.getText();
				if(sh.equals("")) {
					System.out.println("�˻�� �Է����ּ���.");
				}
				else {
					System.out.println(sh);
					try {
						//Desktop.getDesktop().browse : awt���� �ü�� ȯ�� ȯ�濡�ִ� �⺻ ���α׷� �� EDge�� ����ϰԵ˴ϴ�.
						//URI : java.net API�Լ� (��Ʈ��ũ ��Ʈ �Դϴ�.) -��� �� �Ķ���� ���� ���մϴ�.
						Desktop.getDesktop().browse(new URI("http://search.naver.com/search.naver?query="+sh));
					
					
					}catch(Exception zz) {
					System.out.println("URL ���� �߻�");
				}
					
				}
			}
		});
		
		
//		try {
//			
//			Desktop.getDesktop().browse(new URI("http://naver.com"));
//			
//			
//			
//		}catch(Exception e) {
//			System.out.println("URL ���� �߻�");
//		}

	}

}