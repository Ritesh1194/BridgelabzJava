package com.bridgelabz.designpatternprogram.singleton;

/*******************************************************************************
 * 1. Creational Design Patterns :- Serialization and Singleton
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import java.io.*;

public class TestSerializedSingleton {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(
				new FileOutputStream("/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/SerializableFile"));
		out.writeObject(instanceOne);
		out.close();

		ObjectInput in = new ObjectInputStream(
				new FileInputStream("/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/SerializableFile"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

	}
}