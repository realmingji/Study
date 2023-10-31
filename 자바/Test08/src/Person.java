// 부모 클래스 ( = 슈퍼 클래스)
public class Person {
	String name;
	int age;
	private double height;
	private double weight;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
}
