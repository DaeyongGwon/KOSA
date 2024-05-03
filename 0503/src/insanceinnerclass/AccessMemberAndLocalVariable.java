package insanceinnerclass;

class AA {
	int a = 3;

	void abc() {
		int b = 5;
		class BB {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
			//	b = 7;
			}
		}
		BB bb = new BB();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		AA a = new AA();
		a.abc();
	}
}
