package chap03;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		//short result3 = -s;		//컴파일에러
		int result3 = -s;
		System.out.println(result3);
	}
}
