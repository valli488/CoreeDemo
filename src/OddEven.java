import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		number=s.nextInt();
		if(number%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		// TODO Auto-generated method stub

	}

}
