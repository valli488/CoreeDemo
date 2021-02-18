import java.util.Scanner;
public class EmployeeSal {
	
	public static void main(String[] args)
	{
	    double basicsalary,HRA,DA,netsalary,pf;
		Scanner s=new Scanner(System.in);
		System.out.println("enter employeeName ");
		String employeeName=s.next();
		System.out.println("enter employeeid");
		String employeeid=s.next();
		System.out.println("enter basic salary " );
		basicsalary=s.nextInt();
		System.out.println("basic salary is :" + basicsalary);
		System.out.println("enter your pf: ");
		pf=s.nextDouble();
		System.out.println("pf is: "+ pf);
		HRA=basicsalary*(25%100);
		System.out.println(HRA);
		DA=basicsalary*(15%100);
		System.out.println(DA);
		netsalary=(basicsalary+HRA+DA)-pf;
		System.out.println("basicsalary is : " + basicsalary +"\n" + " HRA: " + HRA  + "\n" + " DA: "+ DA + "\n" + "netsalary: " +netsalary);
		
		// TODO Auto-generated method stub

	}

}
