import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("enter no of elements you want in array");
		n=s.nextInt();
		int  a[]=new int [n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			sum+=a[i];
		}
		System.out.println("sum: " + sum);

		

	}

}
