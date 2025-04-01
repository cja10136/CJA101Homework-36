package hw7; // done

import java.io.*;
import java.util.*;

public class OutputData {
	//請寫一隻程式，能夠亂數產生10個1～1000的整數，
	//並寫入一個名為Data.txt的檔案裡(請使用
	//append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) throws IOException {
		String str = "";
		Set<Integer> set = new HashSet<>();
		while(set.size() < 10) {
			set.add((int)(Math.random() * 1000) + 1);
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			str = str + it.next() + " ";
		}
		
		File outputFile = new File("./src/hw7/Data.txt");
		FileWriter fw = new FileWriter(outputFile, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(str);
		pw.close();
		fw.close();
	}
	
	
}
