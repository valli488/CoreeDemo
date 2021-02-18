import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args)
	{
		int result;
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter standard");
		int standard=s.nextInt();
		System.out.println("enter id");
		int Id=s.nextInt();
		System.out.println("enter 5 subjects marks");
		int sub1=s.nextInt();
		int sub2=s.nextInt();
		int sub3=s.nextInt();
		int sub4=s.nextInt();
		int sub5=s.nextInt();
		result=((sub1+sub2+sub3+sub4+sub5)/5);
		System.out.println("total marks are "+result);
		if(result>=70 && result<=100)
		{
			System.out.println("distinction");
		}
		else if(result>=60 && result<70)
		{
			System.out.println("first class");
		}
		else if (result>=40 && result<50)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("fail");

		}
	
		// TODO Auto-generated method stub

	}

}
