
public class oop3 {
	//멀티 쓰레드(Multi Thread): start,run,sleep,setStop
	//멀티 쓰레드 : cpu 코어와 관계 있음 
	public static void main(String[] args) {
		//쓰레드(Thread):프로세스 내부에서 독립적으로 실행되는 작업을 말함 1.내부 (작동 끝남)2.외부
		//멀티 쓰레드(Multi Thread):프로세서 내부에서 두 가지 이상 작업 동시 사용 //작동이 동시에 됨 
		//멀티 쓰레드는 무조건 public
		//mythread my = new mythread(); 자식 복사
		//★쓰레드->음악 
		//★멀티쓰레드->음악+유투브+문서
		Thread my = new mythread(); //헉; 앞에는 부모 불름 wow 이러면 기준은 부모가 되고 부모에다가 자식을 집어 넣음 
		//★부모 메소드 = 자식 메소드 
		Thread my2 = new test2();
		my.start(); //my.run은 오류남 외부다끝나야지 내부가실행됨  
		my2.start(); //★Thread 메소드 기본 run을 작동하기 위한 start 명령어
		for(int a=1;a<15;a++) {
			System.out.println("내부 클래스:"+a);
		}
		
	}

}

class test2 extends Thread{
@Override
public void run() {
	for(int i=1;i<15;i++) {
		System.out.println("외부 클래스2:"+i);
	}
}
}
class mythread extends Thread{ //★Thread: JVM기본 탑재 메소드(Thread는 단독으로 사용 하지 않음)
	@Override
	public void run() { //쓸 수 있는 단어가 고정임 //★run이란 멀티메소드 기본 실행 메소드
		for(int i=1;i<15;i++) {
			System.out.println("외부 클래스:"+i);
		}
	}
}
