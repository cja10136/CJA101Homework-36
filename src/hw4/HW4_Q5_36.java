package hw4;

import java.util.Scanner;
public class HW4_Q5_36 {
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，
//	執行後會顯示是該年的第幾天。例：輸入1984 9 8 三個號碼後，
//	程式會顯示「輸入的日期為該年第252天」
	public static void main(String[] args) {
		System.out.print("請輸入三個整數，分別代表西元yyyy年，mm月，dd日：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(), month = sc.nextInt(), date = sc.nextInt();
//		公元年份非4的倍數，為365天平年。
//		公元年份為4的倍數但非100的倍數，為366天閏年。
//		公元年份為100的倍數但非400的倍數（1700年、1800年及1900年）為平年。
//		公元年份為400的倍數（1600年及2000年）為閏年。
		boolean isLeap;
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ))
			isLeap = true;
		else
			isLeap = false;
		int monthDays[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeap)
			monthDays[2] += 1;
		
		if(date > monthDays[month]) {
			System.out.println("輸入的日期錯誤!");
			return;
		}
		
		int count = 0;
		for (int i = 1; i < month; i++) {
			count += monthDays[i];
		}
		count += date;
		System.out.printf("輸入的日期為該年第%d天\n", count);
	}
}
