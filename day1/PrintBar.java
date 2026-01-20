package com.training.day1;

public class PrintBar {
   static void printBar(String label,int count) {
	   StringBuilder sb=new StringBuilder(label+":");
	   for(int i=0;i<count;i++) {
		   sb.append("*");
	   }
	   System.out.println(sb);
	   
   }
}
