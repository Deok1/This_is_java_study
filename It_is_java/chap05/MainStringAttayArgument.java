package chap05;

public class MainStringAttayArgument {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
		//매개값을 주지 않았기 때문에 계산이 안됨
		//메뉴에서 [Run -> Run Configurations...]를 선택
		//[Main] 탭에서 [Project]와 [Main Class]를 확인
		//[Arguments] 탭을 클릭하고 [Program arguments] 입력란에 10 빈칸 20 을 입력하고 Run으로 실행