/* 응용 프로그램이 키 입력을 쉽게 받을 수 있는 import*/
import java.util.Iterator;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
//		int x = 15;
//		int y = 10;
//
//		System.out.println(x + " + " + y + " = " + (x + y));
//		System.out.println(x + " - " + y + " = " + (x - y));
//		System.out.println(x + " * " + y + " = " + (x * y));
//		System.out.println(x + " / " + y + " = " + (x / y));
//		System.out.println(x + " % " + y + " = " + (x % y));
//
//		final int MONTH = 12;
//		int salary = 500;
//		System.out.println("연봉 : " + salary * MONTH); // 연봉: 6000
//
//		int radius = 5;
//		System.out.println("둘레 : " + (2 * Math.PI * radius)); // 둘레: 31.41592653589793
//		System.out.println("둘레 : " + (int) (2 * Math.PI * radius)); // 둘레: 31
//		System.out.println("넓이 : " + (int) (Math.PI * radius * radius)); // 넓이: 78
//		System.out.println("둘레 : " + String.format("%.2f", 2 * Math.PI * radius)); // 둘레: 31.42

//		int a = 100; // 10진수
//		String binary = Integer.toBinaryString(a);
//		String octal = Integer.toOctalString(a);
//		String hex = Integer.toHexString(a);
//
//		System.out.println(a); // 100
//		System.out.println(binary); // 100100
//		System.out.println(octal); // 144
//		System.out.println(hex); // 64

//		// 증감 연산자
//		int a = 5;
//		// 왜냐하면 프린트를 한 다음에 1을 추가
//		System.out.println(a++);	// 5
//		System.out.println(a);		// 6
//		
//		int b = 5;
//		System.out.println(--b);	// 4

		// 복삽 대입 연산자
//		int a = 15;
//		a += 10;
//		System.out.println(a);	// 25
//		
//		a -= 10;
//		System.out.println(a);	// 15
//		
//		a *= 10;
//		System.out.println(a);	// 150
//		
//		a /= 10;
//		System.out.println(a);	// 15
//		
//		a %= 10;
//		System.out.println(a);	// 5

//		// 비교 연산자
//		int a = 15, b = 10;
//		System.out.println(a > b);	// true
//		System.out.println(a < b);	// false
//		System.out.println(a >= b);	// true
//		System.out.println(a <= b);	// false
//		System.out.println(a == b);	// false
//		System.out.println(a != b);	// true

		// 논리 연산자
		// AND, OR, XOR, NOT
//		int a = 15, b = 10;
////		boolean c = a >= b;
////		System.out.println(c);
//		System.out.println((a > b) && (a > 1));	// AND
//		System.out.println((a > b) || (a > 1));	// OR
//		System.out.println((a > b) ^ (a > 1));	// XOR
//		System.out.println(!(a < b));	// NOT
		
		// 삼항 연산자 (조건 연산자)
// 		int a = 10, b = 5;
		
// 		int result = a > b ? (a - b) :(b - a);
// 		System.out.println(result);	// 5
		
// 		a = 3;
// 		result = a > b ? (a - b) :(b - a);
// 		System.out.println(result);	// 2
		
//		int a = 9, b = -9, c = 2;
//		// abs는 절대값
//		System.out.println(Math.abs(a));	// 9	
//		// sqrt 제곱근
//		System.out.println(Math.sqrt(a));	// 3.0		
		// pow는 거듭제곱
//		System.out.println(Math.pow(a, 2));	// 81.0
		
//		Scanner sc= new Scanner(System.in);	// 입력받는 스캐너 객체 생성
		// 입력
//		System.out.print("이름 : ");
//		String name = sc.next();	// 문자열 입력
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		System.out.print("졸업 여부(true/false) : ");
//		boolean graduated = sc.nextBoolean();
//		
//		// 입력 정보 출력
//		System.out.println("입력한 이름은 " + name + "입니다.");
//		System.out.println("입력한 나이는 " + age + "입니다.");
//		System.out.println("졸업 여부는 " + graduated + "입니다.");
		
//		int a  = 10;
//		if(a>5) {
//			System.out.println("맞다");
//			else if(a==5) {
//				System.out.println("같다");
//			}
//			else {
//				System.out.println("아니다");
//			}
//		}
//		int year = sc.nextInt();
//		// 4년 마다 윤년, 100년마다 윤년, 
//		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
//			System.out.println(year + "년은 윤년");
//		} else {
//			System.out.println(year + "년은 평년");
//		}
		
		// 점수 입력
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
//		String grade;
//		
//		switch (score/10) {
//			case 10:
//			case 9:
//				grade = "A";
//				break;
//			case 8:
//				grade = "B";
//				break;
//			case 7:
//				grade = "C";
//				break;
//			case 6:
//				grade = "D";
//				break;
//			default:
//				grade = "F";
//				break;
//		}
//		System.out.println(grade);
		
//		int sum = 0;
//		
//		for(int i = 1; i <= 10; i+=2) {
//			sum += i;
//			System.out.println(i);
//			
//		}
//		System.out.println(sum);
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {	// 10번 반복하고
//				System.out.print("*");
//			}
//			System.out.println();	// 한줄 띄우기
//		}
//		int i = 0, sum = 0;
//		for(;;) {
//			i++;
////			if(i%2 == 1) {
////				sum += i;
////			}
//			if (i % 2 == 0) {
//				continue;
//			}
////			System.out.println(i);	// 1, 3, 5, 7, 9, 11 출력
//			
//			sum += i;
//			if(i>=10) {
//				break;
//			}
//		}
//		System.out.println(i);
		
//		int i = 1;
//		// while (조건)
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
		
//		try {
//		int a = 10, b = 0;
//		int result = a / b;
//			System.out.println(result);
//		} catch(Exception e) {
//			System.out.println(e);
//		}
//		int arr[] = new int[3];
//		try {
//			for(int i=0; i<arr.length; i++) {
//				arr[i] = i;
//				System.out.println(arr[i]);
//			}	
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		System.out.print("숫자 : " );
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
//		for (int i = 2; i < 10; i++) {
//            if (i == input) {   // i와 input 같으면 출력
//                for (int j = 1; j < 10; j++) {
//                    System.out.println(i + " * " + j + " = " + i * j);
//                }
//            }
//        }
    }
}
