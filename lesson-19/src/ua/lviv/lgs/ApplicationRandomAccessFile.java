package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ApplicationRandomAccessFile {
	public static void main(String[] args) throws IOException {

		File file = new File("randomAccessFile.txt");
		String data = "Custom text Custom text Custom text Custom text Custom text Custom textCustom text";
		
		writeToFile(file,10, "333333333333333333333333333333333333");
		System.out.println(readFromFile(file,20, 50));
		
	}
	
	public static void writeToFile(File file, int position, String data) throws IOException {
		RandomAccessFile files = new RandomAccessFile(file, "rw");
		files.seek(position);
		files.write(data.getBytes());
		files.close();
	}
	
	public static String readFromFile(File file, int position, int size) throws IOException {
		StringBuilder st = new StringBuilder();
		RandomAccessFile files = new RandomAccessFile(file,"rw");
		files.seek(position);
		byte[] bytes = new byte[size];
		files.read(bytes);
		files.close();
		
		for (byte b : bytes) {
			st.append((char) b);
		}
		
		return st.toString();
	}
	
	
	
}
