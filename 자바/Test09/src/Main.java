
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point(5, 10);
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		ColorPoint colorPoint = new ColorPoint(1212, 10, "초록", 123456);
		System.out.println(colorPoint.getX());
		System.out.println(colorPoint.getY());
		System.out.println(colorPoint.getColor());
		System.out.println(colorPoint.getA());
	}

}
