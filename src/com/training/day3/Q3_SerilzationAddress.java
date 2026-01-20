package com.training.day3;
import java.io.Serializable;

public class Q3_SerilzationAddress implements Serializable{
	String city;
	String state;
	Q3_SerilzationAddress(String city,String state){
		this.city=city;
		this.state=state;
	}
	

}
