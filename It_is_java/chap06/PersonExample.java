package chap06;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "Usa";			설정 불가
		//p1.ssn = "654321-7654321";	설정 불가
		p1.name = "을지문덕";
	}
}
