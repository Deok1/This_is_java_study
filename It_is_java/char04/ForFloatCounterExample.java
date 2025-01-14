package char04;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for( float x=0.1f; x<=1.0f; x+=0.1F) {		//부동소수점 타입은 0.1을 정확히 표시할 수 없기에
			System.out.println(x);					//실제값은 0.1보다 약간 크고
		}											//결국 루프는 9번만 실행된다
	}
}
