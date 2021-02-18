package com.valuemomentum.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public BufferedWriterDemo(FileWriter writer) {
		
	}

	public static void main(String[] args) {
		try {
			FileWriter  writer=new FileWriter("c:/abc/names.txt",true);
			BufferedWriter bwr=new BufferedWriter(writer);
			bwr.write("james");
			bwr.write("\n");
			bwr.write("Hobert");
			bwr.close();
			System.out.println("successfully written to a file");
		}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		
		// TODO Auto-generated method stub

	}

}
