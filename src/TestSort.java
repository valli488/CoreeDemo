import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();  

		al.add("John");  
		al.add("Mike");  
		al.add("Raj");  
		al.add("Mary");  
		  
		Collections.sort(al);  
		System.out.println(al); 

		Collections.sort(al,Collections.reverseOrder());  
		System.out.println(al);  

		System.out.println("Maximum Element: "+ Collections.max(al));

		 }  
		

	}

