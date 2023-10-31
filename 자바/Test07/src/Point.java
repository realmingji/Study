
public class Point {
	private double x;
	private double y;
	
	Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 꺼내 올 수 있는 함수 만들기 get은 가져오기
	double getX() {	// 이 함수를 호출
		return x;
	}
	
	void setX(double x) {
		this.x = x;
	}
	
	double getY() {	// 이 함수를 호출
		return y;
	}
	
	void setY(double y) {
		this.y = y;
	}
}
