package chap03;

public class OverflowExample {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y; 			//10^6 * 10^6 = 10^12 이므로 int에 저장될 수 있는 값을 넘음
		System.out.println(z);
	}
}
