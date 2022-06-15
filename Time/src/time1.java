
public class time1 {

	public static void main(String[] args) {
		
		/*try-catch문 : 예외처리기능 문법*/
		for(int i=1;i<11;i++) {	
			try { //예외발생할 코드를 적용 
				Thread.sleep(1000); //1000 = 1초 
				//Thread.sleep : 일시정지 상태를 말합니다.
		}
		catch(InterruptedException e){
			//InterruptedException : 해당 예외발생이 되었을 경우 처리하기위한 문법 
		}
	
			System.out.println(i);
		

	}

}
}
