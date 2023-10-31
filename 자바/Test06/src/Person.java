// 메소드 이름은 같지만 여러게 메서드 생성 
// 메소드 타입이나 갯수가 다르면 여러개 만들 수 있음
// -> 메서드 오버로딩

public class Person {
	static void introduce() {
		System.out.println("안녕하세요.");
	}
	
	void introduce(String name) {
		System.out.println("안녕하세요." + name + "입니다. ");
	}
	
	void introduce(int age) {
		System.out.println("안녕하세요." + age + "살 입니다.");
	}
}