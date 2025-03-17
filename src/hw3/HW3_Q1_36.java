package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class HW3_Q1_36 {
	// Q1:請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、
	// 等腰三角形、其它三角形或不是三角形：
	public static void judgeTriangle(int[] e) {
		Arrays.sort(e);
		if ((e[0] <= 0) || (e[0] + e[1] <= e[2])){
			System.out.print("不是三角形");
			return;
		}
		if (e[0] == e[1] && e[1] == e[2]) {
			System.out.print("是正三角形");
		} else if (e[0] == e[1] || e[1] == e[2]){
			System.out.print("是等腰三角形");
		} else {
			System.out.print("是其他三角形");
		}
		if (Math.pow(e[0], 2) + Math.pow(e[1], 2) == Math.pow(e[2], 2)) {
			System.out.println("，而且是直角三角形");
		} else {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.print("請輸入三個整數邊長: ");
		Scanner sc = new Scanner(System.in);
		int edge[] = new int[3];
		edge[0] = sc.nextInt();
		edge[1] = sc.nextInt();
		edge[2] = sc.nextInt();
		judgeTriangle(edge);
		System.out.println();
	}
}
