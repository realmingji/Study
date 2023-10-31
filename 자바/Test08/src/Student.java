// 자식 클래스 ( = 서버 클래스)
public class Student extends Person {
	private int number;
	private String major;
	
	int getNumber() {
		return number;
	}
	
	void setNumber(int number) {
		this.number = number;
	}
	
	String getMajor() {
		return major;
	}
	
	void setMajor(String major) {
		this.major = major;
	}
}
