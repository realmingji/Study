package Test13;

// 강아지는 동물이기도하고 펫이다. 그래서 동물(Animal과 Pet은 인터페이스로 지정)
// 클래스는 extends 사용, 인터페이스는 implements 사용

public class Dog implements Animal, Pet {
	private String name;	
	
	Dog(String name) {
		this.name = name;
	}
	
	@Override
	public String name() { // name은 Pet에서 가져오기
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int leg() {	// Pet에서 가져오기
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String speak() {		// Pet에서 가져오기
		// TODO Auto-generated method stub
		return "멍멍";
	}

//	@Override			// 에러 발생?! 왜 발생?
//	public String charm() {
//		// TODO Auto-generated method stub
//		return charm;
//	}

}
