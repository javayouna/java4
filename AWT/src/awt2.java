import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt ����
public class awt2 {
	public static void main(String[] args) {
		login lg = new login();
		
	}

}


class loginok extends login { //ȭ�� ��ȯ�ϴ� �ڽ� Ŭ����
	public loginok() {
		this.fr.setTitle("�α��� �� ������");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}



class login {

	Frame fr = new Frame();
	Font ft = new Font("����ü", Font.BOLD, 20); // ("����ü",Font.Bold,��Ʈũ��)
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button lg_btn = new Button("�α���");
	Button close_btn = new Button("���α׷� ����");
	Button ship_btn = new Button("ȸ������");
	Label msg = new Label();

	public login() { //������ > extends abstract(�߻� class)�� ���� �ε��ؼ� �ʵ� ���� 
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);

		mid.setFont(ft);
		mpw.setFont(ft);
		mpw.setEchoChar('*'); // EchoChar�� ''������
		mid.setBounds(100, 60, 200, 40);
		mpw.setBounds(100, 120, 200, 40);

		lg_btn.setBounds(100, 180, 200, 40);
		ship_btn.setBounds(100, 240, 200, 40);
		this.close_btn.setBounds(100, 300, 200, 40);

		// this.msg.setBackground(Color.red);
		this.msg.setBounds(100, 100, 200, 20);
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(lg_btn);
		this.fr.add(ship_btn);
		this.fr.add(this.close_btn);
		this.clicks();
	}

	public void clicks() { // ��ư�� ���� �ڵ鸵 �޼ҵ�
		this.ship_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); //�ش� ������ ���� 
				loginok ok = new loginok(); //���� ������ �ε�
				
			}
		});

		this.close_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���α׷� ���� �̺�Ʈ �ڵ鸵 �޼ҵ�
				System.exit(0);
			}
		});
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane();// swing API ���ɼ� ��,

			@Override
			public void actionPerformed(ActionEvent e) {
				// �α��� ��ư ���̵� �� �н���Ʈ ����
				String user_id = mid.getText(); // Object��.getText(����ڰ� �Է��� ���� ������ �� ���).
				String user_pw = mpw.getText();
				if (user_id.equals("")) { // null��� ����=>null ���� ���� �ִ� ���¸� ����
					msg.setText("���̵� �Է��ϼ���");
					// alert.showMessageDialog(null, "���̵� �Է��ϼ���");
				}

				else {
					if (user_pw.equals("")) {
						msg.setText("�н����带 �Է��ϼ���.");

					} else {
						msg.setText("�α����� �����մϴ�.");
					}
				}
			}
		});
	}
}
