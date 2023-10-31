// 동등연산자와 equals
public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(5, 10);
		Point point2 = new Point(5, 10);
		Point point3 = new Point(10, 20);
		
		Object object = point1;	// 객체 생성
		String a = "aaaa";
		
		System.out.println(object.getClass().getName());
		System.out.println(object.hashCode());
		
		// 동등연산자(==)와 equals 차이점
		if (point1 == point2) {	// 다른 객체
			System.out.println("동일 객체");
		}
		System.out.println("다른 객체");
		
		
		if (point1.equals(point2)) {	// 내용 같음
			System.out.println("내용 같음");
		} else {
			System.out.println("내용 다름");
		}
		
		if (point1.equals(point3)) {	// 내용 다름
			System.out.println("내용 같음");
		} else{
			System.out.println("내용 다름");
		}

	}
}
