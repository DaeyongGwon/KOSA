package supermethod;

class AA {
	AA() {
		this(3);
		System.out.println("AA 생성자 1");
	}

	AA(int a) {
		System.out.println("AA 생성자 2");
	}
}

class BB extends AA {
	BB() {
		this(3);
		System.out.println("BB 생성자 1");
	}

	BB(int a) {
		System.out.println("BB 생성자 2");
	}
}

public class SuperMethod_2 {
	public static void main(String[] args) {
		AA aa1 = new AA();
		System.out.println();
		AA aa2 = new AA(3);
		System.out.println();

		BB bb1 = new BB();
		System.out.println();
		BB bb2 = new BB(3);
	}
}
