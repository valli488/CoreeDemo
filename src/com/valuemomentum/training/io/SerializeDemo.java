package com.valuemomentum.training.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee6 e=new Employee6();
		e.name="vs";
		e.address="castle street, banglore";
		e.SSN=8899;
		e.number = 101;
		try {
			FileOutputStream fileout=new FileOutputStream("c:/abc/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			//Object e;
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.println("serialised data is saved in:c:/demo/employee.ser");
		}catch(IOException e1)
		{
			e1.printStackTrace();
		}
			
		
		// TODO Auto-generated method stub

	}

}
