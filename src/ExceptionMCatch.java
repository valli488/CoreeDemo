
public class ExceptionMCatch {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		int result=0;
		int arr[]= new int[5];
		try {
			arr[0]=0;
			arr[1]=1;
			arr[2]=2;
			arr[3]=3;
			arr[4]=4;
			//arr[5]=5;
	result=num1/num2;
	System.out.println("Result of Division: " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("Err: Divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Err:divided by zero");
		}
		catch(Exception e)
		{
			e.printStackTrace();}
		}
		//O Auto-generated method stub

	}


