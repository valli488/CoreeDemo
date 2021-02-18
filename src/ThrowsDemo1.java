
public class ThrowsDemo1 {
	void Division () throws ArithmeticException
	{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("\n\tThe result is: " +rs);
	}

	public static void main(String[] args) {
		ThrowsDemo1 T=new ThrowsDemo1();
		try
		{
			T.Division();
		}
		catch(ArithmeticException Ex) {
			System.out.println("\n\t Erro :" +Ex.getMessage());
			
			
		}
		System.out.println("\n\t End of program");
		// TODO Auto-generated method stub

	}

}
