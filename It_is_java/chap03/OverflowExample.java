package chap03;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; 			//10^6 * 10^6 = 10^12 이므로 int에 저장될 수 있는 값을 넘음
		System.out.println(z);
	}
}
