package com.valuemomentum.training.io;

import java.io.*;
import java.util.Date;
public class FileClass {

	public static void main(String[] args) {
		File f=new File("c:/test/hello.txt");
		try {
			
			if(f.createNewFile()) {
				System.out.println("new file created");
			}
				else { 
					System.out.println("the file already exists"); 
				} }
			catch(IOException e)
				{
					e.printStackTrace();
			}
		System.out.println("NAme of file:" + f.getName());
		System.out.println("path of file:" + f.getPath());
		System.out.println("file last modified:" + new Date( f.lastModified()));
		System.out.println("parent directory of file:" + f.getParent());
		System.out.println("size of file:" + f.length() + "Bytes'");
		
		}
	}

		// TODO Auto-generated method stub

	


