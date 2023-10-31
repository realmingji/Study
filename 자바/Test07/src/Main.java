import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		Point point = new Point(x, y);	// 객체 생성 할 때 입력한 값을 넣기
	
		System.out.println("입력한 x 좌표 : " + point.getX());
		System.out.println("입력한 y 좌표 : " + point.getY());
		
		point.setX(123.456);
		point.setY(456.789);
		System.out.println("입력한 x 좌표 : " + point.getX());
		System.out.println("입력한 y 좌표 : " + point.getY());
	}
}
