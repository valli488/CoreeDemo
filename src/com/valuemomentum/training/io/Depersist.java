package com.valuemomentum.training.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream In= new ObjectInputStream(new FileInputStream("c:/demo/f1.txt"));
		Student s=(Student)In.readObject();
		System.out.println(s.id+""+s.name);
        In.close();
		// TODO Auto-generated method stub

	}

}
