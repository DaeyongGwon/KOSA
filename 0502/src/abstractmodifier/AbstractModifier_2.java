package abstractmodifier;
abstract class Animal2 {
	abstract void cry();
}

class Cat2 extends Animal2 {
	void cry() {
		System.out.println("야옹");
	}
}
class Dog2 extends Animal2 {
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		Animal2 animal1 = new Cat2();
		Animal2 animal2 = new Dog2();

		animal1.cry();
		animal2.cry();
	}
}
