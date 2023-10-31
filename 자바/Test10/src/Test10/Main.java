package Test10;
// 슈퍼클래스로부터 메서드를 상속 받았을 때 재정의 하는 것 -> 오버라이딩
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.speak());
		
		Cat cat = new Cat();
		System.out.println(cat.speak());
		
		Snake snake = new Snake();
		System.out.println(snake.speak());
	}

}
