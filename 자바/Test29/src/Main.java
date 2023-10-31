// 입력한 테스틀 파일에 저장
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			FileWriter filewriter = new FileWriter("text.txt");
//			
//			while(true) {
//				String line = sc.nextLine();
//				if(line.length()==0) {
//					break;
//				}
//				filewriter.write(line);
//				filewriter.write("\r\n");
//			}
//			filewriter.close();
//		} catch(Exception e) {
//			System.out.println("예외 처리 : " + e);
//		}
//		sc.close();
		
		try {
			FileReader filereader = new FileReader("text.txt");
			
			int c;
			while(( c = filereader.read()) != -1) {
				System.out.print((char) c);
			}
			filereader.close();
		} catch(Exception e) {
			System.out.print("예외 처리 : " + e);
		}
		
	}
}