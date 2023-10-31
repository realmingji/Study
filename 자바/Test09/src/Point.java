
public class Point {
	// private는 동일 클래스만 사용 가능
	private double x;
	private double y;
	
	Point() {
		System.out.println("기본 생성자 실행");
	}
	
	// 객체 생성 할 때 좌표를 넣음
	Point(double x, double y) {
		System.out.println("다른 생성자 실행");
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return x;
	}
	
	void setX(double x) {
		this.x = x;
	}
	
	double getY() {
		return y;
	}
	
	void setY(double y) {
		this.y = y;
	}
}
