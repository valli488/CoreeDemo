import java.util.Scanner;
public class DemoDOwhile {

	public static void main(String[] args)
	{
		
		int sum = 0;

		int number = 0; 
		Scanner s = new Scanner(System.in);

			// do...while loop continues
   
		// until entered number is positive
		do
		{
			// add only positive number
			sum+=number;
			System.out.println("enter number");;
			number=s.nextInt();
		}
		while(number>0);
		
			System.out.println("sum= "+sum);
			s.close();
		


		// TODO Auto-generated method stub

	}

}
