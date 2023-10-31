package main;

public class Circle {
	// 필드
	int r = 10;
	double pi = 3.14;
	double result;
	
	// 메서드
	// 원의 둘레
	double round() {
		return (double)(2 * pi * r);
	}
	
	// void 반환값이 없음
	void area() {
		result = (double) (pi * r * r);
	}
	
}