package com.valuemomentum.training.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {
		Student s1=new Student(101,"vs");
		FileOutputStream fout=new FileOutputStream("c:/demo/f1.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
		// TODO Auto-generated method stub

	}

}
