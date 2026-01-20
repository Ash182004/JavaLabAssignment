package com.training.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1_ByteStreamCopy {
	public static void main(String[] args) {
		File source=new File("C:\\Users\\VE00YN345\\Desktop\\source.txt");
		File Destination=new File("C:\\Users\\VE00YN345\\Desktop\\Destination.txt");
		
		try {
			FileInputStream fr=new FileInputStream(source);
			FileOutputStream fw=new FileOutputStream(Destination);
			int ch;
			while((ch=fr.read())!=-1) {
				fw.write(ch);
			}
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
