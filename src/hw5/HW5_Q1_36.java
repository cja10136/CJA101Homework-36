package hw5; // done

import java.util.Scanner;
public class HW5_Q1_36 {
//	請設計一個方法為starSquare(int width, int height)，
//	當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	public static void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("請輸入寬與高：");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);
	}
}
