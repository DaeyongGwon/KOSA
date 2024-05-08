package theneedforgeneric.EX01;

class Apple {
}

class Goods1 {
	private Apple apple;

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

// Pencil 클래스와 Pencil 클래스를 담을 수 있는 Good2 클래스
class Pencil {
}

class Goods2 {
	private Pencil pencil;

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}

public class ProblemBeforeGeneric {
	public static void main(String[] args) {
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();

		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
	}
}
