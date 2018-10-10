package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ApplicationBasicStreams {

	public static void main(String[] args) throws IOException {
		
		File file = new File("basicStreams.txt");
		writeUsingOutputStream("Hello students, I am teacher!", file);
		
		String textFromFileIS = readUsingInputStream(file);
		System.out.println(textFromFileIS+"\n");

		File file2 = new File("basicStreams2.txt");
		writeUsingWriter("Run Forest Run", file2);
		String textFromReader = readUsingReader(file2);
		System.out.println(textFromReader);
	}
	
	
	public static String  readUsingInputStream(File file) throws IOException {
		StringBuilder sb = new StringBuilder();
		InputStream is =new FileInputStream(file);
		int information = is.read();
		char data;
		
		while(information != -1) {
			data = (char)information;
			sb.append(data);
			information = is.read();
		}
		is.close();
		
		return sb.toString();
	}
	
	public static void writeUsingOutputStream(String data, File file) throws IOException {
		OutputStream os = new FileOutputStream(file);
		os.write(data.getBytes());
		os.close();
	}
	
	
	public static void writeUsingWriter(String data, File file) throws IOException {
		Writer wr = new FileWriter(file);
		wr.write(data);
		wr.close();
	}
	
	public static String readUsingReader(File file) throws IOException {
		StringBuilder st  = new StringBuilder();
		Reader r = new FileReader(file);
		
		char[] arrayOfChars = new char[100];
		r.read(arrayOfChars);
		
		for (char c : arrayOfChars) {
			st.append(c);
		}
		r.close();
		
		return st.toString();
	}
	
}
