package object;

class AAAA {
	String name;

	AAAA(String name) {
		this.name = name;

	}
}

class BBBB {
	String name;

	BBBB(String name) {
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((BBBB) obj).name) {
			return true;
		} else
			return false;
	}
}

public class Equels {
	public static void main(String[] args) {
		AAAA a1 = new AAAA("안녕");
		AAAA a2 = new AAAA("안녕");

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

		BBBB b1 = new BBBB("안녕");
		BBBB b2 = new BBBB("안녕");
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

	}
}
