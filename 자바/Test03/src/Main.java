import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		GCD_LCM gcd_lcm = new GCD_LCM();
		System.out.println(gcd_lcm.getGCD(num1, num2));	// num1이 큰 수
		System.out.println(gcd_lcm.getLCD(num1, num2));	// num1이 큰 수
	}

}
