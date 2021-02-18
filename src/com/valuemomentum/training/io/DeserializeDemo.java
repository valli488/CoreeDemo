package com.valuemomentum.training.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee6 e=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("c:/abc/employee.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			e=(Employee6)in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i)
		{
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c)
		{
			System.out.println("employee class not found");
			c.printStackTrace();
			return;
			
		}
		System.out.println("Deserialized employee");
		System.out.println("Name: "+ e.name);
		System.out.println("address: "+ e.address);
		System.out.println("number : "+ e.number);
		System.out.println("SSN: "+ e.SSN);
		
		// TODO Auto-generated method stub

	}

}
