package hw9; // done

class Account{
	private int balance = 0;
	private int f1 = 0; // flag，1表熊大通知熊媽匯款
	private int f2 = 0; // flag，1表熊媽通知熊大已有錢
	private int countDeposit = 0;
	private int countWithdraw = 0;
	
	public void deposit(int amount, int maxWithdrawTimes) {
		synchronized(this) {
			while(balance > 3000) {
				System.out.println("熊媽看到餘額在3000以上，暫停匯款");
				if(countWithdraw >= maxWithdrawTimes)
					return;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(f1 == 1) {
				System.out.println("熊媽被熊大要求匯款!");
				f1 = 0;
				f2 = 1;
			}
			balance += amount; 
			countDeposit++;
			System.out.println("熊媽存了" + amount + "，帳戶共有" + balance);
			notify();
		}
	}
	
	public void withdraw(int amount, int maxDepositTimes) {
		synchronized(this) {
			while(balance < amount) {
				System.out.println("雄大看到帳戶沒錢，暫停提款");
				if(countDeposit >= maxDepositTimes) 
					return;
				f1 = 1;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(f2 == 1) {
				System.out.println("熊大被告知帳戶已經有錢!");
				f2 = 0;
			}
			if(balance <= 2000) {
				System.out.println("熊大看到餘額在2000以下，要求匯款");
			}
			balance -= amount; 
			countWithdraw++;
			System.out.println("熊大領了" + amount + "，帳戶共有" + balance);
			notify();
		}
	}
}

class BearMom extends Thread {
	Account account;
	public BearMom(Account account) {
		this.account = account;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			account.deposit(2000, 10);
		}
	}
}

class Bear extends Thread {
	Account account;
	public Bear(Account account) {
		this.account = account;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			account.withdraw(1000, 10);
		}
	}
}

public class DepositWithdraw {
	public static void main(String[] args) {
		Account account = new Account();
		BearMom bearMom = new BearMom(account);
		Bear bear = new Bear(account);
		bearMom.start();
		bear.start();
	}
}
