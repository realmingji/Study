
public class Point {
	private int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	// 값 비교 함수
	public boolean equals(Object object) {
		Point point = (Point) object;
		
		if(x == point.x && y == point.y) {
			return true;
		}
		return false;
	}
}
