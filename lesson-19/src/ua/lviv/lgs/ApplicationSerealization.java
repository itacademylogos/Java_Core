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

public class ApplicationSerealization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("serializablePerson");
		Person p = new Person("Ivan", "Bloch", 23);
		System.out.println(p);
		System.out.println();
		writeObject(file, p);
		
		Person p2 = (Person)readObject(file);
		System.out.println(p2);
	
	}

	public static void writeObject(File file, Serializable obj) throws IOException {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream objOs = new ObjectOutputStream(os);
		objOs.writeObject(obj);
		objOs.close();
		os.close();
	}

	public static Serializable readObject(File file) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable object = (Serializable) ois.readObject();
		ois.close();
		is.close();

		return object;
	}

}
