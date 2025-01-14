package char04;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;							//여기다 선언한 이유는 for문이 끝나고 나서 sum을 사용하기 때문
												//함수 안에 있으면 함수 내에서만 사용 가능하기 때문
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100의 합 : " + sum);
	}
}
