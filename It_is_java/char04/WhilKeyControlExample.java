package char04;

public class WhilKeyControlExample {
	public static void main(String[] args) throws Exception {  	//"throws Exception"은 System.in.read() 메소드에 대한 예외처리. 당장은 이해하지말기
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) { 					//Enter키가 입력되면 캐리지리턴(13), 라인피드(10)가 입력되므로 제외시킴
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.println("선택 : ");
			}
			
			keyCode = System.in.read();							//키보드의 키 코드 읽음
			
			if (keyCode == 49 ) {								//1을 읽었을 경우
				speed++;
				System.out.println("현재속도 : " + speed);
			} else if (keyCode == 50) {							//2를 읽었을 경우
				speed--;
				System.out.println("현재속도 : " + speed);
			} else if (keyCode == 51) {							//3를 읽었을 경우
				run = false;									//while문을 종료하기 위한 문장
			}
		}
		System.out.println("프로그램 종료");
	}
}
