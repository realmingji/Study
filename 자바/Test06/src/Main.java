// 오버로딩과 오버라이딩
public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.introduce();
		person.introduce("고양이");
		person.introduce(15);
	}
}
