import java.util.Scanner;
public class SingleDigit {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		if(number>=-9 && number<=9 )
		{
			System.out.println("entered number is single digit");
		}
		else
		{
			System.out.println("number is double digit");
		}
		// TODO Auto-generated method stub

	}

}
