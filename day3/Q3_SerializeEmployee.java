package com.training.day3;
import com.training.day3.Q3_SerilzationAddress;

import com.training.day3.Q3_Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Q3_SerializeEmployee {
	public static void main(String[] args) throws IOException {
		Q3_SerilzationAddress addr=new Q3_SerilzationAddress("Delhi","India");
		Q3_Employee emp=new Q3_Employee(101,"amit",addr,5000);
		ObjectOutputStream oos=new ObjectOutputStream(new ObjectOutputStream(new
				FileOutputStream("emp.ser")));
		oos.writeObject(emp);
		oos.close();
		System.out.println("Employee object sereialized ");
		
		
	}

}
