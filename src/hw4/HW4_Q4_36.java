package hw4;

import java.util.Scanner;
public class HW4_Q4_36 {
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,
//	其員工編號與身上現金列表如下：(略)
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共3 人!」
	public static void main(String[] args) {
		int[][] coworker = {
				{25, 32, 8, 19, 27},
				{2500, 800, 500, 1000, 1200}
		};
		System.out.print("阿文你想借多少：");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int count = 0;
		System.out.print("有錢可借的員工編號: ");
		for (int i=0; i < coworker[0].length; i++) {
			if(coworker[1][i] >= amount) {
				System.out.print(coworker[0][i] + " ");
				count++;
			}
		}
		System.out.printf("共%d人!\n", count);
	}
}
