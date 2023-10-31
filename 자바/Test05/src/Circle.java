
public class Circle {
	int radius;
	String color;
	final double PI = 3.14;		// final 지정하면 값을 바꾸고 싶어도 안바뀜, 상수는 대문자로 입력!
	
	Circle() {
		this.radius = 5;
		color = "노랑";
		System.out.println("*------ Circle() 생성자 실행 ------*");
	}
	
	Circle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	
		System.out.println("*------ Circle(int r, String c) 생성자 실행 ------*");
	}
	
	
}