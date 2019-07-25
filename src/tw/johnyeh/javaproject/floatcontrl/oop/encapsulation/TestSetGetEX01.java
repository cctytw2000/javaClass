package tw.johnyeh.javaproject.floatcontrl.oop.encapsulation;

class Bank {
	private int money = 10000;
	private String account = "John";

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}

public class TestSetGetEX01 {

	public static void main(String[] args) {
		Bank smallTree = new Bank();
		smallTree.setMoney(12000);
		int myMoney = smallTree.getMoney();
		System.out.println(myMoney);

	}

}
