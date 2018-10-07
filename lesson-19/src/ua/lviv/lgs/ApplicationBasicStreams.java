package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
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

		File file = new File("file.txt");

		// byteStream
//		writeOS(file);
//		String textFromFile = readIS(file);
//		System.out.println(textFromFile);
		
		//symbol streams 
		writeSS(file);
		String textFromFileSysmbols = readSS(file);
		System.out.println(textFromFileSysmbols);
	}

	public static void writeOS(File file) throws IOException {
		OutputStream os = new FileOutputStream(file);
		os.write("Hello Logos".getBytes());
		os.close();
	}

	public static String readIS(File file) throws IOException {
		StringBuilder st = new StringBuilder();
		InputStream is = new FileInputStream(file);
		int inform = is.read();
		char data;

		while (inform != -1) {
			data = (char) inform;
			st.append(data);
			inform = is.read();
		}

		is.close();

		return st.toString();
	}

	public static void writeSS(File file) throws IOException {
		Writer os = new FileWriter(file, false);
		os.write("Hello Logos from Symbol Stream");
		os.close();
	}

	public static String readSS(File file) throws IOException {
		StringBuilder st = new StringBuilder();
		Reader is = new FileReader(file);
		char array[] =new char[100];
		is.read(array);
		is.close();
		for (int i = 0; i < array.length; i++) {
			st.append(array[i]);
		}
		
		return st.toString();
	}

	
	
}
