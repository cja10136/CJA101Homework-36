package hw7; // done

import java.io.*;

public class WriteDogCat {
	//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，
	//  寫到C:\data\Object.ser裡。注意物件寫入需注意的事項，
	//	若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) throws IOException {
		// 創物件
		Animal animal[] = new Animal[4];
		animal[0] = new Dog("Won1");
		animal[1] = new Dog("Won2");
		animal[2] = new Cat("Meo1");
		animal[3] = new Cat("Meo2");
		// 寫入
		File outputFile = new File("C:\\data\\Object.ser");
		File fileParent = new File(outputFile.getParent());
		if (!fileParent.exists())
			fileParent.mkdirs();
		FileOutputStream fos = new FileOutputStream(outputFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < 4; i++) {
			oos.writeObject(animal[i]);
		}
		oos.close();
		fos.close();
	}
}
