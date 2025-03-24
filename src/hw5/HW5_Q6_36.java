package hw5; // done

import java.util.Random;
public class HW5_Q6_36 {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
//	請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
//	此驗證碼內容包含了英文大小寫與數字的亂數組合
	public static void main(String[] args) {
		String authCode = genAuthCode();
		System.out.println("本次隨機產生的驗證碼為：");
		System.out.println(authCode);
	}
	static String genAuthCode() {
		int length = 8;
		final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		int index;
		Random random = new Random();
		String authCode = new String();
		for (int i = 0; i < length; i++) {
			index = (int)(random.nextInt(CHARACTERS.length()));
			authCode += CHARACTERS.charAt(index);
		}
		return authCode;
	}
}
