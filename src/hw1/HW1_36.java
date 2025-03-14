package hw1; // 已完成

public class HW1_36 {
	public static void main(String[] args) {
		//1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println("第一題："+ (12 + 6));
		
		//2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		System.out.println("第二題：" + 200/12 + "打，" + 200%12 + "顆");
		
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int time = 256559;
		int second = time % 60;
		time -= second; time /= 60; // 將time的單位改為分鐘
		int minu = time % 60;
		time -= minu; time /= 60; // 將time的單位改為小時
		int hour = time % 24;
		time -= hour; time /= 24; // 將time的單位改為天
		System.out.println("第三題：" + time + "天" + hour + "小時" + minu + "分" + second + "秒");
		
		//4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		System.out.printf("第四題：圓面積:%.4f，圓周長:%.4f\n", PI*Math.pow(5, 2), 2*PI*5);
		
		//5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，
		//	本金加利息共有多少錢 (用複利計算，公式請自行google)
		double deposit = 1500000;
		deposit *= Math.pow(1.02, 10);
		System.out.printf("第五題：%.2f元\n", deposit);
		
		//6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		//	5 + 5
		//	5 + ‘5’
		//	5 + “5”
		//	並請用註解各別說明答案的產生原因
		System.out.println("第六題：");
		System.out.println(5 + 5); // 10，整數相加5+5=10
		System.out.println(5 + '5'); // 58，因字元'5'的Unicode以十進位表示是53
		System.out.println(5 + "5"); // 55，先印數字5再印字串5
	}
}
