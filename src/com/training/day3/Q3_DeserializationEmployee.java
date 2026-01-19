package com.training.day3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.training.day3.Q3_Employee;

public class Q3_DeserializationEmployee {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new ObjectInputStream(new
				FileInputStream("emp.ser")));
		Q3_Employee emp=(Q3_Employee)ois.readObject();
		
		
		ois.close();
		System.out.println("Employee object desereialized ");
		emp.display();
	}

}
