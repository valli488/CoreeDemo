import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args)
	{
		int a,b,res;
	    String op;
	    Scanner   s=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("enter the operator");
	     op=s.next();
	    
	     switch(op)
	     {
	    	 case "+" : res=a+b;
	    	            System.out.println("addition is"+res);
	    	            break;
	    	 case "-" : res=a-b;
	                    System.out.println("sub is"+res);
	                    break;           
	    	 case "*": res=a*b;
	                    System.out.println("mul is"+res);
	                    break;
	    	 case "/" : res=a/b;
	                    System.out.println("div is"+res);
	                    break;
	         default  : System.out.println("invalid op");  
	                    break;
	    
	     }

	}

}
