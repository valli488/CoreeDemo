package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java");
        al.add("Fri");
        al.add("De");
        al.add("Is");
        al.add("Sup");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
 
        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
    int pos=Collections.binarySearch(al,"Superb");
    System.out.println("The position of \"Superb\" in Arraylist is :"+pos);
    
     Collections.reverse(al);
    System.out.println("List after the Reversing"+ al);

     Collections.swap(al,4,1);
    System.out.println("List after the SWaping"+ al);
    Collections.shuffle(al);
    System.out.println("List after the shuffle");
    ArrayList<String> n=new ArrayList<String>();
    Collections.copy(n, al);
    System.out.println("new list content: "+n);
    ArrayList<String> n1=new ArrayList<String>(5);
    n1.addAll(al);
    System.out.println(n1);
   
    
    
    }

	}


