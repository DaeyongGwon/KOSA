package interface_02;


interface A{
	public static final int a =3;
	public abstract void abc();
}

interface B {
	int b = 3;
	void bcd();
	
}
public class InterfaceCharacteristices {
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.b);
	}
}
