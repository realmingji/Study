// 제네릭
class Student<T> {
	T number;
}

public class Main {
	public static void main(String[] args) {
		Student<String> s1 = new Student<String>();
		Student<Integer> s2 = new Student<Integer>();	
	}
}
