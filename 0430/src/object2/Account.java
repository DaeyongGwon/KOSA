package object2;

public class Account {
	// static을 붙이면 정적이 되고 공유가 된다.
	static int money1;
	int money2;

	public Account(int money) {
		this.money1 += money;
		this.money2 += money;
	}

	@Override
	public String toString() {
		return "Account [money1 = " + money1 + ", money2 = " + money2 + "]";
	}
}
