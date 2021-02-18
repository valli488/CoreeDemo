import java.util.Scanner;
public class ForDemo {

	public static void main(String[] args) {
		int i=0,n,sum=0;
		System.out.println("enter number");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		while(i<=n)
		{
			sum+=i;
			System.out.println(sum);
			i++;
			
		}
		
		

	}

}
