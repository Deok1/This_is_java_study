package chap02;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {	//for 중괄호를 5회 반복한다
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
			//"\t"는 tab만큼 칸을 띄워주는 역할을 한다
		}
	}
}
