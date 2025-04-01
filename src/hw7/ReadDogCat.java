package hw7; // done

import java.io.*;

public class ReadDogCat {
	//  請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Animal animal[] = new Animal[4];
		// 讀取
		File inputFile = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(inputFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		for (int i = 0; i < 4; i++) {
			animal[i] = (Animal)ois.readObject();
		}
		ois.close();
		fis.close();
		// speak
		for (int i = 0; i < 4; i++) {
			animal[i].speak();
		}
	}
}
