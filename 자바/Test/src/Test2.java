import java.util.*;

public class Test2 {
	static int add(int a, int b) {
		return a+b;
	}
	
	static void circle_round(int r) {
		System.out.println("반지름 : "+r);
		System.out.println("둘레 : "+(2*3.14*r));
	}
	
	// 원의 넓이 = 파이 r 제곱
	// 반환값 : double
	static double circle_area(int r) {
		return Math.PI*Math.pow(r, 2);
//		System.out.println("원 넓이 : " + (3.14 * r * r));
	}
	
	static void p(String a) {
		System.out.println(a + " 출력 함수");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,4));
		circle_round(5);

		System.out.println("원 넓이 : " + circle_area(5));
//		circle_area(5);
		
		p("이것만 출력?");
	}

}
