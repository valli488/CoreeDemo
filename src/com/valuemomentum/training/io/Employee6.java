package com.valuemomentum.training.io;

import java.io.Serializable;

public class Employee6 implements Serializable {
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	public void mailCheck()
	{
		System.out.println("mailling a check to "+name+""+address);
	}
	

}
