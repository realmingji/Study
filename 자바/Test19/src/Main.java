// StringBuffer 사용하기
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringbuffer = new StringBuffer("안녕하세요.");
		
		System.out.println(stringbuffer);
		System.out.println(stringbuffer.capacity());	// capacity 크기 알려줌. 문자열 길이만큼 늘어남
	
		stringbuffer.append(" 반갑습니다. ");	// append 문자열 합치기
		System.out.println(stringbuffer);
		
		stringbuffer.insert(6, "감사합니다.");	// insert 해당 인덱스 위치에 문자열 추가
		System.out.println(stringbuffer);
		
		stringbuffer.replace(0, 6, "Hello ");
		System.out.println(stringbuffer);
		
		stringbuffer.delete(6, 13);
		System.out.println(stringbuffer);
		
		stringbuffer.setLength(5);
		System.out.println(stringbuffer);
		
		stringbuffer.reverse();	// reverse 반대 출력
		System.out.println(stringbuffer);	
	}

}
