
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);	// 년도
		int month = calendar.get(Calendar.MONTH) + 1;	// 월
		int day = calendar.get(Calendar.DAY_OF_MONTH);	// 일
		
		int hour = calendar.get(Calendar.HOUR_OF_DAY);	// 시간
		int minute = calendar.get(Calendar.MINUTE);	// 분
		int second = calendar.get(Calendar.SECOND);	// 초
		int millisecond = calendar.get(Calendar.MILLISECOND);	// 밀리초
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		System.out.println(millisecond + "밀리초");
	}

}
