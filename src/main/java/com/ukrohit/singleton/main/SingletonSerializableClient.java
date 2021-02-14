package com.ukrohit.singleton.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.ukrohit.singleton.SingletonSerializable;

/**
 * @author Umesh Rohit
 *
 *         via the serialzation we can also breake the singleton object creation
 *
 *         here we will get deff hash code for both the object
 * 
 *         this will not work in the distributed envirnment
 */
public class SingletonSerializableClient {

	public static void main(String[] args) throws IOException {

		SingletonSerializable singleTon1 = SingletonSerializable.getInstance();
		SingletonSerializable singleTon2 = null;

		// Serialization process we can write the object into the file
		ObjectOutput output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			output.writeObject(singleTon1);
			output.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			output.close();
		}

		// deserialtion read object from the file

		ObjectInput objectInput = null;

		try {
			objectInput = new ObjectInputStream(new FileInputStream("singleton.ser"));
			Object readObject = objectInput.readObject();
			singleTon2 = (SingletonSerializable) readObject;
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(singleTon1.hashCode());

		System.out.println(singleTon2.hashCode());
	}

}
