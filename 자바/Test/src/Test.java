public class Test {

	public static void main(String[] args) {
		int a = 65;
		System.out.println("int 크기 : " + Integer.SIZE / 8 + " bytes");
		System.out.println(a);	// 10

		double b = 123.456;
		System.out.println("double 크기 : " + Double.SIZE / 8 + " bytes");
		System.out.println(b);
		
		char c = 'A';
		System.out.println(c);	// A
		System.out.println((int) c);	// 65
		System.out.println((char) a);	// A
		
		boolean d = true;
		System.out.println(d);
		
		String e = "안녕하세용 ㅎㅎ";
		System.out.println(e.substring(3));	// 세용 ㅎㅎ
		System.out.println(e.substring(1, 3));	// 녕하
		System.out.println(e.length());	// 8
		
	}

}
