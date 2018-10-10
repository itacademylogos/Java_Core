package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ApplicationSerialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("serailizedStudent.txt");
		Student st = new Student(21,"Ivan", "Lys");
		System.out.println(st);
		serializeObject(st, file);
		
		System.out.println(deserealizeObject(file));
		
	}
	
	public static void serializeObject (Serializable object, File file) throws IOException {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
		os.close();
	}
	
	public static Serializable deserealizeObject(File file) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois =new ObjectInputStream(is);
		Serializable object = (Serializable) ois.readObject();
		ois.close();
		is.close();
		
		return object;
	}
	
	
}
