
public class Main {
	public static void main(String[] args) {
		char c1 = 'A', c2 = '5';
		System.out.println(Character.toLowerCase(c1));	// toLowerCase 소문자를 대문자 변경
		System.out.println(Character.isAlphabetic(c1));	// isAlphabetic 알파벳이냐?
		System.out.println(Character.isDigit(c2));	// isDigit 숫자냐?
		
		int number1 = 100;
		String number2 = "100";
		
		System.out.println(Integer.parseInt(number2));	// 100
		System.out.println(Integer.toBinaryString(number1));
		System.out.println(Integer.toOctalString(number1));
		System.out.println(Integer.toHexString(number1));
		System.out.println(Integer.bitCount(number1));
		
		double d1 = 12.34;
		String d2 = "12.34";
		System.out.println(Double.parseDouble(d2));
		System.out.println(Double.toString(d1));	// double -> 문자열 변환
		
		boolean b1 = true;
		String b2 = "false";
		System.out.println(Boolean.parseBoolean(b2));	// false
		System.out.println(Boolean.toString(b1));	// true

	}
}
