package com.training.day3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q2_ByteStreamWithBuffer {
	public static void main(String[] args) throws IOException {
		File source=new File("C:\\Users\\VE00YN345\\Desktop\\source.txt");
		File Destination=new File("C:\\Users\\VE00YN345\\Desktop\\Destination.txt");
		File Destination2=new File("C:\\Users\\VE00YN345\\Desktop\\destination2.txt");
		
		
			long start1=System.currentTimeMillis();
			FileInputStream fr=new FileInputStream(source);
			FileOutputStream fw=new FileOutputStream(Destination);
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
			BufferedInputStream br=new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream bw=new BufferedOutputStream(new FileOutputStream(Destination2));
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
		
		
	}
	

}
