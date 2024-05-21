package 상속;

public class Singleton {
	private final static Singleton singleton = new Singleton();
	Singleton() {}
	public static Singleton getInstance() {
		return singleton;
	}
}