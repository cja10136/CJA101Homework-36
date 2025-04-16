package hw9; // done

public class EatingRace implements Runnable {
	String name;
	int counter;
	public EatingRace(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (counter = 1; counter < 11; counter++) {
			int sleepTime = (int)(Math.random() * 2501) + 500;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "吃第" + counter + "碗飯");
		}
		System.out.println(name + "吃完了!");
	}
	
	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始!-----");
		EatingRace r1 = new EatingRace("饅頭人");
		EatingRace r2 = new EatingRace("詹姆士");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束!-----");
	}
}
