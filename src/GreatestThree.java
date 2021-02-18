import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 2 no");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{
			System.out.println(a+" is Greatest");
			
		}
		else
		{
			System.out.println(b+"is greatest");
		}
		

	}

}
