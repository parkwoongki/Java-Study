package Abstract;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");

		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
	
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal){ // 여기에 스태틱이 있는 이유는 메인에 있기 때문에 그렇다.
		animal.sound();
	}

}
