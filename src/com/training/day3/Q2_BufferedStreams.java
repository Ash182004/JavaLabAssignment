package com.training.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Q2_BufferedStreams {
public static void main(String[] args) {
	File source=new File("C:\\Users\\VE00YN345\\Desktop\\source.txt");
	File Destination=new File("C:\\Users\\VE00YN345\\Desktop\\Destination.txt");
	File Destination2=new File("C:\\Users\\VE00YN345\\Desktop\\destination2.txt");
	
	try {
		long start1=System.currentTimeMillis();
		FileReader fr=new FileReader(source);
		FileWriter fw=new FileWriter(Destination);
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		long end1=System.currentTimeMillis();
		long timeWithoutBuffer=end1-start1;
		System.out.println("the time taken without buffer"+(end1-start1));
		
		long start2=System.currentTimeMillis();
		BufferedReader br=new BufferedReader(new FileReader(source));
		BufferedWriter bw=new BufferedWriter(new FileWriter(Destination2));
		int c;
		while((c=fr.read())!=-1) {
			fw.write(c);
		}
		fr.close();
		fw.close();
		long end2=System.currentTimeMillis();
		long TimeWithBuffer=end2-start2;
		System.out.println("the time taken"+(end2-start2));
		
		System.out.println("character stream copy done");
		System.out.println("original size"+source.length());
		System.out.println("copied size"+Destination.length());
	}catch(FileNotFoundException e) {
		System.out.println("file not found"+e.getMessage());
		
	}catch(IOException e) {
		System.out.println("IO error"+e.getMessage());
	}
}
}
