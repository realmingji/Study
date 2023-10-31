package Test13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("뽀삐");	// 변수명 = new 클래스명();
		System.out.println("이름 : " + dog.name());
//		System.out.println("매력 : " + dog.charm());
		System.out.println("다리 수 : " + dog.leg());
		System.out.println("울음 소리 : " + dog.speak());
	}

}
