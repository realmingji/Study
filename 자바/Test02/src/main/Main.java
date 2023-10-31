package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("main class");
		
		Circle c1 = new Circle();	// c1이라는 Circle 객체 생김
		Circle c2 = new Circle();
		Circle c3 = new Circle();

		c1.r = 4;
		System.out.println("c1 반지름 : " + c1.r);
		System.out.println("c2 반지름 : " + c2.r);
		System.out.println("c2 둘레 : " + c2.round());
		
		c2.area();
		System.out.println("c2 넓이 : " + c2.result);
		
		System.out.println(c3.pi);	
	}
}
