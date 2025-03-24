package hw5; // done

public class HW5_Q2_36 {
//  請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值
//	並印出這10個亂數與平均值
	public static void randAvg() {
		double sum = 0;
		int randNums[] = new int[10];
		System.out.print("本次亂數結果：");
		for (int i = 0; i < 10; i++) {
			randNums[i] = (int)(Math.random()*101);
			System.out.printf("%d ", randNums[i]);
			sum += randNums[i];
		}
		
		double avg = sum / randNums.length;
		System.out.println("\n平均值：" + avg);
	}
	public static void main(String[] args) {
		randAvg();
	}
}
