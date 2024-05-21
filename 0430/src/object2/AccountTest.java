package object2;

public class AccountTest {
	public static void main(String[] args) {
		
		Account ac1 = new Account(1000);
		System.out.println(ac1);
		System.out.println("ac1 > " + Account.money1);

		Account ac2 = new Account(1000);
		System.out.println(ac2);
		System.out.println("ac2 > " + Account.money1);

		Account ac3 = new Account(1000);
		System.out.println(ac3);
		System.out.println("ac3 > " + Account.money1);
	}
}
