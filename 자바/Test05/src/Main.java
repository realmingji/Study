
public class Main {
	public static void main(String[] args) {
		// 객체 생성하면 '무조건' 생성자 호출
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle(10, "초록색");
		Circle c4 = new Circle(8, "파란색");
		
		System.out.print(c1.radius);
		System.out.println(c1.color);
		
		System.out.print(c2.radius);
		System.out.println(c2.color);
		
		System.out.print(c3.radius);
		System.out.println(c3.color);
		
		System.out.print(c4.radius);
		System.out.println(c4.color);
	}
}
