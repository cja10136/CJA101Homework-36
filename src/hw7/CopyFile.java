package hw7; // done

import java.io.*;

public class CopyFile {
	public static void copyFile(File fromFile, File toFile) throws IOException {
		if(!fromFile.isFile()) {
			System.out.println("傳入檔案錯誤!");
			return;
		}
		FileInputStream fis = new FileInputStream(fromFile);
		FileOutputStream fos = new FileOutputStream(toFile);
		byte b[] = new byte[4096];
		int length;
		while((length = fis.read(b)) != -1) {
			fos.write(b, 0, length);
			fos.flush();
		}
		fis.close();
		fos.close();
		System.out.println("Done!");
	}
	
	public static void main(String[] args) throws IOException {
		String filePath = "./src/hw7/Sample.txt";
		String pathWithoutType = filePath.substring(0, filePath.lastIndexOf("."));
		String fileType = filePath.substring(filePath.lastIndexOf("."));
		String toPath = pathWithoutType + "_cpoied" + fileType;
		File fromFile = new File(filePath);
		File toFile = new File(toPath);
		copyFile(fromFile, toFile);
	}
}

