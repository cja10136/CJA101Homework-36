package hw4;

public class HW4_Q1_36 {
//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void main(String[] args) {
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		double avg = (double)sum / arr.length;
		System.out.println("所有元素的平均值：" + avg);
		System.out.print("大於平均值的元素：");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > avg)
				System.out.print(arr[i] + " ");
		System.out.println();
	}
}
