package hw7; // done

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadSample {
	//  請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
	//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
	public static void main(String[] args) throws IOException {
		File inputFile = new File("./src/hw7/Sample.txt");

		// 查位元組
		long len = inputFile.length();
		
		// 算字元
		FileReader fr = new FileReader(inputFile);
		int countChar = 0;
		while((fr.read()) != -1) {
			countChar++;
		}
		fr.close();
		
		// 算有幾列
		fr = new FileReader(inputFile); // 重設對檔案的"指標"至開頭
		BufferedReader br = new BufferedReader(fr);
		int countLine = 0;
		String s;
		while((s = br.readLine()) != null) {
			countLine++;
		}
		br.close();
		fr.close();
		
		System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料", len, countChar, countLine);
	}
}
