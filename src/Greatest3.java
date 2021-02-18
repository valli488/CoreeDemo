import java.util.Scanner;
public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 no");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>c)
		{
			System.out.println("b is greatest");
		}
		else
		{// TODO Auto-generated method stub
			System.out.println("c is greatest");
		}

	}

}
