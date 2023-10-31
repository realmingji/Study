// 최소공배수와 최대공약수 구하기
class GCD_LCM {
	public int gcd = 0;
	private int lcm = 0;
	
	// 최대공약수
	public int getGCD(int n1, int n2) {
		while (n2 > 0) {
			int t = n1;
			n1 = n2;
			n2 = t % n2;
		}
		gcd = n1;
		return gcd;
	}
	
	// 최소공배수
	public int getLCD(int n1, int n2) {
		lcm = (n1 * n2) / getGCD(n1, n2);
		return lcm;
	}
}
