package hw4;

import java.util.Scanner;
public class HW4_Q2_36 {
//	請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
	public static void main(String[] args) {
		System.out.print("請輸入一個字串: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));
		System.out.println();
	}
}
