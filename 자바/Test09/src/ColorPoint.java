
public class ColorPoint extends Point{
	private String color;
	private int a;
	
	// 좌표와 색깔도 알 수 있도록 해주는 것
	ColorPoint() {
		
	}
	
	ColorPoint(double x, double y, String color, int a) {
		super(x, y);	// Point 있는 Point(double x, double y)를 생성(?)
		System.out.println("--- ColorPooint 생성자 ---");
		this.color = color;
		this.a = a;
	}
	
	String getColor() {
		return color;
	}
	
	int getA() {
		return a;
	}
	
	void setColor(String color) {
		this.color = color;
	}
}
