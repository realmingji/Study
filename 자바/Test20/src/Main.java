// StringTokenizer
// StringTokenizer와 split 차이점은?
import java.util.*;

public class Main {

	public static void main(String[] args) {
		String string = "안녕하세요. 반갑습니다. 감사합니다.";
		System.out.println(string);
		
		StringTokenizer st = new StringTokenizer(string, " ");	// 공백으로 Tokenizser 함
		System.out.println(st.countTokens());
		
		// 토큰 한 개씩 출력
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
