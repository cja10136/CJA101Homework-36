package hw2;

public class HW2_36 {
	public static void main(String[] args) {
		//1. 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int result1 = 0;
		for (int i = 2; i <= 1000; i += 2) {
			result1 += i;
		}
		System.out.println("第一題：總和 " + result1);
		
		//2. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int result2 = 1;
		for (int i = 1; i <= 10; i ++) {
			result2 *= i;
		}
		System.out.println("第二題：乘積 " + result2);
		
		//3. 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int i = 1, result3 = 1;
		while (i <=10) {
			result3 *= i;
			i +=1;
		}
		System.out.println("第三題：乘積 " + result3);
		
		//4. 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		System.out.print("第四題：");
		for (i = 1; i <= 10; i++) {
			System.out.print((int)Math.pow(i, 2) + " ");
		}
		System.out.println();
		
		//5. 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		//   輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		System.out.print("第五題：");
		for (i = 1; i < 50; i++) {
			if(i%10 == 4 || i/10 == 4)
				continue;
			System.out.print(i + " ");
			count += 1;
		}
		System.out.printf("\n，總共%d個\n", count);
		
		//6. 請設計一隻Java程式,輸出結果為以下:
		//	 1 2 3 4 5 6 7 8 9 10
		//	 1 2 3 4 5 6 7 8 9
		//	 1 2 3 4 5 6 7 8
		// 	 1 2 3 4 5 6 7
		//	 1 2 3 4 5 6
		//	 1 2 3 4 5
		//	 1 2 3 4
		//	 1 2 3
		//	 1 2
		//	 1
		System.out.println("第六題：");
		for (i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//7. 請設計一隻Java程式,輸出結果為以下:
		//	 A
		//	 BB
		//	 CCC
		//	 DDDD
		//	 EEEEE
		//	 FFFFFF
		char c = 'A';
		System.out.println("第七題：");
		for (i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c);
			}
			c ++;
			System.out.println();
		}
		
		//8. 請建立一個TestNineNine.java程式,可輸出九九乘法表
		System.out.println("第八題：");
		//一:使用for迴圈 + while迴圈
		System.out.println("使用for迴圈 + while迴圈：");
		for (i = 1; i <=9 ; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d*%d=%d ", i, j, i*j);
				j++;
			}
			System.out.println();
		}
		//二:使用for迴圈 + do while迴圈
		System.out.println("\n使用for迴圈 + do while迴圈：");
		for (i = 1; i <=9 ; i++) {
			int j = 1;
			do {
				System.out.printf("%d*%d=%d ", i, j, i*j);
				j++;
			} while (j <= 9);
			System.out.println();
		}
		//三:使用while迴圈 + do while迴圈
		System.out.println("\n使用while迴圈 + do while迴圈：");
		i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.printf("%d*%d=%d ", i, j, i*j);
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}
}
