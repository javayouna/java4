import java.util.Timer;
import java.util.TimerTask;

public class time2 {

	
	
	public static void main(String[] args) {
		Timer timer = new Timer(); // Time util을 이용하여 시간메소드를 사용합니다.
		timer.scheduleAtFixedRate(new gogo(), 1000, 5000);
		// (시작할 메소드&클래스, 몇 초뒤에 시작, 반복시간)
		// scheduleAtFixedRate : 작업스케쥴 지속적으로 반복 작업 할 경우 사용
		TimerTask tk = new TimerTask() {
			int a = 0;
			String adata[] = { "홍길동", "이순신", "강감찬", "유관순" };

			@Override
			public void run() {

				if (a >= 4) {
					
					System.exit(0); //강제 종료 
					//a = 0;
				}
				System.out.println(adata[a]);
				a++;
			}
		};
		timer.scheduleAtFixedRate(tk, 0, 5000); //ex)배너 돌아가는 거, 로딩 화면 돌아갈 때 
	}
}

class gogo extends TimerTask { // TimerTask: 시간작업
	public void run() { // Task에서 실행하는 메소드
		// System.out.println("시간 함수 잘 작동이 될까요?");
	}
}
