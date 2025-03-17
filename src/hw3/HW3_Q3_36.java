package hw3;

import java.util.Scanner;
public class HW3_Q3_36 {
	// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
	// 但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，
	// 讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數：
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println();
		int columnCount = 1, count = 0;
		for (int i = 1; i <= 49; i++) {
			if(i % 10 == x || (int)(i / 10) == x)
				continue;
			System.out.print(i + " ");
			columnCount ++;
			if(columnCount > 6) {
				System.out.println();
				columnCount = 1;
			}
			count ++;
		}
		System.out.printf("總共有%d數字可選\n", count);
		
		// 亂數印出6個號碼且不得重複
		int[] sixNums = new int[6];
		int temp;
		System.out.printf("\n亂數選號：\n");
		for(int j = 0; j < 6; j++) {
			outerLoop:
			while(true) {
				temp = (int)(Math.random()*49)+1;
				if((temp % 10 == x || (int)(temp / 10) == x))
					continue;
				for(int k = 0; j > 0 && k <= j; k++) {
					if (temp == sixNums[k])
						continue outerLoop;
				}
				sixNums[j] = temp;
				System.out.printf("%d ", sixNums[j]);
				break;
			}
		}
		System.out.println();
	}
}
