package com.training.day3;
import java.io.Serializable;
import com.training.day3.Q3_SerilzationAddress;


public class Q3_Employee implements Serializable {
	int id;
	String name;
	Q3_SerilzationAddress address;
	transient double salary;
	
	Q3_Employee(int id,String name,Q3_SerilzationAddress address,double salary){
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
		
	}
	void display() {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("City:"+address.city);
		System.out.println("State:"+address.state);
		System.out.println("Salary:"+salary);
		
	}
	

}
