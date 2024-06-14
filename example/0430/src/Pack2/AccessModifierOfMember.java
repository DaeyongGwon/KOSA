package Pack2;
import Pack1.A;
import Pack1.B;
import Pack2.C;
import Pack2.D;

public class AccessModifierOfMember {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
