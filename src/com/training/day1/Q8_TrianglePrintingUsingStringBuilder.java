package com.training.day1;
import com.training.day1.PrintBar;

public class Q8_TrianglePrintingUsingStringBuilder {
	public static void main(String[] args) {
		int[] grades= {72,82,92,85,75,65,65,75};
		int a=0,b=0,c=0,d=0, e=0;
		for(int g:grades) {
			if(g>=90) a++;
			else if(g>=80) b++;
			else if(g>=70) c++;
			else if(g>=60) d++;
			else e++;
			
		}
		PrintBar.printBar("A(90-100)",a);
		PrintBar.printBar("B(80-90)",b);
		PrintBar.printBar("C(70-80)",c);
		PrintBar.printBar("D(60-70)",d);
		PrintBar.printBar("E(<60)",e);
	}

}
