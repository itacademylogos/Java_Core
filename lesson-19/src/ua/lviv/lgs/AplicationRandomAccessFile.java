package ua.lviv.lgs;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AplicationRandomAccessFile {
	public static void main(String[] args) throws IOException {
		String filePath = "F:/TestRandoms/wrapper/testRandomAccess.txt";

		writeToFile(filePath, "Custom text from lesson 19", 50);

		String textFromFile = readFromFile(filePath, 70, 1000);
		System.out.println(textFromFile);
		
	}

	public static void writeToFile(String filePath, String data, int position) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(position);
		file.write(data.getBytes());
		file.close();
	}

	public static String readFromFile(String filePath, int position, int size) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(position);
		byte[] bytes = new byte[size];
		file.read(bytes);
		file.close();
		StringBuilder st = new StringBuilder();
		for (byte b : bytes) {
			st.append((char)b);
		}

		return st.toString();
	}

}
