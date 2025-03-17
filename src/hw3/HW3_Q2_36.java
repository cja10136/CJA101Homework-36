package hw3;

import java.util.Scanner;
public class HW3_Q2_36 {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，
//	猜錯會顯示錯誤訊息，猜對則顯示正確訊息：
	public static void main(String[] args) {
		int ans = (int)(Math.random()*10);
		Scanner sc;
		int guess;
		boolean right = false;
		System.out.println("開始猜數字吧!");
		for (int i = 1; i < 11; i++) {
			sc = new Scanner(System.in);
			guess = sc.nextInt();
			if(guess == ans) {
				System.out.println("答對了!答案就是 " + ans);
				right = true;
				break;
			} else {
				System.out.println("猜錯囉");
			}
		}
		if(right == false) {
			System.out.println("你已猜超過次數，遊戲結束");
		}
			

		
		
		
		
	}
}
