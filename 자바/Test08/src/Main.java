
public class Main {
	public static void main(String[] args) {
		Student student = new Student();	// student 객체 만들기
		student.setName("홍길동");
		student.setAge(20);
		student.setNumber(1234);
		student.setMajor("모바일소프트웨어전공");
		
		// 메소드를 실행 시켜서 가지고 오는 것 -> 간접 접근
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getNumber());
		System.out.println(student.getMajor());
		
		Person person = new Person();
		person.setName("가나다라");
		person.setAge(20);
		/* person.setNumber와 person.setMajor 쓰면 안되는 이유? Number와 Major는 Student에서 받아 오기 때문이다.*/
//		person.setNumber(456789);
//		person.setMajor("컴퓨터공학전공");
	}
}
